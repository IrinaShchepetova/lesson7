public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;
    public Cat(String name, int appetite, boolean hungry){
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }
    public void eat(Plate plate){
        if (plate.decreaseFood(appetite))
        hungry = true;
    }
    public void isHungry() {
        if (hungry)
            System.out.println(name + " сыт");
        if (!hungry)
            System.out.println(name + " не наелся");
    }
}
