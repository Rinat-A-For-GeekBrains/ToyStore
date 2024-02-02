package view;

import presenter.Presenter;

import java.text.ParseException;
import java.util.Scanner;

public class ConsoleUI implements View{
Presenter presenter;

    public ConsoleUI() {
        presenter = new Presenter(this);
    }

    @Override
    public void print(String text) {System.out.println(text);

    }

    @Override
    public String read() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();;
    }

    @Override
    public void start() {
        boolean x = true;
        while (x) {
            try {
                presenter.addName();
                presenter.addBirthdayDate();
                presenter.addPhoneNumber();
                System.out.println("Введите пол. Если женский то f, если мужской то m");
                presenter.addGender();
                presenter.writeFile();
            } catch (ParseException e) {
                System.out.println("Неправильно введена дата рождения");

            } catch (NameException | GenderException | PhoneException e) {
                System.out.println(e.getMessage());
            }
            x = false;
        }

    }
}
