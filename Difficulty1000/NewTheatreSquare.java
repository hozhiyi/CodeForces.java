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
public class NewTheatreSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();

            boolean xIsMin = false;

            if (2 * x < y) {
                xIsMin = true;
            }

            int cost = 0;

            for (int i = 0; i < n; i++) {
                boolean[] checked = new boolean[m];

                String input = sc.nextLine();
                char[] inputArr = input.toCharArray();

                if (m == 1) {
                    if (inputArr[0] == '.') {
                        cost += x;
                    }
                } else {
                    int j = 0;

                    while (!checked[m - 1] && j < m) {

                        if (inputArr[j] == '.') {

                            checked[j] = true;

                            if (j < m - 1) {
                                checked[j + 1] = true;

                                // two consecutive '.'
                                if (inputArr[j + 1] == '.') {

                                    // calculate the cost
                                    if (xIsMin) {
                                        cost += 2 * x;
                                    } else {
                                        cost += y;
                                    }

                                    j += 2;

                                } else {
                                    cost += x;
                                    j++;
                                }
                            } else {
                                cost += x;
                            }
                        } else {
                            j++;
                        }
                    }
                }
            }
            System.out.println(cost);
        }
    }
}
