package TestUserApp;

public class User {
    private String name;
    private String surname;
    private int age;
    private int id;
    private int totalMoney = 500;
    private int moneyToDonate;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;

    }

    public int getMoneyToDonate() {
        return moneyToDonate;
    }

    public int setMoneyToDonate(int moneyToDonate) {
        this.moneyToDonate = moneyToDonate;
        return moneyToDonate;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", moneyAmount=" + totalMoney +
                '}';
    }
}
