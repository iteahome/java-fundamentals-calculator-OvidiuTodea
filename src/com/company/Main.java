package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        int x = sc.nextInt();
        System.out.println("Second number : ");
        int y = sc. nextInt();
        System.out.println("Operation from:  +,-,/,* ");
        String o = sc.next();
        int rez=0;
        switch(o){
            case "+" : rez = x+y;
            break;
            case "-" : rez = x-y;
            break;
            case "*" : rez = x*y;
            break;
            case "/" : rez = x/y;
            break;
            default:
                System.out.println("Choose a valid operation");

        }
        System.out.println(rez);

    }
}
