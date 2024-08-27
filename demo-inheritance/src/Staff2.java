import java.time.LocalDate;
import java.util.Objects;

public class Staff2 {
  private String name;
  private LocalDate joinDate;

  public Staff2(String name, LocalDate joinDate) {
    this.name = name;
    this.joinDate = joinDate;
  }

  public String getName() {
    return this.name;
  }

  public LocalDate getJoinDate() {
    return this.joinDate;
  }

  @Override
  public String toString() {
    return "Staff2(" //
        + "name=" + this.name //
        + ")";
  }

  // s1 -> Staff2 object
  // - s1.equals(s1); -> must be true
  // - s1.equals(cat); -> false
  // - s1.equals(s2); -> true / false
  @Override
  public boolean equals(Object obj) { // same name -> true, otherwise false
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Staff2)) { // before downcast, we usually conside to use "instanceof"
      return false;
    }
    // because we do not have staff object, so we cannot getName()
    // Parent -> Child (downcast)
    Staff2 staff = (Staff2) obj;
    return Objects.equals(this.name, staff.getName()) //
        && Objects.equals(this.joinDate, staff.getJoinDate()) //
    ;
  }

  // LocalDate.class already override equals() method
  // Objects.equals() -> calling joinDate.equals(joinDate())

  // 1. hashCode() definition always same as equals()
  // 2. this return value (int) represents "name + joinDate"
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.joinDate);
  }

  public static void main(String[] args) {
    System.out
        .println(new Staff2("John", LocalDate.of(2024, 1, 1)).equals(null)); // false
    System.out.println(new Staff2("John", LocalDate.of(2024, 1, 1))
        .equals(new Staff2("John", LocalDate.of(2024, 1, 1)))); // true

    System.out.println(new Staff2("John", LocalDate.of(2024, 1, 1)).hashCode()); // 75896887
    System.out.println(new Staff2("John", LocalDate.of(2024, 1, 1)).hashCode()); // 75896887




  } // end of main()
}
