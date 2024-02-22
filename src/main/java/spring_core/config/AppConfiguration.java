package spring_core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses ="spring_core.config")
@PropertySource("classpath:application.properties")


public class AppConfiguration {
}
