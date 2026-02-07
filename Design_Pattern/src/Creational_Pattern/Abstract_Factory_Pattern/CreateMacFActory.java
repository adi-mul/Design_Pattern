package Creational_Pattern.Abstract_Factory_Pattern;

public class CreateMacFActory implements GuiInterface {
    @Override
    public Button createButton() {
        try {
            return new MacButton();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'createButton'" + e);
        }

    }

    @Override
    public CheckBox creatCheckBox() {
        try {
            return new MacCheckBox();
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'creatCheckBox'" + e);
        }
    }
}
