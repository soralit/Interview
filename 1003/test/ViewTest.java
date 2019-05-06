import dataSource.Bed;
import dataSource.Chair;
import dataSource.DataSource;
import dataSource.RoundTable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ViewTest {

    @Test
    void shouldRenderListOfFurniture(){
        List<Furniture> furnitureList = new ArrayList();
        furnitureList.add(new Furniture("1", 40));
        furnitureList.add(new Furniture("2", 40));
        furnitureList.add(new Furniture("3", 40));

        assertEquals(View.render(furnitureList), "| Title | Area |\n" +
                "| 1 | 40|\n" +
                "| 2 | 40|\n" +
                "| 3 | 40|\n");
    }

    @Test
    void shouldRenderWithDataSource(){
        DataSource dataSource = new DataSource();
        List<Chair> chairs = dataSource.getChairs();
        List<Bed> beds = dataSource.getBeds();
        List<RoundTable> roundTables = dataSource.getRoundTables();

        //TODO

        List<Furniture> furnitureList = new ArrayList();
        assertEquals(View.render(furnitureList), "| Title | Area |\n" +
                "| Chair 1 | 40|\n" +
                "| Chair 2 | 50|\n" +
                "| Someone's chair | 120|\n" +
                "| Wood bed | 27000|\n" +
                "| Iron bed | 22800|\n" +
                "| Unknown bed | 37800|\n" +
                "| Someone's table | 1200|\n" +
                "| Table XTN | 1875|\n" +
                "| Table XRP | 2700|\n");
    }
}