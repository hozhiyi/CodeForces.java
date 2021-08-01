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
public class Dragon230A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // Kirito's strength
        int n = sc.nextInt(); // number of cases
        boolean lose = false;
        int[][] sbArr = new int[n][2];

        for (int i = 0; i < n; i++) {
            sbArr[i][0] = sc.nextInt();
            sbArr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sbArr[i][0] > sbArr[j][0]) {
                    int tempi = sbArr[i][0];
                    int temp1 = sbArr[i][1];

                    sbArr[i][0] = sbArr[j][0];
                    sbArr[i][1] = sbArr[j][1];

                    sbArr[j][0] = tempi;
                    sbArr[j][1] = temp1;
                }
            }
        }

        int i = 0;
        while (!lose && i < n) {
            if (sbArr[i][0] >= s) {
                lose = true;
            } else {
                s += sbArr[i][1];
                i++;
            }
        }

        if (lose) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
