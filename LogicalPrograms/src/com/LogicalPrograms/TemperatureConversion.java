package com.LogicalPrograms;

import java.util.*;

public class TemperatureConversion {

    public static void main(String[] args) {

        TemperatureConversion tc = new TemperatureConversion();
        tc.tempCon();
    }

    void tempCon(){

    double f;
    double c;

    Scanner sc=new Scanner(System.in);
		System.out.println("Choose type of conversion \n 1.Fahrenheit to celsius");
		System.out.println("Choose type of conversion \n 2.Celsius to Fahrenheit");

    int ch=sc.nextInt();
		switch(ch)
    {
        case 1:  System.out.println("Enter Fahrenheit temp");
            f=sc.nextDouble();
            c=(f-32)*5/9;
            System.out.println("Celsius temp is = "+c);
            break;
        case 2:  System.out.println("Enter celsius temp");
            c=sc.nextDouble();
            f=(c*9/5)+32;
            System.out.println("Fahrenheit temp is = "+f);
            break;
        default: System.out.println("Please choose valid choice");

       }
    }
}
