package com.example.ana.rates;

public class Formula {
    public double compoundInterest(double principal, double rate, int years, int perYear){
        double amount = 0;
        rate /= 100;
        amount = principal*Math.pow((1+rate/perYear), perYear*years);
        return amount;
    }

    public double simpleInterest(double principal, double rate, int years){
        double amount = 0;
        rate /= 100;
        amount = principal*(1+rate*years);
        return amount;
    }
}
