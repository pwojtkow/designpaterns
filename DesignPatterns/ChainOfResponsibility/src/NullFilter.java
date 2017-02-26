
public class NullFilter extends Filter{

	public void handle(Mail mail) {
		System.out.println("Nie SPAM");
	}
	
}
