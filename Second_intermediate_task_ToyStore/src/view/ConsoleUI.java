package view;

import model.Toy;
import presenter.Presenter;

import java.text.ParseException;
import java.util.Scanner;

public class ConsoleUI implements View {
    private final Scanner scanner;
    private Presenter presenter;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
    }

    @Override
    public void print(String text) {
        System.out.println(text);

    }

    @Override
    public String read() {
        return scanner.nextLine();
    }

    @Override
    public void start() {
        boolean x = true;
        while (x) {
            print("Введите: \n 1. Добавить игрушку \n 2. Провести розыгрыш и выдать игрушку \n 3. Выход \n ");
            int c = Integer.parseInt(read());
            switch (c) {
                case 1: {
                    print("Введите через пробел ID игрушки, название игрушки");
                    presenter.addToy(Integer.parseInt(read()), read());
                    break;
                }
                case 2: {
                    presenter.getPrize();
                    break;
                }
                case 3: {
                    x = false;
                    break;
                }

            }


        }
    }
}
