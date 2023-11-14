package alteclase;

public class Main {
    public static void main(String[] args) {
        Blackjack game = new Blackjack();

        // Test the parseCard method
        int cardValue = game.parseCard("ace");
        System.out.println("Value of ace: " + cardValue);

        // Test the isBlackjack method
        boolean isBlackjack = game.isBlackjack("queen", "ace");
        System.out.println("Is it a Blackjack? " + isBlackjack);

        // Test the largeHand method
        String largeHandDecision = game.largeHand(true, 7);
        System.out.println("Large Hand Decision: " + largeHandDecision);

        // Test the smallHand method
        String smallHandDecision = game.smallHand(15, 12);
        System.out.println("Small Hand Decision: " + smallHandDecision);
    }
}
