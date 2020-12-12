package com.wsk.accountbook.domain.model.vo.money;

import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
public enum Currency {
    KRW("한국", "KRW"),
    USD("미국", "USD");

    private final String countryName;
    private final String currencyCode;

    Currency(String countryName, String currencyCode) {
        this.countryName = countryName;
        this.currencyCode = currencyCode;
    }

    // valueOf 사용시 일치 하는 값이 없으면 exception 발생하므로 별도 처리함
    public static Currency from(String value){
        if(StringUtils.isEmpty(value)) throw new IllegalArgumentException("it is empty currency input");
        for (Currency currency : Currency.values()){
            if(currency.getCurrencyCode().equals(value)) return currency;
        }
        throw new IllegalArgumentException("it is not supported currency");
    }
}
