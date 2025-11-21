package com.Qualifier.Annotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Qualifier.Annotation")
public class AppConfig {
}
