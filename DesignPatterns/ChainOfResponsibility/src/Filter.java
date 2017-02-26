
public abstract class Filter {

	protected Filter nextHandler;
	
	public void handle(Mail mail){};
	public void setNextHandler(Filter nextFilter){
		this.nextHandler = nextFilter;
	}
	public Filter getNextHandler() {
		
		return nextHandler;
	}
	
}
