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
public class LettersRearranging1093B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {

            StringBuilder s = new StringBuilder(sc.nextLine());
            
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) > s.charAt(j)) {
                        char temp = s.charAt(i);
                        s.setCharAt(i, s.charAt(j));
                        s.setCharAt(j, temp);
                    }
                }
            }
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                System.out.println(-1);
            } else {
                System.out.println(s);
            }
        }
    }
}
