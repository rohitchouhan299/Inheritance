package Com.demoInheritance;
class doctor{
	float salary=50000;
}
class surgeon extends doctor{
	float bonus =20000;
}
public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
surgeon s=new surgeon();
System.out.println("salary of surgoen"+s.salary);
System.out.println("bonus of surgeon"+s.bonus);
	}

}
