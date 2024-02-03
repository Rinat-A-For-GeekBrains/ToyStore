package model;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.random.RandomGenerator;

public class Service {
    Writer writer = new Writer();
    PriorityQueue<Toy> shopList = new PriorityQueue<>(new Comparator<Toy>() {


        @Override
        public int compare(Toy o1, Toy o2) {
            if (o1.getProbability() > o2.getProbability())
                return 1;
            else if (o1.getProbability() < o2.getProbability())
                return -1;
            else return 0;
        }
    }.reversed());


    public void addToy(int t_id, String name) {
        Toy toy = new Toy(t_id, name, RandomGenerator.getDefault().nextDouble(1, 101));
        shopList.add(toy);
    }

    public void getPrize() {
        Toy prize = shopList.poll();
        writer.save(prize.getT_id(), prize.getName());
    }


}

