package model;

import presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

public class Service {
    Presenter presenter;
    List<Toy> shopList;

    public void addToy() {
        Toy toy = new Toy();
        shopList = new ArrayList();
        toy.setT_id(presenter.addId());
        toy.setName(presenter.addName());
        toy.setWeight(presenter.addWeight());
        shopList.add(toy);
    }
public void

}

