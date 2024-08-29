import java.time.LocalDate;
import java.util.Objects;

public class Company {
  private Staff2 staff;

  public Staff2 getStaff() {
    return this.staff;
  }

  @Override
  public boolean equals(Object obj) {
    // step 1 (address)
    if (this == obj) {
      return true;
    }
    // step 2 (return false if the object is not "from" Company.class)
    if (!(obj instanceof Company)) {
      return false;
    }
    // Step: downcast to target type, and then compare all values
    Company company = (Company) obj;
    return Objects.equals(this.staff, company.getStaff()) //
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.staff);
  }

  @Override
  public String toString() {
    return "Company(" //
        + "staff=" + this.staff //
        + ")";
  }

  public static void main(String[] args) {

    //
    Company c1 = new Company(new Staff2("John", LocalDate.of(2024, 8, 9)));
    Company c2 = new Company(new Staff2("John", LocalDate.of(2024, 8, 9)));


    System.out.println(c1.equals(c2)); // true
    System.out.println(c1 == c2); // false
    System.out.println(c1.hashCode() == c2.hashCode()); // true
  } // end of main()

}
