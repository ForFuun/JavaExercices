package tema3;

public class Main {
    public static void main(String[] args) {
        PigLatinTranslator translator = new PigLatinTranslator();

        String inputSentence = "Ce faceti";
        String translatedSentence = translator.translate(inputSentence);
        System.out.println(translatedSentence);
    }
}
