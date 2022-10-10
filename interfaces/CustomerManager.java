package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	// Constructor
	public CustomerManager(ICustomerDal customerDal) { 
		this.customerDal = customerDal;
	}
	
	public void add() {
		// iş kodları
		customerDal.add();
	}
}
