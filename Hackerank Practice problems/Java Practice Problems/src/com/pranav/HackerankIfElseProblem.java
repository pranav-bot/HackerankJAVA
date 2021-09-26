package com.pranav;


import java.util.Scanner;

public class HackerankIfElseProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String result;
        if (a%2==0){
            result="Not Weird";
            if(a%2==0 && a>=2 && a<=5){
                result="Not Weird";
            }
            else{
                result = "Weird";
            }
            if((a%2==0 && a>=6 && a<=20)){
                result="Weird";
            }
            else{
                result="Not Weird";
            }
        }
        else{
            result="Weird";
        }
        System.out.println(result);

    }
}



