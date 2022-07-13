package com.bulingfeng.springboot.annotation;

import com.bulingfeng.springboot.config.HelloWorldConfig;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloWorldSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfig.class.getName()};
    }
}
