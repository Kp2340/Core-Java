package java_versions;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

interface Interf{
    public void add(int a, int b);
}
interface Interf2{
    public void getLength(String s);
}
interface Interf3{
    public void squareInt(int x);
}
public class JavaVersions8 {
//    String s="Java Version 1";
    public static void main(String[] args) {
        Interf i = (a,b) -> System.out.println(a+b);
//        i.add(15.3,26.3);  This shows error that arguments are not integer.
        i.add(17,28);
        i.add(100,200);

        Interf2 i2= s -> System.out.println(s.length());
        i2.getLength("hello");

        Interf3 i3 = a -> System.out.println(a*a);
        i3.squareInt(17);

        Runnable r = ()-> {for(int j2=0;j2<10;j2++) System.out.println("child thread");};
        Thread t1 = new Thread(r);
        t1.start();
        for(int j=0; j<10; j++){
            System.out.println("main thread");
        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,25,20,10,15));
        TreeSet<Integer> set = new TreeSet<>((k1, k2) -> (k1>k2) ? -1 : (k1<k2) ? 1 : 0);
        set.addAll(list);
        TreeMap<Integer, String> map = new TreeMap<>((k1, k2) -> (k1>k2) ? -1 : (k1<k2) ? 1 : 0);
        map.put(3, "3");
        map.put(1, "1");
        map.put(4, "4");
        map.put(2, "2");
        Collections.sort(list,(k1, k2) -> (k1>k2) ? -1 : (k1<k2) ? 1 : 0);
        System.out.println(list); //[25, 20, 15, 10, 5]
        System.out.println(set); //[25, 20, 15, 10, 5]
        System.out.println(map); //{4=4, 3=3, 2=2, 1=1}

        // Predicate of Integer
        Predicate<Integer> p1= i1 -> i1%2==0;
        System.out.println(p1.test(10)); //true
        System.out.println(p1.test(11)); //false

        // Predicate of String
        Predicate<String> p2 = s1 -> s1.length()>5;
        System.out.println(p2.test("HelloWorld")); //true
        System.out.println(p2.test("Hello")); //false

        // Predicate of Collection
        Predicate<Collection> p3 = c -> c.isEmpty();
        System.out.println(p3.test(new ArrayList())); //true
        System.out.println(p3.test(Arrays.asList(5,10,15))); //false

        Function<String, String> f1 = s4 -> s4.toUpperCase();
        System.out.println(f1.apply("hello")); //HELLO

        List<String> list2= Arrays.asList("apple", "banana", "cherry");
        System.out.println(list2.stream().reduce("", (s5, s6) -> s5 + s6.toUpperCase())); //APPLEBANANACHERRY
    }
}