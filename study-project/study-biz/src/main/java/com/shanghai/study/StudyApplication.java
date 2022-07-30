package com.shanghai.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @className: StudyApplication
 * @author: qyj
 * @date: 2022/7/19
 **/
@SpringBootApplication
@MapperScan("com.shanghai.study.mapper")
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class,args);
    }
}
