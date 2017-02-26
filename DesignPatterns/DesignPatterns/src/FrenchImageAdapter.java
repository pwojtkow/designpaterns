
public class FrenchImageAdapter implements Image{

	FrenchImage adaptee = new FranchImage();
	
	@Override
	public void crop() {
		adaptee.coupe();
		// plus inna logika zmieniajaca cos, np typ zwracany w coupe jest inny niz chcemy w crop
		
	}

	@Override
	public void turn() {
		adaptee.frenchTurn();
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

}
