package top.codingmore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Swagger测试类
 */
@Api(tags = "测试 Swagger")
@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    @ApiOperation("测试")
    @RequestMapping("/test")
    public String test() {
        return "沉默王二又帅又丑";
    }
}
