package Demo;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			Wishlist();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		try {
			System.out.println("Introducing ...\n");
			int i=0;
			System.out.println("Completed\n");
			
		}
		
		catch (Exception exp) {
			System.out.println("\n I am inside a catch block. \n");
			System.out.println("Message is "+ exp.getMessage());
			System.out.println("Cause is " + exp.getCause());
			exp.printStackTrace();
		}
		
		
		finally {
			System.out.println("Finally block executed \n");
		}

	}
	
	public static void Wishlist() throws Exception {
		System.out.println("\n Double Inter-Market String \n");
		
		throw new ArithmeticException("\n Not valid operation \n");
	}

}
