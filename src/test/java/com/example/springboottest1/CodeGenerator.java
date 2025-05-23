package com.example.springboottest1;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

import java.nio.file.Paths;
import java.util.Collections;

import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/test520?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC", "root", "102938")
                .globalConfig(builder -> builder
                        .author("Bruce")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("com.example.springboottest1")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                //        .xml("mapper.xml")
                                .pathInfo(
                                        Collections.singletonMap(
                                                OutputFile.xml,
                                                Paths.get(System.getProperty("user.dir")) + "/src/main/resources/mapper"
                                        )
                                )
                )
                .strategyConfig(builder -> builder
                        .entityBuilder()
                        .enableLombok()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}
