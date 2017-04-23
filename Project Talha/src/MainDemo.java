
public class MainDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatch("Student");
		dispatcher.dispatch("Teacher");
		dispatcher.dispatch("Director");*/

		FrontController frontController = new FrontController();
	    frontController.dispatchRequest("Student");
	    frontController.dispatchRequest("Teacher");
	    frontController.dispatchRequest("Director");
	    
	}

}
