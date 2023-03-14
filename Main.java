import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String fileName = "priz.txt";

        Toys constructor = new Toys(1, "constructor", 10, 40);
        Toys doll = new Toys(2, "doll", 10, 30);
        Toys robot = new Toys(3, "robot", 10, 25);
        Toys car = new Toys(4, "car", 10, 5);

        List<Toys> allToys = new ArrayList<>();
        allToys.add(constructor);
        allToys.add(doll);
        allToys.add(robot);
        allToys.add(car);

        int countPrizes = 6;
        List<String> prizeToys = new ArrayList<>();
        for (int i = 1; i<=countPrizes; i++){
            Toys prize = Giveaway.giveaway((ArrayList<Toys>) allToys);
            prizeToys.add(prize.toString());
        }

        System.out.println("Prize toys:");
        System.out.println(prizeToys);
        Giveaway.getPrize((ArrayList<String>) prizeToys, fileName);

    }
}