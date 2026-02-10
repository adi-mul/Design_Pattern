package Structural_Pattern.Decorator;

class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextView x) {
        super(x);
    }

    @Override
    public void render() {
        System.out.print("<b>");
        x.render();
        System.out.print("</b>");
    }
}