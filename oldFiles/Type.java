package Package5;

//type comes after the class name
public class Type<T> {
	
	//VARIABLES
	T obj;
	
	//Constructor
	Type(T obj){
		this.obj=obj;
		System.out.println(obj.getClass().getName());
	}
	
	//getter
	public T getObj(){
		return this.obj;
	}
	
	//setter
	public T setObj(T obj){
		this.obj=obj;
		return obj;		
	}
	
	//type comes before the method return type
	public <Ts> void sumObjects (Ts obj1, Ts obj2) {
		if ((obj1.getClass().getName() == "java.lang.Double" 
				&& obj2.getClass().getName() == "java.lang.Double" )||
				(obj1.getClass().getName() == "java.lang.Integer" 
				&& obj2.getClass().getName() == "java.lang.Integer" )) {
			System.out.println("The numbers can be summed");
		}
		else {
			System.out.println("The numbers cannot be summed");
		}
	}
	
	public static void main(String[] args) {
	
		Type<Double> double1 = new Type<Double>(2.0);
		double1.sumObjects(1.0, 2.0);
		double1.sumObjects(true, false);
	}
}
