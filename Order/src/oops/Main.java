package oops;

public class Main {

	public static void main(String[] args) {
		
		Order physicalPro = new PhysicalProductOrder("1001");
		Order digitalPro = new DigitalProductOrder("2001");
		Order servicePro = new ServiceOrder("3001");
		
		physicalPro.process_order();
        physicalPro.print_order_summary();
        System.out.println();

        
		digitalPro.process_order();
        digitalPro.print_order_summary();
        System.out.println();

        
		servicePro.process_order();
        servicePro.print_order_summary();
        
		
	

	}

}
