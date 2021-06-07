/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        String gender;
        Double bac;
        double genderRatio;
        int alc;
        int time;
        int weight;
        System.out.print("Are you a Male or a Female? ");
        gender = jb.next();
        System.out.print("What is your weight, in pounds? ");
        weight = jb.nextInt();
        if (gender.equals("male") || gender.equals("Male")){
            genderRatio =(0.73);
        }
        else{
            genderRatio =(0.66);
        }
        System.out.print("How many ounces of alcohol did you have? ");
        alc = jb.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        time = jb.nextInt();

        bac = ((alc*5.14)/(weight*genderRatio) - .015 * time);
        String jbBAC = String.format("%.2f", bac);
        if(bac >= .08){
            System.out.print("Your BAC is "+ jbBAC + "\n It is not legal for you to drive.");
        }
        else{
            System.out.print("Your BAC is "+ jbBAC + "\n It is legal for you to drive.");
        }

    }
}
