package ru.job4j.calculator.loop;

public class Factorial {
    public int calc(int n) {
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }
}
