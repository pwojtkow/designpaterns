
public class BodyFilter extends Filter{

	@Override
	public void handle(Mail mail) {
		if(mail.getBodyType() == "HTML") {
			System.out.println("Spam detected in Body!");
			// obsluga wykrycia spamu
		} else {
			this.nextHandler.handle(mail);
		}
	};
	
}
