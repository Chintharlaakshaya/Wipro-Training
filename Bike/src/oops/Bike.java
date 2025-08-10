package oops;

public class Bike {
	
	private String model;
	private int manf_year;
	
	
	//constructor
	public Bike() {
		System.out.println("Its a Demo Bike");
	}
	
	

	public Bike(String model, int manf_year) {
		//super();
		this.model = model;
		this.manf_year = manf_year;
	}


	//Getters Setters to get and set the values

	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getManf_year() {
		return manf_year;
	}



	public void setManf_year(int manf_year) {
		this.manf_year = manf_year;
	}



	@Override
	public String toString() {
		return "Bike [model=" + model + ", manf_year=" + manf_year + "]";
	}
	
	
	
	
	

}
