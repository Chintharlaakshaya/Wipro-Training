package oops;

public class PhysicalProductOrder extends Order{

	public PhysicalProductOrder(String order_id) {
		super(order_id);
	
	}

	@Override
	void process_order() {
		System.out.println("Shipping physical product for "+order_id);
		
	}
	
	

}
