
public class SubjectFilter extends Filter{

	@Override
	public void handle(Mail mail) {
		if(mail.getSubject().length() >= 50) {
			System.out.println("Spam detected in Subject!");
			// obsluga wykrycia spamu
		} else {
			this.nextHandler.handle(mail);
		}
	};
	
}
