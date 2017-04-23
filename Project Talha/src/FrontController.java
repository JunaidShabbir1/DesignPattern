
public class FrontController {

	private Dispatcher dispatcher;

	   public FrontController(){
	      dispatcher = new Dispatcher();
	   }

	   private boolean isAuthenticUser(String request){
		   if(request.equalsIgnoreCase("Student") || request.equalsIgnoreCase("Teacher")){
			   System.out.println("User is authenticated successfully.");
			      return true;
		   }
		   else{
			   System.out.println("User is not authenticated.");
			      return true;
		   }
	      
	   }

	   private void trackRequest(String request){
	      System.out.println("Page requested: " + request);
	   }

	   public void dispatchRequest(String request){
	      //log each request
	      trackRequest(request);
	      
	      //authenticate the user
	      if(isAuthenticUser(request)){
	         dispatcher.dispatch(request);
	      }	
	   }
}
