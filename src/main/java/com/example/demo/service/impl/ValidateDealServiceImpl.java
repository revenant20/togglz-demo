package com.example.demo.service.impl;

import com.example.demo.BadDealException;
import com.example.demo.Deal;
import com.example.demo.service.ValidateDealService;
import org.springframework.stereotype.Service;

@Service
public class ValidateDealServiceImpl implements ValidateDealService {

    @Override
    public Deal validateDeal(Deal deal) {
        if (deal.getDealName() == null) {
            throw new BadDealException();
        }
        return deal;
    }
}
