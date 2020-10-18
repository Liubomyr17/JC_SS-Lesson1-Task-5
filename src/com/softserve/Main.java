package com.softserve;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // three-digit integer;
        int a = 385;
        // check whether it is really a three-digit number and reduce the sum to zero;
        int result = a * 100, summa = 0;
        // while the number is greater than zero ...
        while(result > 0) {
            // select a digit from it and add to the sum of the digits
            summa += result % 10;
            // reduce by one digit
            result /= 10;
        }
        // display the result of the sum of the numbers
        System.out.println(summa);
}
}


