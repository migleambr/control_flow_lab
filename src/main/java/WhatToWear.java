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
        if (weather.equals("Rainy") && temperature < 12) {
            System.out.println("Wear a waterproof coat");
            // if sunny & temperature > 20
        } else if (weather.equals("Sunny") && temperature >= 20) {
            System.out.println("Wear a hat");
            // if snowy & temperature < 0
        } else if (weather.equals("Snowy") && temperature =< 0) {
            System.out.println("Wear winter boots");
            // if cloudy & temperature < 15
        } else if (weather.equals("Cloudy") && temperature =< 15) {
            System.out.println("Wear a jumper");
        } else {
            System.out.println("Sorry, please provide a different weather description!");
        }

    }

}
