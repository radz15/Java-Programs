import java.util.*;

public class list {
    public static void main(String[] args) {
        List <String> fruit = new ArrayList<>();  // initialize the list
        fruit.add("Apple");  //add element into the list
        fruit.add("Banana");
        fruit.add("Guava");
        fruit.add("Grapes");
        fruit.add("Muskmelon");
        fruit.add("Watermelon");
        fruit.add("Cherry");

        System.out.println(fruit);

        fruit.remove("Cherry"); // to remove an element from the list by object
        System.out.println(fruit);

        fruit.set(2,"Dragon fruit"); // update an element
        System.out.println(fruit);

        fruit.remove(1); // remove an element at index
        System.out.println(fruit);
        
        System.out.println(fruit.get(3)); // retrives value at index

        System.out.println(fruit.indexOf("Apple")); // Show the index of the object
        System.out.println(fruit.lastIndexOf("Dragon fruit")); // searches for the last occurrence of the specified object
        System.out.println("Is my list empty? "+fruit.isEmpty()); // checks if the list is empty or not
        System.out.println("Size of my list: "+fruit.size()); // size of the index
        fruit.clear(); // clears the list
        System.out.println("Is my list empty?"+fruit.isEmpty());
    }
}
