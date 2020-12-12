package com.wsk.accountbook.controller;

import com.wsk.accountbook.application.request.money.MoneyFindRequest;
import com.wsk.accountbook.application.request.money.MoneySaveRequest;
import com.wsk.accountbook.application.request.user.UserSaveRequest;
import com.wsk.accountbook.application.service.money.MoneyApplicationService.MoneyApplicationService;
import com.wsk.accountbook.domain.model.entity.Money;
import com.wsk.accountbook.domain.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RequiredArgsConstructor
@RestController
public class MoneyController {

    private MoneyApplicationService moneyApplicationService;

    @PostMapping("/api/v1/money")
    public void save(@RequestBody MoneySaveRequest moneySaveRequest){
        moneyApplicationService.save(moneySaveRequest);
    }

    @PostMapping("/api/v1/money")
    public Page<Money> findMoneyByRange(@RequestBody MoneyFindRequest moneyFindRequest,
                                        @PageableDefault (page = 0, size = 5) Pageable pageable){
        return moneyApplicationService.findMoneyByRange(moneyFindRequest, pageable);
    }

//    @PutMapping("/api/v1/money/{id}")
//    public Page<Money> update(@PathVariable("id") Long id){
//        return moneyApplicationService.update(id);
//    }
//
//    @DeleteMapping("/api/v1/money/{id}")
//    public Page<Money> delete(@PathVariable("id") Long id){
//        return moneyApplicationService.delete(id);
//    }

    // TODO: 한번에 수정하기 구현
    // TODO: 한번에 삭제하기 구현




//    @PostMapping("/api/v1/user")
//    public Page<WeatherResponseDto> getWeather(@RequestBody SaveUserRequest saveUserRequest,
//                                               @PageableDefault (page = 0, size = 5)
////                                               @SortDefault.SortDefaults({
////                                                       @SortDefault(sort = "date", direction = Sort.Direction.ASC),
////                                                       @SortDefault(sort = "location", direction = Sort.Direction.ASC)
////                                               })
//                                                       Pageable pageable){
//        return weatherService.getWeather(saveUserRequest, pageable);

//    }
}
