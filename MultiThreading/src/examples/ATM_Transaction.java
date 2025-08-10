package examples;

 class ATM_Transaction_2 {
	private int acct_balance = 10000;
	
	public synchronized void withdraw_amt(String user,int amount){

		
		if (acct_balance >= amount) {
            System.out.println(user + " is trying to withdraw " + amount);
            acct_balance = acct_balance-amount;	
            System.out.println(user + " successfully withdrawn " + amount);
            System.out.println("Available Balance: " + acct_balance);
        } else {
            System.out.println(user + " - Insufficient Balance! Current Balance: " + acct_balance);
        }

	}

		public int getBalance(){

			return acct_balance;

		}	
		
		public class ATM_Transaction{
			public static void main(String[] args) {
				ATM_Transaction_2 account = new ATM_Transaction_2();
				
				//user 1
				Thread t1=new Thread(
						()->{
							account.withdraw_amt("Ram", 1000);
						});
				
				// User 2 
		        Thread t2 = new Thread(
		        		() -> {
		                      account.withdraw_amt("Sita", 1000);
		                });
		        
		        t1.start();
				t2.start();

				try{
					t1.join();

					t2.join();

				}catch(InterruptedException ie){

						ie.printStackTrace();	

				}

			System.out.println("Balance Left: "+account.getBalance());
						
			}
		}
		
		
		
		


}
