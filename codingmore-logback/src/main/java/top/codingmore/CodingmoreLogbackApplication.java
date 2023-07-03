package top.codingmore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 日志启动类
 */
@SpringBootApplication
public class CodingmoreLogbackApplication {

	/**
	 * 启动方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 启动
		SpringApplication.run(CodingmoreLogbackApplication.class, args);
	}

}
