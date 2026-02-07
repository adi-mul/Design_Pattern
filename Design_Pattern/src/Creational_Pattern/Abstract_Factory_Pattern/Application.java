package Creational_Pattern.Abstract_Factory_Pattern;

public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(GuiInterface x) {
        this.button = x.createButton();
        this.checkBox = x.creatCheckBox();

    }

    public void renderUI() {
        button.paint();
        checkBox.paint();
    }
}
