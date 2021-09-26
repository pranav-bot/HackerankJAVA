package com.pranav;

import java.util.Scanner;

public class HackerankLoops1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 1;
        while(i!=11){
           int result = a*i;
            System.out.println(a + " x " + i +" = "+result );
           i++;


        }
    }
}
