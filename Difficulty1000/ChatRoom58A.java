import java.util.Scanner;

public class ChatRoom58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] c = str.toCharArray();

        // check if there is 'h'
        int index = -1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'h') {
                index = i;
                break;
            }
        }
        if (index >= 0 && index < str.length() - 1) { // there's 'h' but it cant be at the last index
            str = str.substring(index, str.length()); // make a substring w/out h and previous characters
            c = str.toCharArray(); // convert new string into char arr again

            // check if there is 'e'
            index = -1;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'e') {
                    index = i;
                    break;
                }
            }
            if (index >= 0 && index < str.length() - 1) {
                str = str.substring(index + 1, str.length());
                c = str.toCharArray();

                // check if there is 'l'
                index = -1;
                for (int i = 0; i < c.length; i++) {
                    if (c[i] == 'l') {
                        index = i;
                        break;
                    }
                }
                if (index >= 0 && index < str.length() - 1) {
                    str = str.substring(index + 1, str.length());
                    c = str.toCharArray();

                    // check if there is 'l' again, the 2nd 'l'
                    index = -1;
                    for (int i = 0; i < c.length; i++) {
                        if (c[i] == 'l') {
                            index = i;
                            break;
                        }
                    }
                    if (index >= 0 && index < str.length() - 1) {
                        str = str.substring(index + 1, str.length());
                        c = str.toCharArray();

                        // check if there is o
                        index = -1;
                        for (int i = 0; i < c.length; i++) {
                            if (c[i] == 'o') {
                                index = i;
                                break;
                            }
                        }
                        if (index >= 0) { // in this case index of 'o' can be the last index
                            str = str.substring(index + 1, str.length());
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
