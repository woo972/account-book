package com.wsk.accountbook.application.service.money.MoneyApplicationService

import com.wsk.accountbook.application.repository.MoneyRepository
import com.wsk.accountbook.application.request.money.MoneySaveRequest
import com.wsk.accountbook.domain.model.entity.Money
import com.wsk.accountbook.domain.model.vo.money.Amount
import com.wsk.accountbook.domain.model.vo.money.Currency
import com.wsk.accountbook.domain.model.vo.money.UseType
import spock.lang.Specification

import java.time.LocalDate

class MoneyApplicationServiceTest extends Specification {

//    MoneyApplicationService moneyApplicationService
//    MoneyRepository moneyRepository = Mock()
//    Money money = Mock()
//    def setup(){
//        moneyApplicationService = new MoneyApplicationService(
//                moneyRepository: moneyRepository
//        )
//
//        money.getId() >> 0L
//        money.getAmount() >> Amount.from(0d)
//        money.getCurrency() >> Currency.from("KRW")
//        money.getUseType() >> UseType.from("INCOME")
//        money.getOccuringDate() >> LocalDate.now()
//
//        moneyRepository.save( )
//    }
//
//    def "test save"() {
//        given:
//        MoneySaveRequest moneySaveRequest = Mock()
//        moneySaveRequest.toEntity() >> money
//        when:
//        def rslt = moneyApplicationService.save(moneySaveRequest)
//        then:
//        0L == rslt.get
//    }
}

