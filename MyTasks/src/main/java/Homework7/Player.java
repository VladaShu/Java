package Homework7;

public class Player {
    private int stamina;
    private final static int  max_stamina = 100;
    private final static int min_stamina = 0;
    private static int countPlayers = 0;
    public int getStamina() {
        return stamina;
    }
    public Player (int stamina){
        this.stamina = stamina;

       if(countPlayers < 6){
           countPlayers++;
       }
    }
    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }
    }
    public static String info() {
        if(countPlayers < 6){
            return "Команды неполные. На поле еще есть " + (6 - countPlayers) +
                    " свободных мест ";
        } else {
            return "На поле нет свободных мест";
        }
    }
}
