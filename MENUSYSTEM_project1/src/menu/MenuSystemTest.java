package menu;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MenuSystemTest {
    private MenuComponent mainMenu;
    private MenuComponent subMenu1;
    private MenuComponent subMenu2;
    private MenuComponent menuItem1;
    private MenuComponent menuItem2;
    private MenuComponent menuItem3;

    @Before
    public void setUp() {
        mainMenu = new Menu("Main Menu");
        subMenu1 = new Menu("Sub Menu 1");
        subMenu2 = new Menu("Sub Menu 2");

        menuItem1 = new MenuItem("Menu Item 1");
        menuItem2 = new MenuItem("Menu Item 2");
        menuItem3 = new MenuItem("Menu Item 3");

        subMenu1.add(menuItem1);
        subMenu1.add(menuItem2);

        subMenu2.add(menuItem3);

        mainMenu.add(subMenu1);
        mainMenu.add(subMenu2);
    }

    @Test
    public void testDisplay() {
        mainMenu.display();
    }

    @Test
    public void testAddAndRemove() {
        MenuComponent newMenuItem = new MenuItem("New Menu Item");
        subMenu1.add(newMenuItem);
        assertEquals(subMenu1.getChild(2), newMenuItem);

        subMenu1.remove(newMenuItem);
        assertNull(subMenu1.getChild(2));
    }
}
