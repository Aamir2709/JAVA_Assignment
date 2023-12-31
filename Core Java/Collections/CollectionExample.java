import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        System.out.println("Creating CollectionExample object...");
        CollectionExamples collectionExamples = new CollectionExamples();

        System.out.println("\nList Examples:");
        System.out.println("Creating ListExamples object...");
        ListExamples listExamples = new ListExamples();

        System.out.println("\nSet Examples:");
        System.out.println("Creating SetExamples object...");
        SetExamples setExamples = new SetExamples();

        System.out.println("\nMap Examples:");
        System.out.println("Creating MapExamples object...");
        MapExamples mapExamples = new MapExamples();
    }
}

class CollectionExamples {
    CollectionExamples() {
        System.out.println("CollectionExamples object created.");
    }
}

class ListExamples {
    ListExamples() {
        System.out.println("ListExamples object created.");

        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        System.out.println("LinkedList: " + linkedList);

        // Vector
        List<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        System.out.println("Vector: " + vector);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
    }
}

class SetExamples {
    SetExamples() {
        System.out.println("SetExamples object created.");

        // HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        System.out.println("TreeSet: " + treeSet);
    }
}

class MapExamples {
    MapExamples() {
        System.out.println("MapExamples object created.");

        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "Python");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C++");
        treeMap.put(1, "Java");
        treeMap.put(2, "Python");
        System.out.println("TreeMap: " + treeMap);
    }
}
