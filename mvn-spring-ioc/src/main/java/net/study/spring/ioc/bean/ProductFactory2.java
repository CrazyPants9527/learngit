package net.study.spring.ioc.bean;

public class ProductFactory2 {
	private  Product product= new Product(); 
	
	
	public  void setProduct(Product product) {
		this.product=product;
	}


	public  Product creatProduct(){
		return new Product();
	} 
}
