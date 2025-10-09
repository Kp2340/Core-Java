package collection;

import java.util.*;

import static statickeyword.staticImport.kp;

public class Collections {
    List<Integer> list = new ArrayList<>();
    LinkedList<Integer> list2 = new LinkedList<>();
    HashSet<Integer> set = new HashSet<>();
    LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
    Set<Integer> set3 = new TreeSet<>();
    Random random = new Random();

    public static void main(String[] args) {
        Collections c = new Collections();
        c.arrayListSpeed();
        c.linkedListSpeed();
        c.setOrder();
        c.iterator();
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
    public void setOrder(){
        System.out.print("Input: ");
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(100);
            System.out.print(" " + x);
            set.add(x);
            set2.add(x);
            set3.add(x);
        }
        kp("\nHashSet: " + set); // HashSet does not maintain order
        kp("LinkedHashSet: " + set2); // LinkedHashSet maintains insertion order
        kp("TreeSet: " + set3); // TreeSet sorts the elements
    }
    public void iterator(){
        Iterator<Integer> it = set.iterator();
        kp("Iterator with while: " + it);
        while (it.hasNext()){
            Integer i = it.next();
            System.out.print(" " + i);
        }
        kp("\nFor each loop: ");
        for (Integer i : set) {
            System.out.print(" " + i);
        }
    }
}
//Output:
//ArrayList Speed: 21
//LinkedList Speed: 18
//Input:  24 99 1 46 10 9 94 57 52 98 // Input Order
//HashSet: [1, 98, 99, 52, 24, 9, 57, 10, 46, 94] // Hash Order
//LinkedHashSet: [24, 99, 1, 46, 10, 9, 94, 57, 52, 98] // Insertion Order
//TreeSet: [1, 9, 10, 24, 46, 52, 57, 94, 98, 99] // Sorted Order
//Iterator with while: java.util.HashMap$KeyIterator@58372a00
// 96 82 99 83 36 57 90 43 94 95
//For each loop:
// 96 82 99 83 36 57 90 43 94 95