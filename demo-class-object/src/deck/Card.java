package deck;

public class Card {

  // !!!
  // Make you know the difference between instance variable, static variable, static final variable

  // String -> good presentation, built-in equals() & compareTo()
  private Rank rank;
  private Suit2 suit;

  public Card(Rank rank, Suit2 suit) {
    this.rank = rank;
    this.suit = suit;
  }

  // get, set
  public Rank getRank() {
    return this.rank;
  }

  public Suit2 getSuit() {
    return this.suit;
  }

  public boolean equals(Card card) {
    // this vs card
    return this.rank.equals(card.getRank()) //
    && this.suit == card.getSuit();
  }

  public int compareTo(Card card) {
    // fixed rules
    // this (address) vs card (address)
    int rankResult = this.rank.compareTo(card.getRank());
    if (rankResult == 0) {
      if (this.suit.compareTo(card.getSuit()) == 0) { // should use compare()
        return 0;
      } else if (this.suit.compareTo(card.getSuit()) > 0) { // !!! should use compare()
        return 1;
      } else {
        return -1;
      }
    }
    return rankResult;
  }

  public static int compareTwoSuits2(int suit1, int suit2) {
    if (suit1 == suit2)
      return 0;
    return suit1 > suit2 ? 1 : -1;
  }

  public static int compareTwoSuits(String suit1, String suit2) {
    if (!suit1.equals(suit2)) {
      if ("SPADE".equals(suit1) || "DIAMOND".equals(suit2))
        return 1;
      if ("SPADE".equals(suit2) || "DIAMOND".equals(suit1))
        return -1;
      if ("CLUB".equals(suit1) && "DIAMOND".equals(suit2))
        return 1;
      if ("CLUB".equals(suit1) && "HEART".equals(suit2) //
          || "CLUB".equals(suit1) && "SPADE".equals(suit2))
        return -1;
      if ("HEART".equals(suit1) && "SPADE".equals(suit2))
        return -1;
      if ("HEART".equals(suit1) && "CLUB".equals(suit2) //
          || "HEART".equals(suit1) && "DIAMOND".equals(suit2))
        return 1;
      // rest of combinations for suit2
      if ("SPADE".equals(suit1) && "HEART".equals(suit2))
        return 1;
      if ("DIAMOND".equals(suit1) && "HEART".equals(suit2))
        return -1;
      if ("SPADE".equals(suit1) && "CLUB".equals(suit2))
        return 1;
      if ("DIAMOND".equals(suit1) && "CLUB".equals(suit2))
        return -1;
    }
    return 0; // same suit
  }

  public static int compareTwoRanks(char rank1, char rank2) { // leetcode ->
    // Early return
    if (rank1 != rank2) {
      if (rank1 == '2')
        return 1;
      if (rank2 == '2')
        return -1;
      if (rank1 == 'A')
        return 1;
      if (rank2 == 'A')
        return -1;
      if (rank1 == 'K')
        return 1;
      if (rank2 == 'K')
        return -1;
      if (rank1 == 'Q')
        return 1;
      if (rank2 == 'Q')
        return -1;
      if (rank1 == 'J')
        return 1;
      if (rank2 == 'J')
        return -1;
      if (rank1 == 'T')
        return 1;
      if (rank2 == 'T')
        return -1;
      return rank1 > rank2 ? 1 : -1; // 3 - 9
    }
    return 0;
  }

  public static int compareTwoCard(Card card1, Card card2) {
    // card1 (address) vs card2 (address)
    return -1;
  }

  public String toString() {
    return "Card(" //
        + "rank=" + this.rank //
        + ",suit=" + this.suit + ")";
  }

  public static void main(String[] args) {
    // valueOf(''),
    // Card c1 = new Card(Rank.ofACE(), Suit.ofDiamond());
    // Card c2 = new Card(Rank.ofACE(), Suit.ofClub());
    // Card c3 = new Card(Rank.ofJACK(), Suit.ofDiamond());
    // Card c4 = new Card(Rank.ofJACK(), Suit.ofDiamond());
    Card c1 = new Card(Rank.ofACE(), Suit2.DIAMOND);
    Card c2 = new Card(Rank.ofACE(), Suit2.CLUB);
    Card c3 = new Card(Rank.ofJACK(), Suit2.DIAMOND);
    Card c4 = new Card(Rank.ofJACK(), Suit2.DIAMOND);

    System.out.println(c2.compareTo(c1)); // 1
    System.out.println(c1.compareTo(c2)); // -1
    System.out.println(c1.compareTo(c3)); // 1
    System.out.println(c4.compareTo(c3)); // 0

    compareTwoCard(c1, c2); // 1
    compareTwoCard(c2, c1); // -1
    compareTwoCard(c1, c3); // 0

    // Card.CLUB = 10; // final variable cannot be modified
  }


}
