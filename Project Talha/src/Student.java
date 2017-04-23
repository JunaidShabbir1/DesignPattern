import java.util.HashMap;

public class Student {

	/**
	 * @param args
	 */
	//Multiton
	static Student std;
	
	static HashMap<Integer, Student> myList = new HashMap<Integer, Student>();
	
	private Student(){
		//
	}
	
	public static Student GetStudent(int key){
		if(!myList.containsKey(key)){
			std = new Student();
			myList.put(key, std);
			System.out.println("Student with key " + key + " is created " + std.toString());
			System.out.println("*********************************************************");
			return std;
		}
		std = myList.get(key);
	     System.out.println("Student with key " + key + " already exist having object: "+ std.toString());
	     System.out.println("*********************************************************");
	     return std;	
	}
	
	
	 public void show(){
	      System.out.println("Student Home Page");
	      System.out.println("******************");
	   }
	
   
     
	
	

}
