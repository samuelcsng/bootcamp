package questions;

/**
 * The sum is 55
 */
public class JavaQuest7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // int[] arrInt = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    // Write a loop to sum up all value in the int array
    for (int i = 0; i < arrInt.length; i++) {
      sum += arrInt[i];
    }
    System.out.println("The sum is " + sum);
  }
}
