package alteclase;

public class Blackjack {

    public static int parseCard(String card) {
        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        int value1 = parseCard(card1);
        int value2 = parseCard(card2);
        return (value1 + value2 == 21);
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack && dealerScore < 11) {
            return "W";
        } else if (isBlackjack) {
            return "S";
        } else {
            return "S";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore <= 11) {
            return "H";
        } else if (handScore >= 17) {
            return "S";
        } else {
            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        }
    }

    // Metoda asta nu are nevoie de modificari
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
