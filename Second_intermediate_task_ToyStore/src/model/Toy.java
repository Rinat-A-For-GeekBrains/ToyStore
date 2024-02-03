package model;

import java.io.Serializable;

public class Toy implements Serializable {
    private int t_id;
    private String name;
    private double probability;

    public Toy(int t_id, String name, double probability) {
        this.t_id = t_id;
        this.name = name;
        this.probability = probability;
    }

    public Toy() {
        this(0, String.valueOf(0), 0);
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public double getProbability() {
        return probability;
    }

    public int getT_id() {
        return t_id;
    }

    public String getName() {
        return name;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

