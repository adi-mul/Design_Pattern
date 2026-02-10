package Structural_Pattern.Decorator;

public class Main {

    public static void main(String[] args) {
        TextView t = new PlainTextView("Hello Aditya");

        t.render();

        TextView bolTextView = new BoldDecorator(t);
        t.render();
        TextView Italic = new ItalicDecorator(t);
        t.render();
    }
}
