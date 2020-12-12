package com.wsk.accountbook.application.request.money;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@Component
public class MoneyFindRequest {
    private LocalDate startDate;
    private LocalDate endDate;
}
