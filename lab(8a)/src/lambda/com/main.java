package lambda.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("pine apple");
        stringList.add("mango");
        stringList.add("strawberry");

       
        Collections.sort(stringList, (s1, s2) -> s2.compareTo(s1));

        
        System.out.println("Sorted List in Descending Order:");
        stringList.forEach(System.out::println);
    }
}