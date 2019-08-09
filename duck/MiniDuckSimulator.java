public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("Mallard Duck");
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();
        
        System.out.println("Model Duck");
        duck = new ModelDuck();
        duck.performQuack();
        duck.performFly();
    }
}