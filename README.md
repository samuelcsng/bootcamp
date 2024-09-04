# bootcamps
***
## Week-1 Day-1 20240805
- Installation

***
## Week-1 Day-2 20240806
- Primitives (int, double ...)
  - Higher/Lower level types (long > int > short > byte) (double > float)
  - Math Operation
  - Comparison Operators

- String
  - equals(), length(), charAt()
  - If-else

- reference
https://javahongkong.larksuite.com/wiki/NPWBwykCCivujTk1WHiuyzAosnh
    // ***** VIP *****
    // Primitives:
    // byte, short, int, long
    // float, double
    // char
    // boolean
    // ***** VIP *****

- to upgrade the data type, use (higherType) variable

- git command:
    // gitBash under the folder: /c/github/org/bootcamp 
    // git status
    // git add .
    // git commit -m "2024.08.06"
    // git push

***
## Week-1 Day-3 20240807
- for ALL non-primitive types:
  - DO NOT use "==" 
  - ALWAYS use .equals()

- ***
- use "Monday".equals(day) instead of 
- day.equals("Monday")
- note: the variable day may be null

- String methods
  - String.contains() -> boolean
  - special character: # ! @ $

- java.util.Scanner

- switch, break
  - need special precaution on using "break;"
  - default:
  



***
## Week-1 Day-4 20240808

- for loop
- for loop with break
- for loop with continue

- String.indexOf('j')
- String.endsWith()
- String.startsWith()
- String.substring()

- System.out.println() // print + next line
- System.out.print() // print + next position



***
## Week-1 Day-5 20240809

- Infinite Loop
- labeled Break
- continue, labeled continue

- Array
- byte[], short[], int[], long[] 
- float[], double[]
- boolean[]
- char[]
- String[]

- String[].length vs String.length()

- String[] arrName = new String[] {"abc", "def", "ijk"};
- String[] arrName = {"abc", "def", "ijk"};

- arr[idx++] = values[i]; // common in for loop
- Arrays.toString(arrayName); // to print out array

- array swap elements

***
## Week-2 Day-1 20240812
- git init (from local machine)

- Memory(Cache)
  - Stack Memory
  - Heap Memory

- bubble sort

- 2D array

- ASCII code
  - 0 -> 48
  - A -> 65
  - a -> 97

- byte -> short -> int -> long -> float -> double
-          char -> int -> long -> float -> double

- downcasting, explicit type conversion
- double->int (precision loss)



***
## Week-2 Day-2 20240813

- Class
- Wrapper Class
- object reference (stores object address)
- 8 primitives + 8 wrapper classes + String
- auto-boxing and unboxing
- .compareTo()
- Character.charValue()

- String methods
  - indexOf()
  - lastIndexOf()
  - concat()
  - startsWith()
  - endsWith()
  - compareTo()
  - ...

- down casting
  - (int) longNumber;

- Array insertion sort

- Arrays.copyOf()

- object reference
- Pass by reference vs Pass by value
- RULE OF THUMB:
  - 8 Primitives + 8 Wrapper Classes + String -> Pass by value
  - Other than that -> Pass by reference



  - Static Methods

```java
    public class ABC {
      // main method
      public static void main(String[] args) {
        calculateCircleArea(3.0);
      }

      // customer method
      public static double calculateCircleArea(double radius){
        return ...:
      }
    }
```






***
## Week-2 Day-3 20240814

- Static Method (public static)
- Instance Method

- Method Signature = Method Name + Number of Parameters & Type of Parameters


- while loop

- random number

- for-each loop

- java -->> coding velocity, code readability





***
## Week-2 Day-4 20240815

- array[idx++] = ... // access and than increment idx

- class object

- class
  - blueprint
  - private attributes
  - getXXX(), setXXX(), instance methods (object methods)
  - Presentation
  - constructor
  - empty constructor implicitly exists
  - constructor signature






***
## Week-2 Day-5 20240816

- all-arg constructor
- empty constructor
- instance methods:
  - to create new
  - to modify 
  - to transform

- Math. method

- BigDecimal (double)
  - BigDecimal.divide()
  - BigDecimal.valueOf()
  - .equals()
  - .compareTo()


- reference trap
- copy constructor
- Mutable Object 
  - object with setters -> reference trap -> solution: "copy constructor"
  - RULE OF THUMB: avoid setting variables equal to each other -> both variables will share a reference to the same object
  - (in Java) Arrays are Mutable Objects -> Arrays.copyOf(object, object.length)
  - bug fixing: constructor, copy constructor, getter, setter
- overriding object.toString() method
- deep copy constructor
- deep copying:
  - duplicate an object
  - protects the internal state of an object(or class) from external modification
  - prevent exposing the internal state of the object)


***
## Week-3 Day-1 20240819

- double * double -> always use BigDecimal
- instance method
  - presentation (derived)
  - transform (replace, add, remove)

- static (stack memory)
- static method vs instance method
- static method can NEVER return instance variable
- className.method // only return static, not attributes



***
## Week-3 Day-2 20240820

- private static

- Summary (static vs instance)
  // Static method return instance variable (NOT OK)
  // Instance method return instance variable (OK)
  // Static method return static variable (OK)
  // Instance method return static variable (OK)

    // static method, static variable, static class do not belongs to object
  // so static stuff can be written to any class technically

- Early return
- Constant: static final
- instance variable (for object)
- static variable (for class)
- static final variable (for class but cannot be modified)

- Class.valueOf() vs static Class.ofValue method


- // Constant(private static final)
  // static variable
  // instance variable
  // 
)

----
public class ClassName {

- constant (public/private static final ...) (keyword: private static final type CONSTANT_NAME = ...)
- static variable (public static ...) (keyword: static)
- instance variable (private type varName ...)

- public method vs static method (keyword: public/private static)

- public constructor vs private constructor
  - public ClassName(...){} // public constructor
  - private ClassName(...){} // private constructor
- public static ClassName methodName(...) {return new ClassName(...)} // use public static method to call the private constructor to create object

- instance method: public returnType method(...){} // common practice, have this. keyword

}
----

***
## Week-3 Day-3 20240821

- StringBuilder
  ````java
  StringBuilder sb = new StringBuilder(""); // String sb = "";
  sb.append()
  ````

- Constant -> just `public`, no need `private`
  - static final -> should be public
  - final

// VIP
- 4 key variables:
  - static final (CONSTANT)
  - static (belong to Class, not object)
  - final (w/o `static`, belongs to object(not Class->use this._), cannot be changed)
  - instance variable (non-static, not final, common concept)
- static method
// VIP

- new Object[0]; // !!! initialize empty array

- .toSting()

- StringBuilder()
- System.currentTimeMillis()





***
## Week-3 Day-4 20240822

- Considerations before coding:
  - velocity(coding, running and ...)
  - readability
  - flexibility
  - debug

- BigDecimal
  - use BigDecimal.valueOf(0.1)
  - new BigDecimal("0.1")

- LocalDate
  - .equals(DayOfWeek(5))

- LocalDate, String, BigDecimal -> immutable
  -// "Immutable" -> the object has no method to revise itself

- Pool - Internal Cache
  - for String, Integer(), ...

- scanner.nextline();






***
## Week-3 Day-5 20240823

- new README.md file

- HackMD usage (cap graphics)
- vs code extension install "Markdown All in One"

- enum
  - public enum ClassName{}
  - enum.values() method

- by entering main()
    // Load classes to Memory
    // enum -> create objects for enum
    // static/ static final
    // start to read your code in main method



***
## Week-4 Day-1 20240826

- int is NOT SUITABLE for switch design...

- enum
  - prefer to use "==", instead of .equals()
  - .valueOf()
  - .getValue()

- inheritance
  - extends
  - super


***
## Week-4 Day-2 20240827

- inheritance
  - child class call super() implicitly

- "pass by reference"
  - passing a copy of object address
  - !!! In the Internet, Java always "Pass by value". Why???

- For "extends"
  - Attributes in Parent
    - if it is private, CANNOT inherit
    - if it is public, "this" is something like "alias", pointing back to "super"
  - Constructors in Parent
    - Even it is public, CANNOT inherit
    - Instead, child class calls parent constructor by "super" 
  - Methods in Parent
    - if it is public, "this" is something like "alias", pointing back to "super"
    - if it is private, child class CANNOT access by "super"
    - Child class can "override" the same method in parent class

- @Override
  - Override -> Same Method Signature

- Inheritance
  - Parent Class can hold its own attribute
  - Parent Class itself can create object

- No matter you are doing individual class or extends, you should override the following ...
  - equals()
  - hashCode()
  - toString()

- if you do not overwrite the above 3 methods, your class by default inherit Parent's one.
  - by default, all class has a super parent "Object.class"
  - "Object.class" makes use of "object address" to perform the above 3 methods

- abstract class
  - abstract method
  - vs concrete class (use extends)
  - abstract class extends another abstract class

- Top-most Class
  - toString()
  - equals(Object object)
  - hashCode()




***
## Week-4 Day-3 20240828

- polymorphism
  - Compile-time (Static Polymorphism)
    - The scope of the "reference" is determined by the type of object reference
    - When re-assign the object to a lower level type of reference, the object behavior may be different.
  - Run-time (Dynamic Polymorphism)
    - method implementation belongs to object itself (but not the reference type)
  - Static vs Dynamic
  - Casting
    - upcast
    - downcast
  
  - Why do we need Inheritance + Polymorphism?
    - 1. abstract class type can be used in method parameter (i.e. Shape[] -> area)
    - 2. abstract class type can be an attribute of a class (i.e. Rank is an attribute of Card)




***
## Week-4 Day-4 20240829

- Child upCast = parent;
- think: downcast parent == child ???

- interface
  - "final" class cannot be extended
  - "final" class method cannot be overriden

- JAVA: (APIE)
  - Abstraction (Interface)
  - Polymorphism
  - Inheritance
  - Encapsulation

- Interface (100% Abstraction/Contract) vs Inheritance (extends Parent Class)
  - Differences:
    - No Attribute vs have attribute(s)
    - No Constructor vs Have Constructor(s)
    - Implements >=1 Interfaces vs Extends ONLY 1 Parent Class
    - Methods are all abstract (before Java 8, have Default after Java 8) vs Contains both abstract and concrete method
    - Not support static variable vs Support ...
  - Same:
    - Support Static Final Variable
    - Support Static methods (After Java 8)
    - Default/Inherit instance method (After Java 8)

- Interface vs Abstract Class
- vip: Interface Name's meaning best to be have an ADJECTIVE meaning(for abstract feeling), not NOUN (which has wrong feeling of an object or concrete class)

- enum
  - is IMPLICITLY final
  - cannot extends enum

- interface extends 

- String, StringBuilder, StringBox implements CharSequence interface
- 6 primitives(Byte, Short, Integer, Long, Float, Double) implements Number interface




***
## Week-4 Day-5 20240830

- the item following "new" MUST BE "constructor"

- ArrayList<Number> is not the parent of ArrayList<Integer>
  - ArrayList<Number> integers3 = new ArrayList<Integer>(); // compile error
- but Number is the parent of Integer
- .isEmpty() vs .size()==0 
- for loop in Array vs for loop in ArrayList

- always override .toString() .equals() .hashCode()

- remove by index .remove(idx) return object
- remove by object local modification + return boolean

- cannot use ArrayList together with primitive
  - but can use with Wrapper class

- Interface: List.class
  - List is the interface of ArrayList

- conversion to Arrays

- Arrays.asList() -> return List object
  - Disadvantage:
    - you cannot perform write operation
    - read operation is ok
    



***
## Week-5 Day-1 20240902

- *** ArrayList.add() method
  - a new array will be created and the reference is redirected(can cause memory overflow) 
  - can return boolean false(mostly true) (can cause problem)
  - reference of ArrayList object has no relationship with the address of the array within it.

- Arrays.asList(...)
  - easy common usage but cannot write

- HashSet<>()
  - the underlying data is NOT array
  - remove duplicate

- LinkedList<>
  - O(1) -> Constant time -> add element at head
  - O(n) -> add element at tail
  - LinkedList.class also store the tail address as an attribute -> add element at tail also O(1)
  - LinkedList.get() vs ArrayList.get()
  - Polymorphism
    - List<Integer> integerLinkedList = new LinkedList<>()
    - List<Integer> integer = new ArrayList<>()
    - Compile Time(Static) polymorphism (focus on left side)
    - Run Time(Dynamic) polymorphism (focus on right side)
  - self-build LinkedList<>()

- ArrayList vs LinkedList
  - Same:
    1. Implement List Interface: add(), remove(), size(), get() ...
    2. With Ordering

  - Difference:
    1. Polymorphism -> different implementation for same method(almost all methods)
    2. Performance: Add/Remove head/tail element -> LinkedList perform better
      - if we know the exact index of position for searching, ArrayList will be better

- ArrayList (array) vs HashSet (hash + array)
  - Same:
    1. (vip) HashSet has NO ordering
    2. Add/Remove -> array -> re-create array object
  - Difference:
    1. (vip) Polymorphism -> different implementation -> add() -> return false if duplicated
    2. Searching by hash code to find out duplicated

- LinkedList vs Queue vs Deque vs List

- VIP: 
  - in OOP, if not array, it must be LinkedList





***
## Week-5 Day-2 20240903

- Java Doc
  - /**
  - *
  - */

- Queue
  - .addLast
  - .removeFirst
  - FIFO

- choices of Interface and the implementation separately
  1. Queue -> LinkedList or ArrayDeque
  2. Deque -> LinkedList or ArrayDeque
  3. List  -> LinkedList or ArrayList

- Choose between Queue, Deque, List
  1. All the above have ordering
  2. Queue/Deque cannot access the middle element DIRECTLY
  3. Deque has addFirst & removeLast
  4. Queue/Deque for "consumption", use .poll()

- queue.poll()
  - similar to "remove"

- queue.peek()
  - look up the head element

- for-each - consumption
  - while-loop Queue
  - while (!queue.isEmpty()){
      element = queue.poll();
      // code using element
  }

- Design idea: need to retain the data?

- PriorityQueue(PQ)
  - NOT first come first serve
  - natural ordering of the elements
  - concerning on ordering
  - !!! The algorithm pick the first element at poll(), but not exactly a sorting

- Comparable 
  - implements Comparable<>
    - "implements Interface" implies the object of this class must contain compareTo() method at "compile time"
    - The method/object has to ensure
  - @Override compareTo()
  - Disadvantages
    1. You cannot define 2 sorting formula at the same time.
    2. The compareTo formula is for Box.class
  - Generic ???


***
## Week-5 Day-3 20240904



***
## Week-5 Day-4 20240905



***
## Week-5 Day-5 20240906