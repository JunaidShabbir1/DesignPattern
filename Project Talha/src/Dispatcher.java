
public class Dispatcher {

	   private Student studentView;
	   
	   private Teacher teacherView;
	   
	   public Dispatcher(){
	      studentView = Student.GetStudent(1);
	      teacherView = Teacher.GetTeacher(2);
	      studentView = Student.GetStudent(1);
	      teacherView = Teacher.GetTeacher(2);
	   }

	   public void dispatch(String request){
	      if(request.equalsIgnoreCase("STUDENT")){
	         studentView.show();
	      }
	      else if (request.equalsIgnoreCase("TEACHER"))
	      {
	         teacherView.show();
	      }	
	      else
	      {
	    	  new NULL();
	      }
	   }
	
}
