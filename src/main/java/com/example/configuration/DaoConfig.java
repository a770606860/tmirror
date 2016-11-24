package com.example.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by 77060 on 2016/11/17.
 */
@Configuration
@ImportResource("classpath:daoConfig.xml")
public class DaoConfig {
//    @Bean
//    MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBasePackage("com.example");
//        return mapperScannerConfigurer;
//    }
}
