package com.wsk.accountbook.domain.model.vo.money

import org.apache.commons.lang3.StringUtils
import spock.lang.Specification

class CurrencyTest extends Specification {
    def "test get currency from value"(){
        expect:
        EXPECTED_CURRENCY == Currency.from(INPUT)
        where:
        INPUT | EXPECTED_CURRENCY
        "KRW" | Currency.KRW
        "USD" | Currency.USD
    }

    def "test get currency from value exception"(){
        when:
        Currency.from(INPUT)
        then:
        thrown(IllegalArgumentException)
        where:
        INPUT << [null, StringUtils.EMPTY, "AAA"]
    }
}
