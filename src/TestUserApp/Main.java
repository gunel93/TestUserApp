package TestUserApp;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("How many users do you want to register?");
        TestUserApp.Store s = TestUserApp.UserService.readFromFile();
        TestUserApp.UserService.users = s.getT();

          while (true) {
                   try {
                       System.out.println("Select operation:\n" +
                                "1.Register user\n" +
                                "2.Show all users\n" +
                                "3.Donate Money\n" +
                                "4.Exit");
                       TestUserApp.Menu_Choice menu = TestUserApp.Menu_Choice.getByValue(new Scanner(System.in).nextInt());
                        //Menu_Choice menu = Menu_Choice.valueOf(new Scanner(System.in).nextLine());
                        if (menu == TestUserApp.Menu_Choice.REGISTER) {
                            TestUserApp.UserService.requireFieldsAndAdd();
                        } else if (menu == TestUserApp.Menu_Choice.SHOW_ALL) {
                            TestUserApp.UserService.showAll();
                        } else if(menu == TestUserApp.Menu_Choice.DonateMoney){
                            TestUserApp.UserService.calculateMoney();
                        }
                         else if (menu == TestUserApp.Menu_Choice.EXIT) {
                            TestUserApp.UserService.exit();
                        } else {
                            System.out.println("Invalid operation!");
                        }
                    } catch (IndexOutOfBoundsException e) {
                        e.printStackTrace();
                        System.exit(0);
                    }

                  s.setT(TestUserApp.UserService.users);
                  TestUserApp.UserService.writeIntoFile(s);

                 }

            }
       }
