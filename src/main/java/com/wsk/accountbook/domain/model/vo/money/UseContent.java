package com.wsk.accountbook.domain.model.vo.money;

public class UseContent {
    private String value;

    public static UseContent from(String value) {
        return new UseContent(value);
    }

    private UseContent(String value){
        if(value.length() > 50) throw new IllegalArgumentException("can't exceed length of 50");
        this.value = value;
    }
}
