package com.example.demo;

import com.example.demo.service.impl.FirstDealService;
import com.example.demo.service.impl.SecondDealService;
import com.example.demo.togglz.MyFeatures;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DealController {

    private final FirstDealService dealService;
    private final SecondDealService secondDealService;

    private final FeatureManager manager;

    @PostMapping("/deal")
    public Deal createDeal(@RequestBody DealRequest dealName) {
        if (manager.isActive(MyFeatures.FEATURE_ONE)) {
            return secondDealService.createDeal(dealName.getDealName());
        } else {
            return dealService.createDeal(dealName.getDealName());
        }
    }
}
