
public class MainClass {

	public static void main(String[] args) {
	
		Mail mail1 = new PolandMail("Wiadomosc", "nieHTML", "Polska");
		Mail mail2 = new ChinaMail("dluuuuuga wiadomsc od Pana Chinczyka", "TML", "Chiny");
		
		Filter f1 = new SubjectFilter();
		Filter f2 = new BodyFilter();
		Filter f3 = new SenderFilter();
		Filter f4 = new NullFilter();
		
		f1.setNextHandler(f2);
		f2.setNextHandler(f3);
		f3.setNextHandler(f4);
		
		
		f1.handle(mail1);
		
	}
	
}
