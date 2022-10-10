package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
//  final kullanıldığında miras alan sınıfta metod override edilemez !!!
//	public final double hesapla(double tutar) {
//		return tutar * 1.18;
//	}
	
}
