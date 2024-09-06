import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Box<T> {
  private T value;

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public static void main(String[] args) {
    // T -> String
    Box<String> stringBox = new Box<>();

    // T -> Integer
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(3); // 3 is Integer
    // integerBox.setValue("abc");

    // Map<K, V>
    Map<String, Integer> integerMap = new HashMap<>();

    // List is same as List<Object>
    List list = new ArrayList<String>();
    list.add("abc");
    list.add(123);
    System.out.println(list);

    list = new ArrayList<Integer>(); // runtime JVM -> new ArrayList<Object>();
    list.add("abc");
    list.add(123);
    System.out.println(list);

    // You cannot use charAt() after get()
    // System.out.println(list.get(0).charAt());
    System.out.println(((String) list.get(0)).charAt(1)); // b

    Object[] objects = new Integer[3];
    objects[0] = 100;
    objects = new String[3];
    // objects[0] = 100; // java.lang.ArrayStoreException

    // After Java 1.5
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    System.out.println(strings.get(0).charAt(1));

  }
}
