import java.util.List;

public class View {
    private static String renderHeader() {
        return "| Title | Area |\n";
    }
    private static String renderRow(Furniture furniture) {
        return "| " + furniture.getName() + " | " + furniture.getArea() + "|\n";
    }

    public static String render(List<Furniture> furnitureList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(renderHeader());
        furnitureList.stream().forEach(furniture -> stringBuilder.append(renderRow(furniture)));

        return stringBuilder.toString();
    }
}
