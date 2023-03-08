import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CatClass> randomCats = new ArrayList<>();
        RandomHelper rndHelp = new RandomHelper();

        for (int i = 0; i < 9; i++) {
            randomCats.add(rndHelp.getRandomCat());
        }
        for (int j = 0; j < randomCats.size(); j++) {
            System.out.println("Кот "+(j+1)+" - "+randomCats.get(j).toString());
        }
    }
}
