package com.LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
         PrimeNumber prime = new PrimeNumber();
         prime.primeNum();
    }

       public void primeNum(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nunmber : " );

        int num = sc.nextInt();
        int prime = 0;

        for (int i = 1; i <=num ; i++) {

            if(num % 2 == 0){

                prime++;
            }
        }
           if(prime == 0){
               System.out.println(prime+ " --> is a Prime Number");
           }else{
               System.out.println(prime+ " --> is not a Prime Number");
           }
    }

}
