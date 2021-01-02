package TestUserApp;

public enum  Menu_Choice {

    REGISTER(1), SHOW_ALL(2),DonateMoney(3),
    EXIT(5),
    UNKNOWN(-1);

    int number;

    Menu_Choice(int value){
        this.number = value;
    }

    public static Menu_Choice getByValue(int value){
        for(int i = 0; i < Menu_Choice.values().length; i++){
            if(Menu_Choice.values()[i].number == value){
                return Menu_Choice.values()[i];

            }
        }
        return UNKNOWN;
    }
}
