package Lab03;

import java.util.ArrayList;
import java.util.List;

public class TestMain03 {
	public static void main(String[] args) {
		Address location = new Address("Raman Street", "HSR Layout", "Bangalore", "Karnataka");
		
		Company company1 = new Company(398,"Fairsure Cosmetics",location);
//----------------------------------------------------------------------		
		Product soap = new Product(01,"Glowing bar");
		Product shampoo = new Product(02,"AntiHairfall shampoo");
		Product facewash = new Product(03,"Power bright");
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(soap);
		products.add(shampoo);
		products.add(facewash);
		
		company1.setProducts(products);
//----------------------------------------------------------------------			
		Customer person1 = new Customer(63,"Raghul");
		Customer person2 = new Customer(87,"Raghuvaran");
		
		List<Customer> customers = new ArrayList<Customer>();
		
		customers.add(person1);
		customers.add(person2);
		
		company1.setCustomers(customers);
		
//----------------------------------------------------------------------		
		System.out.println("Company Address: "+location.toString());
		System.out.println("Company Id: "+company1.getId());
		System.out.println("Products List: "+company1.getProducts());
		System.out.println("Customers List: "+company1.getCustomers());
		
	}

}
