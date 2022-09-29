package springaop;

public class ProductServiceImpl implements ProductService {

	
	public ProductServiceImpl() {
		
	}
	
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public void display() {
		System.out.println("Inside the display method..");
	}
	/*
	@Override
	public void display(int a) {
		// TODO Auto-generated method stub
		System.out.println("Inside the display method...");
		System.out.println("The value of a :" +a);
		
	}
*/
	
}
