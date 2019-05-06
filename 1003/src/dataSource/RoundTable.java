package dataSource;

public class RoundTable {
    private String name;
    private int radius;

    public RoundTable(String name, int radius){
        this.name=name;
        this.radius=radius;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }
}
