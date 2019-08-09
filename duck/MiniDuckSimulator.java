import java.util.Scanner;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        
        System.out.println("1.Mallard Duck  2.Model Duck > ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Duck duck;
        if(n == 1){
            duck = new MallardDuck();
        }else{
            duck = new ModelDuck();
        }
        
        duck.performQuack();
        duck.performFly();
        
//         System.out.println("Model Duck");
//         duck = new ModelDuck();
//         duck.performQuack();
//         duck.performFly();
    }
}