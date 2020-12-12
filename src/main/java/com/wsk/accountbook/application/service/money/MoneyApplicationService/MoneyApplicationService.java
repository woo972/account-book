package com.wsk.accountbook.application.service.money.MoneyApplicationService;

import com.wsk.accountbook.application.repository.MoneyRepository;
import com.wsk.accountbook.application.request.money.MoneyFindRequest;
import com.wsk.accountbook.application.request.money.MoneySaveRequest;
import com.wsk.accountbook.domain.model.entity.Money;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MoneyApplicationService {

    private final MoneyRepository moneyRepository;

    @Transactional
    public Long save(MoneySaveRequest moneySaveRequest){
        return moneyRepository.save(moneySaveRequest.toEntity()).getId();
    }



    @Transactional(readOnly = true)
    public Page<Money> findMoneyByRange(MoneyFindRequest moneyFindRequest, Pageable pageable) {
        return moneyRepository
                .findBetweenStartDateAndEndDate(
                        moneyFindRequest.getStartDate(),
                        moneyFindRequest.getEndDate(),
                        pageable)
                .orElseThrow(() -> new IllegalArgumentException("no object with these parameters"));
    }

    @Transactional(readOnly = true)
    public List<Map<String, Double>> getSimpleStatisticByRange(MoneyFindRequest moneyFindRequest) {
        return moneyRepository
                .getSimpleStatisticByRange(
                        moneyFindRequest.getStartDate(),
                        moneyFindRequest.getEndDate())
                .orElseThrow(() -> new IllegalArgumentException("no object with these parameters"));
    }
}
