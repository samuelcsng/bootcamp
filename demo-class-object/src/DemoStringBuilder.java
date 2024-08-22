public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!"; // slow performance
    System.out.println(s); // hello!!!

    // Solution (leetcode -> avoid to use String concat)
    // StringBuilder will solve the performance issue
    StringBuilder sb = new StringBuilder("hello");
    sb.append("!!!"); // revise its attribute value, and then return its address
    sb.append("???").append("abc").charAt(sb.length() - 1);
    System.out.println(sb.toString()); // hello!!!???abc
    // System.out.println(last); // c
    System.out.println(sb.substring(1, 3)); // return a new String
    System.out.println(sb); // hello!!!???abc

    System.out.println(sb.reverse()); // return a new String -> cba???!!!olleh
    System.out.println(sb); // revise itself

    // !!! Most of the String.class method exists in STringBuilder.class
    // 1. length()
    // 2. charAt()
    // 3. substring()
    // etc ...


    long startTime = System.currentTimeMillis(); // ms
    String s1 = "";
    for (int i = 0; i < 10000; i++) {
      s1 = s1.concat("a");
      // s1 += "a";
    }
    long afterTime = System.currentTimeMillis(); // ms
    System.out.println(afterTime - startTime);

    startTime = System.currentTimeMillis();
    StringBuilder sb2 = new StringBuilder("");
    for (int i = 0; i < 10000; i++) {
      sb2.append("a");
    }
    afterTime = System.currentTimeMillis();
    System.out.println(afterTime - startTime);


  } // end of main()
}
