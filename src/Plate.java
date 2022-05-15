import java.util.Scanner;
public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public boolean decreaseFood(int appetite){
        if (appetite>food){
            System.out.println("Кот хочет есть больше, чем корма в тарелке");
            System.out.println("Положите корм в тарелку");
            increaseFood();
            return false;

        }
        else {
            food -= appetite;
            return true;
        }
    }
    public void increaseFood(){
        Scanner in = new Scanner(System.in);
        int putFood = in.nextInt();
        System.out.println("В тарелку насыпали корм");
        food +=  putFood;
    }
    public void showInfo(){
        System.out.println("Кол-во еды в тарелке " + food);
    }


}
