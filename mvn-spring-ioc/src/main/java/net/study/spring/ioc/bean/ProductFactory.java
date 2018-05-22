package net.study.spring.ioc.bean;

public class ProductFactory {
	private static Product product= new Product(); 
	
	
	public static void setProduct(Product product) {
		ProductFactory.product = product;
	}


	public static Product creatProduct(){
		return new Product();
	} 
}
