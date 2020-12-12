package com.wsk.accountbook.domain.service.money;

import com.wsk.accountbook.application.request.money.MoneyFindRequest;
import com.wsk.accountbook.application.service.money.MoneyApplicationService.MoneyApplicationService;
import com.wsk.accountbook.domain.model.entity.Money;
import com.wsk.accountbook.domain.model.vo.money.UseType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MoneyService {

    private final MoneyApplicationService moneyApplicationService;

    // TODO: 통계데이터는 Repository에서 직접 query한다. 추후 간단한 통계는 자바영역으로 가져오기

    public double getSimpleStatisticByRange(MoneyFindRequest moneyfindRequest){
        List<Map<String, Double>> simpleStatisticByRange = moneyApplicationService.getSimpleStatisticByRange(moneyfindRequest);
        return 0d;
    }
}
