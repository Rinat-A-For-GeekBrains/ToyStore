package presenter;

import model.Service;
import view.View;

public class Presenter {
    View consoleUI;
    Service service = new Service();

    public Presenter(View ui) {
        consoleUI = ui;
        this.service = new Service();
    }

    public int addId() {
        consoleUI.print("Введите ID игрушки");
        int t_id = Integer.parseInt(consoleUI.read());
        return t_id;
    }

    public String addName() {
        consoleUI.print("Введите название игрушки");
        String name = consoleUI.read();
        return name;
    }

    public int addWeight() {
        consoleUI.print("Введите вес игрушки");
        int weight = Integer.parseInt(consoleUI.read());
        return weight;
    }
}







