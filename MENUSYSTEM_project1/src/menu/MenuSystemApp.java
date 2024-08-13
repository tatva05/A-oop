package menu;
public class MenuSystemApp {
    public static void main(String[] args) {
        MenuComponent mainMenu = new Menu("Main Menu");
        MenuComponent subMenu1 = new Menu("Sub Menu 1");
        MenuComponent subMenu2 = new Menu("Sub Menu 2");

        MenuComponent menuItem1 = new MenuItem("Menu Item 1");
        MenuComponent menuItem2 = new MenuItem("Menu Item 2");
        MenuComponent menuItem3 = new MenuItem("Menu Item 3");

        subMenu1.add(menuItem1);
        subMenu1.add(menuItem2);

        subMenu2.add(menuItem3);

        mainMenu.add(subMenu1);
        mainMenu.add(subMenu2);

        mainMenu.display();
    }
}
