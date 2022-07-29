package Lab03;

//import java.util.ArrayList;
//import java.util.List;

public class Customer {
		private int id;
		private String name;
		
//		List<Customer> customers = new ArrayList<Customer>();
		
//		public List<Customer> getCustomers() {
//			return customers;
//		}
//		public void setCustomers(List<Customer> customers) {
//			this.customers = customers;
//		}
		public Customer(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + "]";
		}
		
}
