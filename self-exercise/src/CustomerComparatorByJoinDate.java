import java.util.Comparator;

public class CustomerComparatorByJoinDate implements Comparator<Customer> {

  @Override
  public int compare(Customer o1, Customer o2) {
    return o1.getJoinDate().compareTo(o2.getJoinDate());

  }

}
