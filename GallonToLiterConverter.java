
public class GallonToLiterConverter {
    public static void main(String[] args) {
        double gallons, liters;

        // 1 liter equals 3.7854 gallons
        System.out.println("GALLONS\t\t\t\tLITERS");
        for (gallons = 1; gallons <= 10; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(String.format("%.2f", gallons) + "\t\t\t\t" + String.format("%.2f", liters));
        }
    }
}
