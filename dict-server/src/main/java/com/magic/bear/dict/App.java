package com.magic.bear.dict;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zxs
 * @date 2020/11/19 17:48
 * @desc
 */
@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "com.magic.bear.dict.dal.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        log.warn("==== dict-server launch success ====");
    }
}
