package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++){
            System.out.println("Умножение на:" + i);
            for (int x = 1; x < 11; ++x){
                System.out.println(x + "*"+ i + "=" +x*i);
            }
        }
    }
}
