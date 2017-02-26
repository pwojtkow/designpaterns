
public class ObserverDemo {

	public static void main(String[] args) {
		Core coreSystem = new Core();
		
		EventDispatcher.connect("nazwa.zdarzenia", new FirstPluginImpl());
		EventDispatcher.connect("nazwa.zdarzenia", new FirstPluginImpl());
		EventDispatcher.connect("nazwa.zdarzenia", new SecondPluginImpl());
		EventDispatcher.connect("nazwa.zdarzenia", new SecondPluginImpl());
		
		coreSystem.doSomething();

	}

}
