package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width:");
        int width = scan.nextInt();
        System.out.println("Enter height:");
        int height = scan.nextInt();
        System.out.println("Enter row:");
        int row = scan.nextInt();
        System.out.println("Enter colums:");
        int colums = scan.nextInt();


        for (int n = 0; n < row; n++) {


            for (int p = 0; p <colums; p++) {


            for (int m = 0; m < height * p; m++) {

                for (int z = 0; z < width * p; z++) {

                    if (z == width * p || z == width - (1 * p) || m == height*p || m == height - (1 * p)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }

                System.out.println();
            }

        }





            System.out.println("-");
        }

    }
}
