package examples;

//Process Synchronization

class BankAccount{

	private int acct_balance = 10000; // user 1 12000

	public synchronized void deposit_amt(int amount){

		acct_balance = acct_balance+amount;

		System.out.println("Amount Deposited: "+amount);

		System.out.println("BalanceAmount: "+acct_balance);

	}

	public synchronized void withdraw_amt(int amount){

		if(acct_balance>=amount){

			acct_balance = acct_balance-amount;			

			System.out.println("Amount Withdrawn: "+amount);

			System.out.println("BalanceAmount: "+acct_balance);

		}

		else{

			System.out.println("Insufficient Balance in your account"+acct_balance);

		}

	}

		public int getBalance(){

			return acct_balance;

		}		

}


class BankTransaction{

	public static void main(String[] args){

		BankAccount bankAccount = new BankAccount();

		Thread t1 =new Thread(

		()-> {

			for(int i=1;i<5;i++){

				bankAccount.deposit_amt(1000);

			try{

				Thread.sleep(500);

			}catch(InterruptedException ie){

				ie.printStackTrace();	

			}

			}				

		});

		Thread t2 =new Thread(

		()-> {

			for(int i=1;i<5;i++){

				bankAccount.withdraw_amt(3000);

			try{

				Thread.sleep(500);

			}catch(InterruptedException ie){

				ie.printStackTrace();	

			}

			}				

		});

		t1.start();

		t2.start();

		try{

			t1.join();

			t2.join();

		}catch(InterruptedException ie){

				ie.printStackTrace();	

		}

	System.out.println("Balance Left: "+bankAccount.getBalance());

	}

}	

/**Simulate a Bank ATM system where multiple users withdraw 

money simultaneously.

Problem Statement:

==================

You have a bank account with a balance of 1000 units. 

Two users try to withdraw money from this account at the 

same time using different ATM machines (threads). 

Implement multithreading to simulate this scenario and 

make sure the account balance does not go below zero.*/
