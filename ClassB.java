package InheritanceTypes;

public class ClassB extends ClassA{
	
	public ClassB() {
		
		System.out.println("SubClassB----Constructor/Method");
		
	}
	
	
	
	
	public static void main (String[] Args) {
		

		ClassA a = new ClassA();
		ClassB b = new ClassB();
		
		//System.out.println(a.getShow());
		System.out.println(b.getShow());

			
		
	}
	

}
