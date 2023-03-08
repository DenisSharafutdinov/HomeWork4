import java.util.Random;

public class RandomHelper {
    Random random = new  Random();

    public String getRandomName () {
        String result = "";
        char a;
         for (int i = 0; i < 5; i++) {
            a = (char) (65+random.nextInt(25) ); // Генерация кодов больших латинских букв от 65 до 90
            result = result + a;
        }
        return (result);
    }

    public boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public int getRandomInt() {
        return random.nextInt(15);
    }

    public CatClass getRandomCat() {
        CatClass  myCat = new CatClass(); //создать используя методы этого класса нового кота и чтобы метод его возвращал
        myCat.setName(getRandomName());
        myCat.setAge(getRandomInt());
        if (getRandomBoolean())
            myCat.setSex("М");
        else
            myCat.setSex("Ж");
        myCat.setVacinated(getRandomBoolean());
        myCat.setHostName(getRandomName());
        return myCat;
    }

}
