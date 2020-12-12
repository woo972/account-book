package com.wsk.accountbook.domain.model.vo.money

import com.wsk.accountbook.domain.model.entity.Money
import com.wsk.accountbook.exception.NotEqualTypeException
import spock.lang.Specification

class MoneyTest extends Specification {
    Money sut = Money.of(0, Currency.KRW)

    def "test add"() {
        given:
        Money money = Money.of(ADD_AMOUNT, ADD_CURRENCY)
        when:
        Money result = sut.add(money)
        then:
        with(result) {
            RESULT_AMOUNT == result.getAmount()
            RESULT_CURRENCY == result.getCurrency()
        }
        where:
        ADD_AMOUNT | ADD_CURRENCY | RESULT_AMOUNT | RESULT_CURRENCY
        0          | Currency.KRW | 0    | Currency.KRW
        -100       | Currency.KRW | -100 | Currency.KRW
        100        | Currency.KRW | 100  | Currency.KRW
    }

    def "test add execption"() {
        given:
        Money money = Money.of(ADD_AMOUNT, ADD_CURRENCY)
        when:
        sut.add(money)
        then:
        thrown(NotEqualTypeException)
        where:
        ADD_AMOUNT | ADD_CURRENCY
        0          | Currency.USD
        -100       | Currency.USD
        100        | Currency.USD
    }
}
