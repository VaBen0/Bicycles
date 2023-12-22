import java.util.Random;
import java.util.Scanner;

class Bicycle{
    public int wheel_num;
    public void buy(){}
    Bicycle(int wheel_num){
        this.wheel_num = wheel_num;
    }
}

class Two_wheels extends Bicycle{
    Two_wheels() {
        super(2);
    }
    public void use(){}
    public void create(){}
}

class Three_wheels extends Bicycle{
    Three_wheels() {
        super(3);
    }
    public void use(){}
    public void create(){}
}

class Mono extends Bicycle{
    Mono() {
        super(1);
    }
    public void use(){}
    public void create(){}
}

class Workshop {
    public void fix(Bicycle bicycle){
        if(bicycle.wheel_num == 1){
            System.out.println("Одноколёсный велосипед отремонтирован");
        }
        if(bicycle.wheel_num == 2){
            System.out.println("Двухколёсный велосипед отремонтирован");
        }
        if(bicycle.wheel_num == 3){
            System.out.println("Трёхколёсный велосипед отремонтирован");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Bicycle bicycle[] = new Bicycle[n];
        Workshop workshop = new Workshop();

        for(int i = 0; i < n; i++){
            switch (rand.nextInt(1, 4)){
                case(1):
                    bicycle[i] = new Mono();
                    break;
                case(2):
                    bicycle[i] = new Two_wheels();
                    break;
                case(3):
                    bicycle[i] = new Three_wheels();
                    break;
                default:
                    System.out.println("Неверно введённое число");
                    i--;
                    break;
            }
        }

        for(int i = 0; i < bicycle.length; i++){
            if(bicycle[i].wheel_num == 1){
                workshop.fix(bicycle[i]);
            }
        }
        for(int i = 0; i < bicycle.length; i++){
            if(bicycle[i].wheel_num != 1){
                workshop.fix(bicycle[i]);
            }
        }
    }
}