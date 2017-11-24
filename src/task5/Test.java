package task5;

import task5.input.MyScanner;
import task5.views.MenuView;
import task5.controller.Menu;


public class Test {
    public static void main(String[] args) {
        MyScanner scanner = new MyScanner();
        MenuView menuView = new MenuView();
        Menu menu = new Menu(menuView, scanner);
        menu.run();
        scanner.closeScanner();
    }
}
