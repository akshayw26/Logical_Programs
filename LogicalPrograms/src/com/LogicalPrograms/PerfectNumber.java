package com.LogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        PerfectNumber perfect = new PerfectNumber();
        perfect.perfectNum();
    }

    void perfectNum(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        long num = sc.nextLong();

        int i = 1;
        int sum = 0;

         while(i <= num/2){

             if( num%i == 0){

                 sum = sum + i;
             }

             i++;
         }
         if(sum == num){
             System.out.println(num+ " --> Is a Perfect Number");
         }else{
             System.out.println((num+ "--> Is Not a Perfect Number" ));
         }
    }
}
