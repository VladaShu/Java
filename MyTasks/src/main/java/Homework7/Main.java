package Homework7;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Ola",2010,3,4);
        Airplane airplane2 = new Airplane("Oli",2013,5,5);
        System.out.println(Airplane.compareAirplanes(airplane1,airplane2));

        Player player = new Player(65);
        Player player2 = new Player(75);
        Player player3 = new Player(90);
        System.out.println(Player.info());
        Player player4 = new Player(10);
        Player player5 = new Player(25);
        Player player6 = new Player(85);
        System.out.println(Player.info());
        for(int i = 0; i < 10; i++) {
            player4.run();
        }
        System.out.println(Player.info());
    }
}
