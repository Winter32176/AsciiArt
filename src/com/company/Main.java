package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width:");
        int width = scan.nextInt();
        System.out.println("Enter height:");
        int height = scan.nextInt();


        for (int m = 0; m < height; m++) {


            for (int z = 0; z < width; z++) {
                if (z == 0 || z == width - 1 ||m == 0 || m == height - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }



            }


            System.out.println();

        }


    }
}
