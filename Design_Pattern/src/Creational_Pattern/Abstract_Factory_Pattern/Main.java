package Creational_Pattern.Abstract_Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        String os = System.getProperty("OS");
        os = "Mac";
        GuiInterface factory;
        if (os.contains("Windows")) {
            factory = new CreateWindowsFactory();
        } else {
            factory = new CreateMacFActory();
        }
        Application new_app = new Application(factory);
        new_app.renderUI();
    }

}
