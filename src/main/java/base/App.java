package base;/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int age;
        String output;
        Scanner passIn = new Scanner(System.in);

        System.out.print("What is your age? ");
        age = passIn.nextInt();

        output = age > 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.print(output);

    }
}
