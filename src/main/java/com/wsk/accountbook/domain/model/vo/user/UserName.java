package com.wsk.accountbook.domain.model.vo.user;

import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
public class UserName {
    private final String value;

    public static UserName from(String value){
        return new UserName(value);
    }

    public UserName(String value) {
        validate(value);
        this.value =  value;
    }

    private void validate(String value){
        if(StringUtils.isEmpty(value)) throw new IllegalArgumentException("name is too short");
//        if(value.length() < 3) throw new IllegalArgumentException("name is too short");
        if(value.length() > 10) throw new IllegalArgumentException("name is too long");
        if(!isSupportedValue()) throw new IllegalArgumentException("used unsupported characters");
    }

    private boolean isSupportedValue() {
        // blank
        // 특수문자
        //
        return true;
    }
}
