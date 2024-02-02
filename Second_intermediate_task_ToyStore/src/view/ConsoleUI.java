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
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
