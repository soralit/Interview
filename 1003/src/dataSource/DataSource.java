package dataSource;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private List<Chair> chairs;
    private List<Bed> beds;
    private List<RoundTable> roundTables;

    public DataSource(){
        this.chairs = new ArrayList();
        this.beds = new ArrayList();
        this.roundTables = new ArrayList();

        this.chairs.add(new Chair("Chair 1", 40));
        this.chairs.add(new Chair("Chair 2", 50));
        this.chairs.add(new Chair("Someone's chair", 120));

        this.beds.add(new Bed("Wood bed", 180, 150));
        this.beds.add(new Bed("Iron bed", 190, 120));
        this.beds.add(new Bed("Unknown bed", 180, 210));

        this.roundTables.add(new RoundTable("Someone's table", 20));
        this.roundTables.add(new RoundTable("Table XTN", 25));
        this.roundTables.add(new RoundTable("Table XRP", 30));
    }

    public List<Chair> getChairs(){
        return chairs;
    }

    public List<Bed> getBeds() {
        return beds;
    }

    public List<RoundTable> getRoundTables() {
        return roundTables;
    }
}
