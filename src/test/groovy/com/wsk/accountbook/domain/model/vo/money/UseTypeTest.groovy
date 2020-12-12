package com.wsk.accountbook.domain.model.vo.money

import org.apache.commons.lang3.StringUtils
import spock.lang.Specification

class UseTypeTest extends Specification {
    def "test get useType from value"(){
        expect:
        EXPECTED_USETYPE == UseType.from(INPUT)
        where:
        INPUT | EXPECTED_USETYPE
        "INCOME" | UseType.INCOME
        "EXPENDITURE" | UseType.EXPENDITURE
    }

    def "test get useType from value exception"(){
        when:
        UseType.from(INPUT)
        then:
        thrown(IllegalArgumentException)
        where:
        INPUT << [null, StringUtils.EMPTY, "AAA"]
    }

}
