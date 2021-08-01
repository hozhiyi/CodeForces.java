import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class YetAnotherCardDeck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int q = sc.nextInt();

        //ArrayList<Integer> n = new ArrayList<>();
        LinkedList<Integer> n = new LinkedList<>();

        for (int i = 0; i < l; i++) {
            n.add(sc.nextInt());
        }

        //int counter = 1;
        for (int i = 0; i < q; i++) {
            int target = sc.nextInt();
            int index = n.indexOf(target);
            System.out.print(index + 1 + " ");
            n.addFirst(n.remove(index));
            //n.remove(index);
            //counter++;
            //n.add(0, target);
        }
    }
}
