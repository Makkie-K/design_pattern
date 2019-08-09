public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quick();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void swim(){
		System.out.println("all duck float, even decoy!");
	}
}
