
public class Core {
	public void doSomething() {
		String[] args = {"Ala", "ma", "kota"};
		EventDispatcher.dispatch("nazwa.zdarzenia", args);
	}
}
