package Creational_Pattern.Abstract_Factory_Pattern;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void paint() {
        try {
            System.out.println("paint():Painting on Windows system");
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'paint'");
        }

    }

    @Override
    public void onSelect() {
        // TODO Auto-generated method stub
        try {
            System.out.println("onSelect : on Windows system");
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'onSelect'" + e);
        }
    }

}
