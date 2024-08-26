package deck;

public enum Rank2 {
  ACE(12), TWO(13), THREE(1), FOUR(2), FIVE(3), SIX(4), SEVEN(5), EIGHT(
      6), NINE(7), TEN(8), JACK(9), QUEEN(10), KING(11),;

  private final int value;

  private Rank2(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }


  public int compare(Rank2 rank) {
    if (this == rank) {
      return 0;
    }
    return this.value > rank.getValue() ? 1 : -1;
  }

  public static void main(String[] args) {
    System.out.println(Rank2.ACE.compare(Rank2.TWO));



  } // end of main()
}
