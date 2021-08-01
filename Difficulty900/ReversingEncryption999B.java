/* implementation
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty900;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class ReversingEncryption999B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder(sc.nextLine());

        ArrayList<Integer> d = new ArrayList<>();
        d.add(l);

        for (int i = l / 2; i > 1; i--) {
            if (l % i == 0) {
                d.add(i);
            }
        }

        for (int i = d.size() - 1; i >= 0; i--) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sb.substring(0, d.get(i)));
            sb2.reverse();
            sb2.append(sb.substring(d.get(i)));
            sb = sb2;
        }
        System.out.println(sb);
    }
}
