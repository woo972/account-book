package com.wsk.accountbook.domain.model.entity;

import com.wsk.accountbook.domain.BaseTimeEntity;
import com.wsk.accountbook.domain.model.vo.money.Amount;
import com.wsk.accountbook.domain.model.vo.money.Currency;
import com.wsk.accountbook.domain.model.vo.money.UseContent;
import com.wsk.accountbook.domain.model.vo.money.UseType;
import lombok.*;
import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Money extends BaseTimeEntity {

    private Long id;
    private Amount amount;
    private Currency currency;
    private UseType useType;
    private UseContent useContent;
    private LocalDate occuringDate; // 추후 날짜 범위 제한

//    private Category


//    public static Money of(double amount, CURRENCY currency, MON){
//        return new Money(amount, currency);
//    }

    // 직접 돈을 더하는 경우는 없고
    // 모든 돈이 sum 되는 경우만 있을 듯 함
    // 이 경우에는 화폐 단위가 달라도 환산해서 보여주거나...
    // 각각 더해서 보여주거나?  -> MoneyService로 빼야할 듯함
//    public Money add(Money money) throws NotEqualTypeException{
//        if (this.currency != money.currency) {
//            throw new NotEqualTypeException("not equal currency");
//        }
//
//        return new Money(this.amount + money.getAmount(), this.currency);
//    }

    // 완진히 새로운 객체로 대체한다
    public Money update(Money money) {
        return money;
    }

    private Money(Amount amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }
}
