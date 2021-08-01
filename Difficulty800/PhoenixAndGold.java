/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty800;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class PhoenixAndGold {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int piece = sc.nextInt();
            int explode = sc.nextInt();

            ArrayList<Integer> gold = new ArrayList<>();
            while (piece-- > 0) {
                gold.add(sc.nextInt());
            }

            int index = 0;
            StringBuilder sb = new StringBuilder();

            if (gold.get(0) == explode && piece == 1) {
                System.out.println("NO");

            } else {

                while (index < piece) {
                    if (gold.get(index) == explode) {
                        index++;
                    } else {
                        sb.append(gold.get(index).toString());
                        sb.append(" ");
                        gold.remove(index);
                        index = 0;
                    }
                }

                System.out.println("YES");
                System.out.println(sb);
            }
        }

    }
}
