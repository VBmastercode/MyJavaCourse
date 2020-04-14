import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> MyCollection = new ArrayList<Integer>(10);

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            MyCollection.add(rand.nextInt(30));
            System.out.println(i + " = " + MyCollection.get(i));
        }

        List<Integer> newCollection = new ArrayList();

        for (int i = 0; i < 10; i++) {
            if (MyCollection.get(i) > 5) {
                newCollection.add(MyCollection.get(i));
            }
        }

        System.out.println( "NewCollection");

        for (int i = 0; i < newCollection.size(); i++) {
            System.out.println(i + " = " + newCollection.get(i));
        }

        int z =0;

        while ( z < MyCollection.size()) {
            if (MyCollection.get(z) > 20) {
                MyCollection.remove(z);
                z--;
            }
            z++;
        }

        System.out.println( "MyCollection after removal items greater then 20");
        for (int i = 0; i < MyCollection.size(); i++) {
            System.out.println(i + " = " + MyCollection.get(i));
        }

        try {
            MyCollection.add(2,1);
            MyCollection.add(5,-4);
            MyCollection.add(8,-3);
        } catch (Exception e) {
            System.out.println( "insertion index is greater then bounds");
        }

        System.out.println( "MyCollection after inserting items");
        for (int i = 0; i < MyCollection.size(); i++) {
            System.out.println(i + " = " + MyCollection.get(i));
        }

        MyCollection.sort (Comparator.reverseOrder());

        System.out.println( "MyCollection after sorting items");
        for (int i = 0; i < MyCollection.size(); i++) {
            System.out.println(i + " = " + MyCollection.get(i));
        }

    }

}
