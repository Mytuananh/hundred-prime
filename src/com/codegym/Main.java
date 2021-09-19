package com.codegym;



public class Main {

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        int status = 1;
        for (int num = 0; num < 100 ; num++) {
            if (num < 2) {
                status = 0;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.print(num + ", ");
            }
            status = 1;
        }
    }
}
