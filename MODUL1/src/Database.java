import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> listMenu = new ArrayList<>();

    // TODO Create Method to Insert Menu to Database
    public void setinsertMenu(Menu menu) {
        listMenu.add(menu);
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu() {
        System.out.println("Menu");
        System.out.println("==============================");
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println((i + 1) + ". " + listMenu.get(i).name + " (" + listMenu.get(i).category + ") Rp. " + listMenu.get(i).price + "\n");
        }

    // TODO Create Method to Search Menu from Database
    public void setsearchMenu(Menu menu) {
        listMenu.add(menu);
    }

}
