package com.bulingfeng.springboot.annotation;

import com.bulingfeng.springboot.config.HelloWorldConfig;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Import(value = {HelloWorldConfig.class})
public @interface EnableHelloWorld {
    String value() default "";
}
