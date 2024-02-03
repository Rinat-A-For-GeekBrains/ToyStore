package presenter;

import model.Service;
import view.View;

public class Presenter {
    View consoleUI;
    Service service = new Service();

    public Presenter(View ui) {
        consoleUI = ui;
    }

    public void addToy(int t_id, String name) {
        service.addToy(t_id, name);
    }

    public void getPrize() {
        service.getPrize();
    }


}







