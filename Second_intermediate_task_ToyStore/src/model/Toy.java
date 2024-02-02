package model;

public class Toy {
    private int t_id;
    private String name;
    private int weight;

    public Toy(int t_id, String name, int weight) {
        this.t_id = t_id;
        this.name = name;
        this.weight = weight;
    }

    public Toy() {
        this(0, 0, 0,);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
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

