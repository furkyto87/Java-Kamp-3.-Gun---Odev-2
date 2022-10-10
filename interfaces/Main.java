package interfaces;

public class Main {

	public static void main(String[] args) {
		
//		Interface'lerde abstract sınıflar gibi new'lenemzler.
//		ICustomerDal customerDal = new ICustomerDal() {
//			
//			@Override
//			public void add() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
//		ICustomerDal customerDal = new OracleCustomerDal(); //Polimorfizm
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
// 		CustomerManager'ın constructor metodu ile customerDal parametresi gönderdik.
//		Bu nedenle hata veriyor. Yukarıda new içine karşılık gelen parametreyi yazdık.
//		customerManager.customerDal = new MySqlCustomerDal(); 
		customerManager.add();
	}

}
