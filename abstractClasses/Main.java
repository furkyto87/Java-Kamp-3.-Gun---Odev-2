package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		// abstract sınıflar asla new'lenemez !!! 
//		GameCalculator gameCalculator = new GameCalculator() {
		// abstract sınıfları new'lemek için mutlaka override metod kullanmak gerekir. 
//			@Override
//			public void hesapla() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
