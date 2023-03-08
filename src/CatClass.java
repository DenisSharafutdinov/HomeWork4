public class CatClass {
    private static String name;
    private static int age;
    private static String sex;
    private static boolean isVacinated;
    private static String hostName;


    public CatClass() {

    }
    public CatClass(String name, int age, String sex, boolean isVacinated, String hostName) {
        validateName(name);
        this.age = age;
        this.sex = sex;
        this.isVacinated = isVacinated;
        validateHostName(hostName);
    }

    public CatClass(String name, int age, String hostName) {
        validateName(name);
        this.age = age;
        validateHostName(hostName);
    }

    public CatClass(String name, int age, String sex, String hostName) {
        validateName(name);
        this.age = age;
        this.sex = sex;
        validateHostName(hostName);
    }

    public CatClass(String name, int age, boolean isVacinated, String hostName) {
        validateName(name);
        this.age = age;
        this.isVacinated = isVacinated;
        validateHostName(hostName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isVacinated() {
        return isVacinated;
    }

    public void setVacinated(boolean vacinated) {
        isVacinated = vacinated;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        validateHostName(hostName);
    }

    public void validateName(String name) {
        if (name.length()>=3) {
            this.name = name;
        }
        else System.out.println("Too short name");
    }

    public void validateHostName(String name) {
        if (name.length()>=5) {
            this.hostName = name;
        }
        else {
            name = "DafaultName";
            System.out.println("Too short host name");
        }
    }

    @Override
    public String toString() {
        return "Имя:" + name + "; "+
        "Возраст: " +  age + "; "+
        "Пол: " + sex  + "; "+
        "Наличие прививок: " + isVacinated +"; "+
        "Имя хозяина: " + hostName ;
    }
}
