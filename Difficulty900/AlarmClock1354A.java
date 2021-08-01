/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty900;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class AlarmClock1354A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();
        long[][] testArr = new long[numTest][4];

        for (int i = 0; i < numTest; i++) {
            for (int j = 0; j < 4; j++) {
                testArr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numTest; i++) {
            long a = testArr[i][0];
            long b = testArr[i][1];
            long c = testArr[i][2];
            long d = testArr[i][3];
            int sleepTime = 0;
            int counter = 0;

            if (a > b) {
                sleepTime += b;
                sleepTime += (c - d);
                counter++;
                while (sleepTime < a) {
                    sleepTime += (c - d);
                    counter++;
                }
                System.out.println(b + counter * c);

            } else if (a < b && c < d) {
                System.out.println(b);
            } else if (a > b && c < d) {
                System.out.println("-1");
            }
        }
    }

}
