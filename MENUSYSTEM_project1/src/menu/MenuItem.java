package menu;

public class MenuItem implements MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        // Not applicable for leaf
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        // Not applicable for leaf
    }

    @Override
    public MenuComponent getChild(int i) {
        return null;
    }

    @Override
    public void display() {
        System.out.println("MenuItem: " + name);
    }
}
