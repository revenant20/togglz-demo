package com.example.demo.service.impl;

import com.example.demo.Deal;
import com.example.demo.service.DealService;
import org.springframework.stereotype.Service;

@Service
public class FirstDealService implements DealService {
    @Override
    public Deal createDeal(String dealType) {
        return Deal.builder()
                .dealName("Very Important Deal")
                .build();
    }
}
