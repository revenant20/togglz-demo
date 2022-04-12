package com.example.demo.service.impl;

import com.example.demo.Deal;
import com.example.demo.service.DealService;
import com.example.demo.service.ValidateDealService;
import com.example.demo.togglz.MyFeatures;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;

@Service
@RequiredArgsConstructor
public class DealServiceImpl implements DealService {

    private final FeatureManager manager;
    private final ValidateDealService service;

    @Override
    public Deal createDeal(String dealName) {
        Deal deal = Deal.builder()
                .dealName(dealName)
                .build();
        if (manager.isActive(MyFeatures.DEAL_VALIDATION)) {
            return service.validateDeal(deal);
        }
        return deal;
    }
}
