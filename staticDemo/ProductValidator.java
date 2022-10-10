package staticDemo;
// Ana class javada static olamıyor.
public class ProductValidator {
	// static constructorlar, bu şekilde new yapmadan çalışır.
	static { 
		System.out.println("Static Yapıcı blok çalıştı");
	}
	
	public ProductValidator() {  // Constructor
		System.out.println("Yapıcı blok çalıştı");
	}
	
	// isValid nesnesini static olarak tanımladık.
	public static boolean isValid(Product product) { 
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	//Bir temel class içerisinde kullanılabilir.
	public static class BaskaBirClass {  // inner class
		public static void sil() {
			
		}
	}
}
