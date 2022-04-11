package com.example.demo;

import com.example.demo.service.DealService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DealController {

    private final DealService dealService;

    @PostMapping("/deal")
    public Deal createDeal(@RequestBody String dealName) {
        return dealService.createDeal(dealName);
    }
}
