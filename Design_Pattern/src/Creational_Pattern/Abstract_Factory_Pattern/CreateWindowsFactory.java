package Creational_Pattern.Abstract_Factory_Pattern;

public class CreateWindowsFactory implements GuiInterface {

    @Override
    public Button createButton() {
        try {
            return new WindowsButton();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'createButton'");
        }

    }

    @Override
    public CheckBox creatCheckBox() {
        try {
            return new WindowsCheckBox();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'creatCheckBox'");
        }

    }

}
