package staticDemo;

// Bu tip sınıflar tekrar kullanılacağından asla static yapılmamalıdır. 
// Çünkü içeriği hep sabit kalır.
public class ProductManager {
	
	public void add(Product product) {
		
		// static İfadesi ile bir örneği oluşturulduğu için nesne oluşturulmaz.
		// ProductValidator validator = new ProductValidator();
		
		// Bu gibi tek kullanımlık yardımcı araçlar static yapılabilir.
		// Çünkü 1 kez kullanılacaktır. Kullanım kolaylığı sağlayacaktır.
		if(ProductValidator.isValid(product)) { // Bu şekilde örneği üzerinden erişilir.
			System.out.println("Eklendi");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
		// Yapıcı bloklarda (constructor) java'da new'leyince çalışır.
//		ProductValidator productValidator = new ProductValidator();
//		productValidator.bisey();
	}
}
