import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {

//        request user input about the weather
        System.out.println("Describe the weather:");
        Scanner reader = new Scanner(System.in);
//        collect weather input
        String weather = reader.nextLine();

//        request user input about the average temperature
        System.out.println("What is the average temperature for today?");
        Scanner reader2 = new Scanner(System.in);
//        collect temperature input
        int temperature = Integer.parseInt(reader.nextLine());

//        output clothing suggestions:
//          if rainy & temperature < 12
//          if sunny & temperature > 20
//          if snowy & temperature < 0
//          if cloudy & temperature < 15


    }

}
