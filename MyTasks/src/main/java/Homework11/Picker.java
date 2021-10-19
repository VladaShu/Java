package Homework11;

public class Picker implements Worker {
    int salary = 80;
    String name;
    public int getSalary() {
        return salary;
    }
    Picker(String name){
        this.name = name;

    }
    @Override
    public void doWork() {
        Warehouse warehouse = new Warehouse();
        int b = warehouse.getBalance();
        b = b + getSalary();
        warehouse.setBalance(b);
        int a = warehouse.getCountOrder();
        a++;
        warehouse.setCountOrder(a);
    }

    @Override
    public void bonus() {
        Warehouse warehouse = new Warehouse();
        int a = warehouse.getCountOrder();
        if(a == 1500){
            salary *= 3;
        }
        warehouse.setBalance(salary);
    }
}
