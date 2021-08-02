import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class task_cards {

    enum Suits {
        Hearts,
        Spades,
        Clubs,
        Diamonds
    }

    enum cardValues {
        two,
        three,
        four,
        five,
        six,
        seven,
        eight,
        nine,
        ten,
        Jack,
        Queen,
        King,
        Ace
    }

    public static void main(String[] args) {

        String[] cardDeck = new String[52];
        int counter =0;

        for (int i = 0; i < Suits.values().length; i++) {
            for (int j = 0; j < cardValues.values().length; j++) {

            cardDeck[counter] = String.format("%s %s", Suits.values()[i], cardValues.values()[j]);
//            System.out.println(cardDeck[counter]);
            counter++;

            }
        }

        // SHUFFLE THE DECK (simple)
        //SHUFFLE
        //Select on e random card
        //It will return a value between [0..1]

//        Math.random() * 51;

        //GET FIRST RANDOM CARD
        String randomCard = cardDeck[(int)Math.random() * 51d];
        System.out.println("We got a random first cards: " + randomCard);

        //GET FIRST SIX CARDS
        //MIGHT REPEAT

        for (int i = 0; i < 6; i++) {
            String randomCard6 = cardDeck[(int)Math.random() * 51d];
            System.out.println("We got one out of 6 random cards: " + randomCard6);

        }

        //THE PROPER METHOD

        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = cardDeck.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = cardDeck[index];
            cardDeck[index] = cardDeck[i];
            cardDeck[i] = a;
        }

        //PRINT 6 elements
        for (int i = 0; i < 6; i++) {
            System.out.println("We got one out of 6 rally shuffled cards: " +cardDeck[i]);
        }



    }
}
