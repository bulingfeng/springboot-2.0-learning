package com.bulingfeng.springboot.service.impl;

import com.bulingfeng.springboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Profile("java8")
@Service
public class Java8CalculateImpl implements CalculateService {
    @Override
    public int sum(Integer... values) {
        int sum=Stream.of(values).reduce(0,Integer::sum);
        return sum;
    }
}
