package com.Annotation.ComponentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Annotation.ComponentScan")
public class AppConfig {
}
