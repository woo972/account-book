package com.wsk.accountbook.domain.model.vo.money;

import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
public enum UseType {
    INCOME("INCOME"),
    EXPENDITURE("EXPENDITURE"),
    ;
    private String value;

    UseType(String value){
        this.value = value;
    }

    public static UseType from (String value){
        if(StringUtils.isEmpty(value)) throw new IllegalArgumentException("it is empty useType input");
        for (UseType useType : UseType.values()){
            if(useType.getValue().equals(value)) return useType;
        }
        throw new IllegalArgumentException("it is not supported useType");
    }
}
