package testenum2;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[52];

        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();


        for (int i = 0; i < cards.length; i++) {
            for (Suit suit : suits) {
                for (Rank rank : ranks) {
                    cards[i] = new Card(suit, rank);
                    i++;
                }
            }
        }

        for (Card card : cards) {
            System.out.println(card.toString());
        }

    }
}
