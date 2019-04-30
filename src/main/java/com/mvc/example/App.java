package com.mvc.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication 	//指定该类是一spring boot的应用程序
@ServletComponentScan

//指定数据访问层借口的包名
@MapperScan("com.mvc.example.repository")
public class App extends SpringBootServletInitializer{

	
	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);	//直接调用静态run方法，启动spring应用
		
	}
	
	@Override						//为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

}
