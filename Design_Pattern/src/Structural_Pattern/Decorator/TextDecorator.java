package Structural_Pattern.Decorator;

abstract public class TextDecorator implements TextView {
    protected final TextView x;

    TextDecorator(TextView x) {
        this.x = x;
    }
}
