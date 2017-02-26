
public class SenderFilter extends Filter{

	@Override
	public void handle(Mail mail) {
		if(mail.getSender() == "Chiny") {
			System.out.println("Spam detected in Sender!");
			// obsluga wykrycia spamu
		} else {
			this.nextHandler.handle(mail);
		}

	};
	
}
