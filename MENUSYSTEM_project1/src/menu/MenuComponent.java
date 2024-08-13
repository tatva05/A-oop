package menu;

public interface MenuComponent {
    void add(MenuComponent menuComponent);
    void remove(MenuComponent menuComponent);
    MenuComponent getChild(int i);
    void display();
}
