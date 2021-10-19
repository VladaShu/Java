package Homework6;

import java.util.Scanner;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    Airplane (String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }
    public String info(){
        return "Изготовитель: " + producer + " год выпуска: " + year +
                " длина: " + length + " вес: " + weight + " количество топлива в баке: " + fuel;
    }
    public int fillUp(){
        Scanner scanner = new Scanner(System.in);
        int fill = scanner.nextInt();
        return fuel += fill;
    }
}
