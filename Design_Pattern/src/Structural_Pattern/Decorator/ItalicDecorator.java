package Structural_Pattern.Decorator;

class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextView x) {
        super(x);
    }

    @Override
    public void render() {
        System.out.print("<i>");
        x.render();
        System.out.print("</i>");
    }
}
