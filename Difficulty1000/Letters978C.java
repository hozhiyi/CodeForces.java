/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty1000;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class Letters978C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long[] nArr = new long[(int) n];
        long[] mArr = new long[(int) m];

        // scan n inputs for num of rooms of each dorms
        for (int i = 0; i < nArr.length; i++) {

            nArr[i] = sc.nextLong();

            // sum up the rooms
            if (i > 0) {
                nArr[i] += nArr[i - 1];
            }
        }


        // scan m inputs for letters
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextLong();

            /*
            for (int j = 0; j < nArr.length; j++) {

                if (letter <= nArr[j] && j == 0) {
                    System.out.println(j + 1 + " " + letter);
                    break;
                } else if (letter <= nArr[j] && j > 0) {
                    System.out.println(j + 1 + " " + (letter - nArr[j - 1]));
                    break;
                }
            }
             */
        }
        int index = 1;
        int track = 0;
        
        while (index < nArr.length) {
            while (track < mArr.length && mArr[track] <= nArr[index]) {
                System.out.println(index + " " + (mArr[track] - nArr[index - 1]));
            }
            if (index <= nArr[index]) {
                System.out.println(index + " " + (letter - nArr[index - 1]));
                break;
            }
            index++;
        }
    }
}
