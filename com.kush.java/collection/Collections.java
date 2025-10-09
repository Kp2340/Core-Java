package collection;

import java.util.*;

import static statickeyword.staticImport.kp;

public class Collections {
    List<Integer> list = new ArrayList<>();
    LinkedList<Integer> list2 = new LinkedList<>();
    HashSet<Integer> set = new HashSet<>();
    LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
    Random random = new Random();

    public static void main(String[] args) {
        Collections c = new Collections();
        c.arrayListSpeed();
        c.linkedListSpeed();
        c.hashSetOrder();
    }
    public void arrayListSpeed() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt(100));
        }
        kp("ArrayList Speed: " + (System.currentTimeMillis() - start));
    }
    public void linkedListSpeed() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(random.nextInt(100));
        }
        kp("LinkedList Speed: " +(System.currentTimeMillis() - start));
    }
    public void hashSetOrder(){
        System.out.print("Input: ");
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(100);
            System.out.print(" " + x);
            set.add(x);
            set2.add(x);
        }
        kp("\nHashSet: " + set); // HashSet does not maintain order
        kp("LinkedHashSet: " + set2); // LinkedHashSet maintains insertion order
    }
}
//Output:
//ArrayList Speed: 22
//LinkedList Speed: 17
//Input:
// 28 2 53 57 86 32 94 72 23 67
// HashSet: [32, 2, 67, 53, 86, 23, 72, 57, 28, 94]
//LinkedHashSet: [28, 2, 53, 57, 86, 32, 94, 72, 23, 67]