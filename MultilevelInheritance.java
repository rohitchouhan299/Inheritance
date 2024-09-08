package Com.demoInheritance;
 
class Animal{
	void display1() {
		System.out.println("Eating.......");
	}
}
class Cat extends Animal{
	void display2() {
		System.out.println("meow.......");
}
	}
	class BabyCat extends Cat {
		void display3() {
			System.out.println("crying......");
	}
	}
	public class MultilevelInheritance { 
	public static void main(String[] args) {
		BabyCat bc=new BabyCat();
		bc.display1();
		bc.display2();	
		bc.display3();
	}
	}
	
		// TODO Auto-generated method stub

	

