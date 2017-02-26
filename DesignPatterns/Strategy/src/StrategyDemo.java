
public class StrategyDemo {

	public static void main(String[] args) {
		Company ngo = new Company("ngo", 123456);
		Company regular = new Company("regular", 123456);
		
		double a = ngo.calculateTax(new NgoStrategy());
		double b = regular.calculateTax(new RegularStrategy());
		
		System.out.println("NGO tax: " + a);
		System.out.println("REGULAR tax:" + b);
	}

}
