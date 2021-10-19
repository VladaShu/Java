package Homework11;

public class Courier implements Worker{
    int salary = 100;
    String name;

    public int getSalary() {
        return salary;
    }
    Courier(String name){
        this.name = name;

    }
    @Override
    public void doWork() {
        Warehouse warehouse = new Warehouse();
        int b = warehouse.getBalance();
        b = b + getSalary() + 1000;
        warehouse.setBalance(b);
    }
    @Override
    public void bonus() {
        Warehouse warehouse = new Warehouse();
        int a = warehouse.getBalance();
        if(a == 1000000){
            salary *= 2;
        }
        warehouse.setBalance(salary);
    }
}
