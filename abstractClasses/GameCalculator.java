package abstractClasses;

public abstract class GameCalculator {
	// abstract metodlar, abstract classların içerisinde mutlaka olmak zorunda değildir.
	public abstract void hesapla();
	
//	public void hesapla() {
//		System.out.println("Puanınız : 100");
//	}
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
