package TestUserApp;

import java.io.*;
import java.util.Scanner;

public class UserService {

    public static TestUserApp.User[] users = new TestUserApp.User[new Scanner(System.in).nextInt()];
    private static int lastIndex = 0;

    public static void addUser(TestUserApp.User user){
        users[lastIndex] = user;
        user.setId(++lastIndex);

    }

    public static void requireFieldsAndAdd(){
        TestUserApp.User user = new TestUserApp.User();

        System.out.println("Enter user name: ");
        user.setName(new Scanner(System.in).nextLine());

        System.out.println("Enter user surname: ");
        user.setSurname(new Scanner(System.in).nextLine());

        System.out.println("Enter user age: ");
        user.setAge(new Scanner(System.in).nextInt());

        addUser(user);
        System.out.println("User successfully registered!");
        System.out.println(user);
    }

    public static void calculateMoney(){
        TestUserApp.User user = new TestUserApp.User();

        System.out.println("Choose user id you want to take money from");
        int idToTakeMoney =  user.setId(new Scanner(System.in).nextInt());

        System.out.println("Choose user id you want to donate money");
        int idToDonateMoney = user.setId(new Scanner(System.in).nextInt());

        System.out.println("How much money do you want to donate?");
        int moneytogive = user.setMoneyToDonate(new Scanner(System.in).nextInt());

        int result = user.getTotalMoney() - moneytogive;
        int resultOfDonation = user.getTotalMoney() + moneytogive;




        System.out.println("User id nr " + idToTakeMoney + " has now " + result + " manat");
        System.out.println("User id nr "+ idToDonateMoney + " has now " + resultOfDonation + " manat");

        showAll();



    }

    public static void showAll(){
        for(int i = 0; i < users.length; i++){
            if(users[i] == null) continue;
            System.out.println(users[i].toString());
        }
    }

    public static void exit(){

        System.exit(0);
    }

    public static void writeIntoFile(TestUserApp.Store t)throws Exception {
        try {
            File file = new File("files/myObjects.txt");
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);
            new TestUserApp.User();
            o.writeObject(t);
            o.close();
            f.close();

        } catch (Exception e) {

        }
    }

    public static TestUserApp.Store readFromFile(){
        try {
            FileInputStream fi = new FileInputStream(new File("files/myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            TestUserApp.Store pr1 = (TestUserApp.Store) oi.readObject();
            oi.close();
            fi.close();

            return pr1;
        }catch (Exception e){
            TestUserApp.Store s = new TestUserApp.Store();
            s.setT(users);
            return s;
        }
    }
}
