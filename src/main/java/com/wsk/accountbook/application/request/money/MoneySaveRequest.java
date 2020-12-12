package com.wsk.accountbook.application.request.money;

import com.wsk.accountbook.domain.model.entity.Money;
import com.wsk.accountbook.domain.model.vo.money.Amount;
import com.wsk.accountbook.domain.model.vo.money.Currency;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@Component
public class MoneySaveRequest {
    private double amount;
    private String currency;
    private String useType;
    private String useContent;
    private LocalDate occuringDate;

    public Money toEntity(){
        return Money
                .builder()
                .amount(Amount.from(amount))
                .currency(Currency.from(currency))
                .occuringDate(occuringDate)
                .build();
    }
}
