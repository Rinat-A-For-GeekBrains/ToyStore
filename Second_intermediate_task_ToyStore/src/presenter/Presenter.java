package presenter;

import model.Service;
import view.View;

public class Presenter {
    View consoleUI;
    Service service = new Service();

    public Presenter(View ui) {
        consoleUI = ui;
    }

    public void addId()  {
        consoleUI.print("Введите ID игрушки");}
        int t_id = Integer.parseInt(consoleUI.read());
        public void addName(){
        consoleUI.print("Введите название игрушки");
        String name = consoleUI.read();}
        public void addWright(){
        consoleUI.print("Введите вес игрушки");
        int weight = Integer.parseInt(consoleUI.read());}

        consoleUI.print("Введите название игрушки");
        String name = consoleUI.read();




        String[] fullName = name.split(" ");
        String lastName = fullName[0];
        if (fullName.length != 3){
            throw new NameException();
}
