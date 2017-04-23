import java.util.HashMap;


public class Teacher {

static Teacher teacher;
	
//Multiton
	static HashMap<Integer, Teacher> myList = new HashMap<Integer, Teacher>();
	
	private Teacher(){
		//
	}
	public static Teacher GetTeacher(int key){
		if(!myList.containsKey(key)){
			teacher = new Teacher();
			myList.put(key, teacher);
			System.out.println("Teacher with key " + key + " is created " + teacher.toString());
			System.out.println("*********************************************************");
			return teacher;
		}
		teacher = myList.get(key);
	     System.out.println("Teacher with key " + key + " already exist having object: "+teacher.toString());
	     System.out.println("*********************************************************");
	     return teacher;	
	}
	
	
	
	public void show(){
	      System.out.println("Teacher Home Page");
	      System.out.println("******************");
	   }
	
}
