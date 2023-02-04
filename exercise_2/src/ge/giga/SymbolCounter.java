package ge.giga;

public class SymbolCounter {
    public static int counterSymbol(String text, char symbol) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);
            if (chr == symbol) {
                counter++;
            }
        }
        return counter;
    }
}
