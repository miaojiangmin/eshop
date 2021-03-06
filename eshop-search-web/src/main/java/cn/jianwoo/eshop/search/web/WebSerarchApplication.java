package cn.jianwoo.eshop.search.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@EnableDubbo
@SpringBootApplication
@ImportResource(value="classpath:consumer.xml")
@MapperScan(value ="cn.jianwoo.eshop.manage.mapper" )
public class WebSerarchApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSerarchApplication.class,args);
    }
}
