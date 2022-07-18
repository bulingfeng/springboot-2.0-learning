package com.bulingfeng.springboot.annotation;

import com.bulingfeng.springboot.config.HelloWorldConfig;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 使用接口的方式来实现激活对应的bean，这种方式比使用注解的方式更加灵活
 */
public class HelloWorldSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfig.class.getName()};
    }
}
