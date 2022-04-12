package com.example.demo.service.impl;

import com.example.demo.Deal;
import com.example.demo.service.DealService;
import org.springframework.stereotype.Service;

@Service
public class SecondDealService  implements DealService {
    @Override
    public Deal createDeal(String dealType) {
        return Deal.builder()
                .dealName("Deal with type" + dealType)
                .build();
    }
}
