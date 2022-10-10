package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	// Overriding (miras aldığı sınıfı eziyor)
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
