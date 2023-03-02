package com.dur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price) {
		this.id = id;
		this.name=name;
		this.price = price;
	}
}

public class StreamExample {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1,"hp",2000f));
		productList.add(new Product(2,"dell",3000f));
		productList.add(new Product(3,"Apple",2800f));
		
		List<Float> productPice = productList.stream()
				.filter(p->p.price>2000)
				.map(p->p.price)
				.collect(Collectors.toList());
		System.out.println(productPice);

}
}
