package demoguiswing;

/**
 * Created by Maringa on 14.05.2017.
 */
public class MainMyApp {
    public static void main(String[] args) {
        MyApp myApp = new MyApp("User/Comp Names");
        myApp.createMenu();
        myApp.createVisual();
        myApp.buttonActions();
        myApp.menuActions();
    }
}
