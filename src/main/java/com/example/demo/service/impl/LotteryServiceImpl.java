package com.example.demo.service.impl;

import com.example.demo.Application;
import com.example.demo.BadApplicationException;
import com.example.demo.Lottery;
import com.example.demo.service.LotteryService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class LotteryServiceImpl implements LotteryService {

    private final Map<String, Lottery> map = new HashMap<>();

    @Override
    public void addToLottery(Application application) {
        if (application.getId() == null || application.getName() == null) {
            throw new BadApplicationException();
        }
        map.put(application.getId(),
                Lottery.builder().id(UUID.randomUUID().toString()).build());
    }
}
