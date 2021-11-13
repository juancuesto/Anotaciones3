package Tasca_Herencia_i_Polimorfisme;

public class Cycle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle  u=new Unicycle(1);
		Cycle  b=new Bicycle(2);
		Cycle  t=new Tricycle(3);
		System.out.println(u.Wheels());
		System.out.println(b.Wheels());
		System.out.println(t.Wheels());
		Cycle z=ride(1);
		System.out.println(z.Wheels());	
		
		Unicycle  u1=new Unicycle(1);
		Bicycle  b1=new Bicycle(2);
		Tricycle  t1=new Tricycle(3);
		Cycle[] valors= {u1,b1,t1};
		for(int i=0; i<valors.length;i++) {
		if (valors[i] instanceof Unicycle) {
		System.out.println(u1.Balance());
		}else if(valors[i] instanceof Bicycle) {
			System.out.println(b1.Balance());
		}else if(valors[i] instanceof Tricycle){
			System.out.println("Triciclo no tiene este metodo");
		}
		}
		
		//En este caso da error porque Balance no esta definido para la clase Tricycle
		/*else if (t1 instanceof Tricycle) {
			System.out.println(t1.Balance());
		}*/
			
		
			
		

	}
	public Cycle(int r) {
		rodes=r;		
	}
	private int rodes;
	
	public static Cycle ride(int r) {
		if(r==1) {
			return new Unicycle(1);
		}else if(r==2) {
			return new Bicycle(2);
		}else if(r==3) {
			return new Tricycle(2);
		}else {
			return new Cycle(1);
		}
	}
	public int Wheels() {
		return rodes;
	}
}
class Unicycle extends Cycle{
	public Unicycle(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	private final int rodes=1;
	public String Balance() {
		return "Balance Unicycle";
	}
}
class Bicycle extends Cycle{

	public Bicycle(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	private final int rodes=2;
	public String Balance() {
		return "Balance Bicycle";
	}
	
}
class Tricycle extends Cycle{

	public Tricycle(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	private final int rodes=3;
}



