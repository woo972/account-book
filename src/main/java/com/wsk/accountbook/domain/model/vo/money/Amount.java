package com.wsk.accountbook.domain.model.vo.money;


public class Amount {

    private static final double MAX_AMOUNT = 1000000000000d;
    private static final double MIN_AMOUNT = 0d;

    private double value;

    public static Amount from(double value) {
        return new Amount(value);
    }

    private Amount(double value){
        if(value > MAX_AMOUNT) throw new IllegalArgumentException("it exceed input capacity");
        if(value < MIN_AMOUNT) throw new IllegalArgumentException("it is lower than 0");
        this.value = value;
    }
}
