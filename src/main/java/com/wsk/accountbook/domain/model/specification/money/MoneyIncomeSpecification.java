package com.wsk.accountbook.domain.model.specification.money;

import com.wsk.accountbook.domain.model.vo.money.Amount;
import com.wsk.accountbook.domain.model.vo.money.Currency;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MoneyIncomeSpecification {

    public Map<Currency, Amount> getTotalOfIncomeGroupByCurrency(){
        return null;
    }

    public Map<Currency, Amount> getTotalOfExpenditureGroupByCurrency(){
        return null;
    }

    public Amount getTotalOfIncomeExchangingWith(){
        return null;
    }

    public Amount getTotalOfExpenditureExchangingWith(){
        return null;
    }
}
