package wipro;

public class main {

	public static void main(String[] args) {
		
	
		//anonymous class for InterestCalculate
		InterestCalculator interest=new InterestCalculator() {
			public void calculateInterest(double principal, double time, double rate) {
                double interest = (principal * time * rate) / 100;
                System.out.println("Simple Interest: " + interest);
               // calculateInterest(12000,5,2);
            
		}
		
	   };
	   interest.calculateInterest(12000,5,2);
	   
	   //anonymous class for EMICalculator
	   EMICalculator emi = new EMICalculator() {
           public void calculateEmi(double principal, double rate, int months) {
               double monthlyRate = rate / (12 * 100);  // Converting annual rate to monthly decimal
               double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                            (Math.pow(1 + monthlyRate, months) - 1);

               System.out.println("Monthly EMI: ₹" + emi);

           }
       };

       
       emi.calculateEmi(200000, 10.0, 24);
       
       // Anonymous class for CurrencyCalculator
       CurrencyCalculator converting = new CurrencyCalculator() {
           public void converter(double INR) {
               double USD = INR / 83.0; // Example conversion rate
               System.out.println("Converted Amount in USD: $" + USD);
           }
       };
       converting.converter(1000); // Example call
   
   }
	   
	
	

}

