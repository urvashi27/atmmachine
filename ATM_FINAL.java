
	import java.util.Scanner;
public class ATM_FINAL 
{

	 int pin;
	 
	    private static Scanner sc; 
	    static float balance = 0; 
	    static float anotherTransaction;
	    float deposit;
	   

		
		//private static float freshbal;
	 
	    public static void main(String args[])
	    {
	        sc = new Scanner(System.in);
	        int pin = 12345;

			System.out.println("WELCOME TO THE BANK .");
			System.out.print("ENTER YOUR PIN: ");
			int entry = sc.nextInt();

			while ( entry != pin )
			{
				System.out.println("\nINCORRECT PIN. TRY AGAIN.");
				System.out.print("ENTER YOUR PIN: ");
				entry = sc.nextInt();
			}

			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
			 anotherTransaction();
			
		}
	    
	    
	  
	    private static void transaction()
	    {
	        
	 
	        int choice; 
	 
	        System.out.println("Please select an option"); 
	        System.out.println("1.Fast cash");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Deposit");
	        System.out.println("4. Balance");
	        System.out.println("5.transfer");
	 
	        choice = sc.nextInt();
	 
	        			
						switch(choice){
						case 1:
							 
		                    int fastCash = fastCash(fastCash(0));
		                    balance = balance - fastCash;
		                    break;
						
							
	            case 2:
	            	 
	                System.out.println("Please enter amount to withdraw: "); 
	              float withdrawamount = sc.nextFloat();
	                if(withdrawamount > balance){
	                    System.out.println("You have insufficient funds\n\n"); 
	                    anotherTransaction(); 
	                } else {
	                    
	                     
	                    balance = balance - withdrawamount; 
	                    System.out.println("You have withdrawn "+withdrawamount+" and your new balance is "+balance+"\n");
	                    anotherTransaction(); 
	                }
	            break; 
	 
	            case 3:
	            	
	                float deposit; 
	                System.out.println("Please enter amount you would wish to deposit: "); 
	                deposit = sc.nextFloat();
	                balance = balance + deposit;
	                System.out.println("You have deposited "+deposit+" new balance is "+balance+"\n");
	               anotherTransaction();
	            break; 
	 
	            case 4:
	                // this option is to check balance 
	                System.out.println("Your balance is "+balance+"\n");
	                anotherTransaction(); 
	            break;
	            
	            case 5:
	            	
	            	float transframount;
	            	System.out.println("Please enter a account number ");
	           int accountno=sc.nextInt();
	            System.out.println("Please enter amount you would wish to transfer: ");
	            transframount=sc.nextFloat();
	            if(transframount<balance)
                {
                	System.out.println("your amount is successfuly transfered ");
                	balance = balance-transframount;
                	System.out.println("Your balance is="+balance);
                	
                }
                
                else {
                	System.out.println("Insufficient balaceaceance");
                }
	            anotherTransaction();
	            break;
	        	
	            
	            
	            	
	            
					
	        }
	 
	    }
	    static int fastCash(int amount)
	   
	    {
	      //Scanner a=new Scanner(System.in);
	    	 
	       
	       System.out.println("1. $20.00\n2. 40.00\n3. 80.00\n4. 100.00\n");
	       //int ch=a.nextInt();
	      // System.out.println("Enter  Choice Amount "+ ch);
	    	
	    	int ch;
	        System.out.println("1. $20.00");
	        System.out.println( "2. 40.00");
	        System.out.println(" 3. 80.00");
	        System.out.println ("4. 100.00");
	        
	        ch = sc.nextInt();
	        anotherTransaction();
	        
	        

	        switch (ch)
	        {
	        case 1:
	            amount = 20;
	            

	        case 2:
	            amount = 40;
	           
	            break;
	            

	        case 3:
	            amount = 80;
	            
	            break;
	           

	        case 4:
	            amount = 100;
	            
	            break;
	            
	            
	            
default:
	        case 5:
	        	System.out.println("Invalid choice"+ch);
	        	 anotherTransaction();
	        	
	        	
	        }
			return ch;
			 
	        }
	    
	        
	        

	       
	        
	  
           
           
	    
	 
	    private static void anotherTransaction()
	    {
	        System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit");
	        anotherTransaction = sc.nextInt();
	        if(anotherTransaction == 1){
	            transaction(); 
	        } else if(anotherTransaction == 2)
	        {
	            System.out.println("Thanks for choosing us. Good Bye!");
	        } else {
	            System.out.println("Invalid choice\n\n");
	            anotherTransaction();
	        }
	    }
	

}
