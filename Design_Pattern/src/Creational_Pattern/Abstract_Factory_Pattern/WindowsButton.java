package Creational_Pattern.Abstract_Factory_Pattern;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        try {
            System.out.println("Painting on Windows System");

        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'paint'" + e);
        }

    }

    @Override
    public void onClick() {
        try {
            System.out.println("On click in Windows");
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'onClick'" + e);
        }

    }

}
