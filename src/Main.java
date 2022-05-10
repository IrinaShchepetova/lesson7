public class Main {
    public static void main(String[] args){
        Cat[]cats = {
        new Cat("Васька", 6,false),
        new Cat("Мурзик", 8,false),
        new Cat("Дуся", 9,false),
        };
        Plate myPlate = new Plate(0);
        System.out.println("Положите корм в тарелку");
        myPlate.increaseFood();
        myPlate.showInfo();
        for (Cat cat : cats) {
            cat.eat(myPlate);
            cat.isHungry();
            cat.eat(myPlate);
        }

        myPlate.showInfo();


    }
}
