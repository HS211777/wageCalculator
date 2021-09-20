package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    final int maxHours = 45;
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> hoursWorked = new ArrayList<>();
    ArrayList<Double> wage = new ArrayList<>();
    System.out.println("how many employees do you have?");
    int numEmploy = input.nextInt();
    int i;
    for (i = 0; i < numEmploy; i++){
        System.out.println("Enter employee name:");
        names.add(input.next());
        System.out.println("Enter how many full hours they worked:");
        hoursWorked.add(input.nextInt());
        System.out.println("Enter their hourly wage:");
        wage.add(input.nextDouble());
    }
    ArrayList<Double> earnings = new ArrayList<>();
    ArrayList<Double> afterTax = new ArrayList<>();
    for (i = 0; i < numEmploy; i++){
        if (hoursWorked.get(i) > maxHours){
            int overtime = hoursWorked.get(i) - maxHours;
            earnings.add((maxHours*wage.get(i))+(overtime*wage.get(i)*1.5));
        }
        else{
            earnings.add(hoursWorked.get(i)*wage.get(i));
        }
        afterTax.add(earnings.get(i)*0.8);
    }
    System.out.println(names);
    System.out.println(earnings);
    System.out.println(afterTax);


    }
}
