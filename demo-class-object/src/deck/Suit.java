package deck;

public class Suit {
  // Constant
  // Integer.MIN_VALUE -> constant
  public static final int DIAMOND = 1;
  public static final int CLUB = 2;
  public static final int HEART = 3;
  public static final int SPADE = 4;

  private int value;

  private Suit(int value) {
    this.value = value;
  }

  public static Suit valueOf(int value){
    return new Suit(value);
  }

  public static Suit ofDiamond(){
    return new Suit(DIAMOND);
  }

  public static Suit ofClub(){
    return new Suit(CLUB);
  }

  public static Suit ofHeart(){
    return new Suit(HEART);
  }

  public static Suit ofSpade(){
    return new Suit(SPADE);
  }


  public int getValue() {
    return this.value;
  }

  public int compareTo(Suit suit) {
    if (this.value == suit.getValue()) {
      return 0;
    }
    return this.value > suit.getValue() ? 1 : -1;
  }

  public boolean isDiamond() {
    return this.value == DIAMOND;
  }

  public boolean isHeart() {
    return this.value == HEART;
  }

  public boolean isClub() {
    return this.value == CLUB;
  }

  public boolean isSpade() {
    return this.value == SPADE;
  }

  public String toString() {
    return "Suit(" //
        + "value=" + this.value //
        + ")";
  }

  public static void main(String[] args) {
    //
  } // end of main()



}
