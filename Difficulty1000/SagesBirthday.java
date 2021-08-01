/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class SagesBirthday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] num = new int[t];

        for (int i = 0; i < t; i++) {
            num[i] = sc.nextInt();
        }

        if (t < 3) {
            System.out.println(0);

            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }

        } else {

            ArrayList<Integer> numA = new ArrayList<>();
            int k;
            if (t % 2 == 0) {
                k = t / 2 - 1;
            } else {
                k = (int) Math.floor(t / 2);
            }
            Arrays.sort(num);

            int j = 0;
            for (int i = k; i < t; i++) {
                numA.add(num[i]);

                if (j < k) {
                    numA.add(num[j]);
                    j++;
                }
            }

            System.out.println(k);
            for (int i = 0; i < numA.size(); i++) {
                System.out.print(numA.get(i) + " ");
            }
        }
    }
}
