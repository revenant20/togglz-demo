package com.example.demo.service.impl;

import com.example.demo.Application;
import com.example.demo.service.ApplicationService;
import com.example.demo.service.LotteryService;
import com.example.demo.togglz.MyFeatures;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService {

    private final FeatureManager manager;
    private final LotteryService service;

    @Override
    public String addApplication(String dealName) {
        Application application = Application.builder()
                .id(UUID.randomUUID().toString())
                .name(dealName)
                .build();
        if (manager.isActive(MyFeatures.LOTTERY)) {
            service.addToLottery(application);
        }
        return application.getId();
    }
}
