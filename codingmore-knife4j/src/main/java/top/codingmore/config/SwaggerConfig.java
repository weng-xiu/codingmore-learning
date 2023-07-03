package top.codingmore.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spring.web.plugins.WebFluxRequestHandlerProvider;
import springfox.documentation.spring.web.plugins.WebMvcRequestHandlerProvider;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Swagger配置类
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    /**
     * 配置swagger
     * @return
     */
    @Bean
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.OAS_30) // 指定api类型为OAS_30
                .apiInfo(apiInfo()).enable(true) // 配置Swagger信息 = apiInfo
                .select()  // 选择swagger具体生效的接口是什么
                //apis： 添加swagger接口提取范围
                .apis(RequestHandlerSelectors.basePackage("top.codingmore")) // 指定扫描的包
                .paths(PathSelectors.any()) // 所有路径都扫描
                .build(); // 创建Docket实例

        return docket;
    }

    /**
     * 配置swagger信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("编程猫实战项目笔记") // 标题
                .description("编程喵是一个 Spring Boot+Vue 的前后端分离项目") // 描述信息
                .contact(new Contact("沉默王二", "https://codingmore.top","www.qing_gee@163.com"))
                .version("v1.0") // 版本
                .build(); // 创建ApiInfo实例
    }

    /**
     * 解决Springfox和Knife4j冲突的问题
     * @return
     */
    @Bean
    public static BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return new BeanPostProcessor() {

            /**
             * 在bean初始化之前执行
             * @param bean
             * @param beanName
             * @return
             * @throws BeansException
             */
            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                if (bean instanceof WebMvcRequestHandlerProvider || bean instanceof WebFluxRequestHandlerProvider) { // 判断是否是WebMvcRequestHandlerProvider或者WebFluxRequestHandlerProvider
                    customizeSpringfoxHandlerMappings(getHandlerMappings(bean));
                }
                return bean;
            }

            /**
             * 解决Springfox和Knife4j冲突的问题
             * @param mappings
             */
            private <T extends RequestMappingInfoHandlerMapping> void customizeSpringfoxHandlerMappings(List<T> mappings) {
                List<T> copy = mappings.stream() // 过滤掉RequestMappingInfoHandlerMapping
                        .filter(mapping -> mapping.getPatternParser() == null) // 过滤掉RequestMappingInfoHandlerMapping
                        .collect(Collectors.toList()); // 收集
                mappings.clear(); // 清空
                mappings.addAll(copy); // 添加
            }

            /**
             * 获取handlerMappings
             * @param bean
             * @return
             */
            @SuppressWarnings("unchecked")
            private List<RequestMappingInfoHandlerMapping> getHandlerMappings(Object bean) {
                try {
                    Field field = ReflectionUtils.findField(bean.getClass(), "handlerMappings"); // 获取handlerMappings字段
                    field.setAccessible(true); // 设置可访问
                    return (List<RequestMappingInfoHandlerMapping>) field.get(bean); // 获取handlerMappings字段的值
                } catch (IllegalArgumentException | IllegalAccessException e) { // 异常
                    throw new IllegalStateException(e); // 抛出异常
                }
            }
        };
    }
}