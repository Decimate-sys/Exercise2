//Yunis khamis, csci 1660, Mr. Killoran, 1/21/20

/*
Suppose the high temperature (in degrees Fahrenheit) for each of next week's
days are 45, 29, 10, 22, 41, 28, and 33 and the probability of precipitation for each
of the next five days is 95%, 60%, 25%, 5%, 0%, 75%, and 90%. Write a program using a loop
 that displays the day of the week if that day's high temperature is less than or equal to 32 and the probability
  of precipitation is greater than 50% (meaning it's likely to snow).
 */
package com.company.Khamis;

public class Main {

    public static void main(String[] args) {

        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] highTemperature = {45, 29, 10, 22, 41, 28, 33};
        int[] probabilityPrecipitation = {95, 60, 25, 5, 0, 75, 90};


        for (int i = 0; i < highTemperature.length; i++) {
            if (highTemperature[i] <= 32 && probabilityPrecipitation[i] > 50 ) {
                System.out.println("On " + dayOfWeek[i] + " the high temperature is "  + highTemperature[i] + " and the probability of precipitation is " + probabilityPrecipitation[i] + ".");
            }

        }


            }

        }