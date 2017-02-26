
public class RegularStrategy implements TaxStrategy{

	@Override
	public double calculate(Company company) {
		
		return (company.getIncome() * 1.23);
	}

}
