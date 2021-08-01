/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty900;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class Twins160 {

    // greedy, sortings
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numGiven = sc.nextInt();

        sc.nextLine();
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        int[] value = new int[strSplit.length];

        for (int i = 0; i < strSplit.length; i++) {
            value[i] = Integer.parseInt(strSplit[i]);
        }

        Arrays.sort(value);

        int numCurrent = 0;

        for (int i = value.length - 1; i >= 0; i--) {
            int sumPrev = 0;
            int sumAft = 0;
            numCurrent++;

            for (int j = 0; j < i; j++) {
                sumPrev += value[j];
            }

            for (int j = i; j < value.length; j++) {
                sumAft += value[j];
            }

            if (sumPrev < sumAft) {
                break;
            }
        }
        System.out.println(numCurrent);

    }
}
