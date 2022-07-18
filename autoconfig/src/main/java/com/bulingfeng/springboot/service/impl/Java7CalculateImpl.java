package com.bulingfeng.springboot.service.impl;

import com.bulingfeng.springboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class Java7CalculateImpl implements CalculateService {
    @Override
    public int sum(Integer... values) {
        int sum=0;
        for (int i = 0; i < values.length; i++) {
            sum+=i;
        }
        return sum;
    }
}
