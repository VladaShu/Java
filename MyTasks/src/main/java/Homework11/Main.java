package Homework11;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker("Alex");
        Courier courier = new Courier("Tim");
        for(int i = 0; i < 100000; i++) {
            picker.doWork();
            picker.bonus();
        }
        for(int i = 0; i < 100000; i++) {
            courier.doWork();
            courier.bonus();
        }
        System.out.println(warehouse.toString());
    }
}
