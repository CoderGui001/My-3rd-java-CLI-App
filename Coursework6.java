 import java.util.*;
 import java.text.DecimalFormat;
 

 class Coursework6 {
	 
	public final static void clearConsole() {
		try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		  }
		} catch (final Exception e) {
			e.printStackTrace();
			
		}
	}
	 
	public static void MainMenu(){
	Scanner input=new Scanner(System.in);	
		
		System.out.println("\n");
			System.out.println("						    COURSEWORK6");
			System.out.println("				             Tharaka Gihan Dhananjaya");
			System.out.println("	                                            iCM 104011");
		    System.out.print("\n");
		    
		    System.out.println("\r\n\t\t\t\t\t __   ______   ________  ________ \r\n\t\t\t\t\t|  \\ /      \\ |        \\|        \\\r\n\t\t\t\t\t \\$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$\r\n\t\t\t\t\t|  \\| $$   \\$$| $$__       | $$   \r\n\t\t\t\t\t| $$| $$      | $$  \\      | $$   \r\n\t\t\t\t\t| $$| $$   __ | $$$$$      | $$   \r\n\t\t\t\t\t| $$| $$__/  \\| $$_____    | $$   \r\n\t\t\t\t\t| $$ \\$$    $$| $$     \\   | $$   \r\n\t\t\t\t\t \\$$  \\$$$$$$  \\$$$$$$$$    \\$$   \r\n\t\t\t\t\t");
		    
		    System.out.println("\r\n  _______             __   __   _____              _         _____   _    _   _                   _______    ____    _____  \r\n |__   __|     /\\     \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\ \r\n    | |       /  \\     \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |\r\n    | |      / /\\ \\     > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  / \r\n    | |     / ____ \\   / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\ \r\n    |_|    /_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\\r\n     ");    
		        
		    System.out.println("===============================================================================================================================");    
		
	
		
				
			System.out.println("\n");
			System.out.println("      [1] Withholding Tax");
			System.out.println();
			System.out.println("      [2] Payable Tax");
			System.out.println();
			System.out.println("      [3] Income Tax");
			System.out.println();
			System.out.println("      [4] Social security Contribution Levy (SSCL) Tax");
			System.out.println();
			System.out.println("      [5] Leasing Payment ");
			System.out.println();
			System.out.println("      [6] Exit ");
			System.out.println();
			
	} 
	public static void WithHoaldingTax(){
		Scanner input=new Scanner(System.in);
		
				System.out.println("+-------------------------------------------------------------+");
				System.out.println("|                     WITHHOLDING TAX                         |");
				System.out.println("+-------------------------------------------------------------+");
				
				System.out.println();
				System.out.println("      [1] Rent Tax");
				System.out.println();
				System.out.println("      [2] Bank Interest Tax");
				System.out.println();
				System.out.println("      [3] Dividend Tax");
				System.out.println();
				System.out.println("      [4] Exit");
				System.out.println();
						
				
				
		
		
	}
	public static void RentTax(){
		
						System.out.println("+-------------------------------------------------------------+");
						System.out.println("|                          RENT TAX                           |");
						System.out.println("+-------------------------------------------------------------+");
		
	}
	public static void BANKINTERESTTAX(){
		
						System.out.println("+-------------------------------------------------------------+");
						System.out.println("|                     BANK INTEREST TAX                       |");
						System.out.println("+-------------------------------------------------------------+");	
		
	}
	public static void DIVIDENDTAX(){
		
						System.out.println("+-------------------------------------------------------------+");
						System.out.println("|                        DIVIDEND TAX                         |");
						System.out.println("+-------------------------------------------------------------+");
		
		
		}
	public static void PAYABLETAX(){
		Scanner input=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("|                        PAYABLE TAX                          |");
			System.out.println("+-------------------------------------------------------------+");
			
			System.out.print("Enter your employee payment per month:  ");
			int t=input.nextInt();
			
			double pt=(25000+(((t-266667)*30)/100));
			double rounded=Math.round(pt/1000.0) * 1000.0;
			String pt2=df.format(rounded);
			System.out.println(266667<t&t<=308333?"You have to pay Payable Tax per month: "+pt2:"" );
			
			
			System.out.println(t<=100000?"You don't have to Payable Tax...":"");
			
			System.out.println(100000<t&t<=141667?"You have to pay Payable Tax per month: "+((t*6)/100):"" );
			
			System.out.println(141667<t&t<=183333?"You have to pay Payable Tax per month: "+(2500+(((t-141667)*12)/100)):"" );
			
			System.out.println(183333<t&t<=225000?"You have to pay Payable Tax per month: "+(7500+(((t-183333)*18)/100)):"" );
			
			System.out.println(225000<t&t<=266667?"You have to pay Payable Tax per month: "+(15000+(((t-225000)*24)/100)):"" );
			
			System.out.println(t>308333?"You have to pay Payable Tax per month: "+(37500+(((t-308333)*36)/100)):"" );
		
		
		}
	public static void INCOMETAX(){
		
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("|                        INCOME TAX                           |");
			System.out.println("+-------------------------------------------------------------+");
			
			
		
		}
	public static void SSCLTax(){
	Scanner input=new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("0.00");	
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("|       SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX          |");
			System.out.println("+-------------------------------------------------------------+");
			
			
					
			System.out.print("Enter value of Good or Service:  ");
			int d1=input.nextInt();
			
			double sale_tax=(d1*2.5)/100;
			double Value_of_goods=d1+sale_tax;
			double Final_value=(Value_of_goods*15)/100;
			
			double SSCL_TAX=sale_tax+Final_value;
			String SSCL=df.format(SSCL_TAX);
			
			
			System.out.println("You have to pay SSCl Tax : "+SSCL);
		
		
		} 
	public static void LEASINGPAYMENTTax(){
		
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("|                     LEASING PAYMENT                         |");
			System.out.println("+-------------------------------------------------------------+");
			
			System.out.println();
			System.out.println("      [1] Calculate Monthly Installment");
			System.out.println();
			System.out.println("      [2] Search Leasing Category");
			System.out.println();
			System.out.println("      [3] Find leasing Amount");
			System.out.println();
			System.out.println("      [4] Exit");
			System.out.println();
			
					
		
		
		} 
	public static void CALCULATE_LEASING_PAYMENT(){
		
					System.out.println("+-------------------------------------------------------------+");
					System.out.println("|                CALCULATE LEASING PAYMENT                    |");
					System.out.println("+-------------------------------------------------------------+");
					
					
		
	}
	public static void SEARCH_LEASING_CATEGORY(){
		
		
					System.out.println("+-------------------------------------------------------------+");
					System.out.println("|                   SEARCH LEASING CATEGORY                   |");
					System.out.println("+-------------------------------------------------------------+");
						
		
		
		} 
	public static void  FIND_LEASING_AMOUNT(){
		
		
					System.out.println("+-------------------------------------------------------------+");
					System.out.println("|                     FIND LEASING AMOUNT                     |");
					System.out.println("+-------------------------------------------------------------+");
						
		
	}
	
	
	 
	 
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		L1:do{
			
			
			MainMenu();
			System.out.print("Enter an option to continue -> ");
			int a=input.nextInt();
			clearConsole();
			
			
			
			
			switch(a) {
			
			
				case 1 :  
				
			L2:do{
				
				
				WithHoaldingTax();	
				System.out.print("Enter an option to continue -> ");
				int b=input.nextInt();
				clearConsole();	
				
					L3:do{
						
						if(b==1){
							
						RentTax();
						
						System.out.print("Enter your rent         : ");
						double rent=input.nextDouble();
						
												
						double tax1=(((rent-100000)*10)/100);
						String tax2= df.format(tax1); 
						
						System.out.println(rent>100000?"You have to pay Rent Tax :" +tax2:"");
						System.out.println(rent>=0&&rent<=100000?"You dont have to pay rent tax....":"");
						System.out.println(rent<0?"        Invalid input.....\n\n":"");
						System.out.println();
								
						System.out.print("Do you want to calculate another rent Tax(Y/N)?");
						char ch1=input.next().charAt(0);
						clearConsole();
								
								if(ch1=='Y'||ch1=='y'){
									
									continue L3;
									
									
								}
								
								else if(ch1=='N'||ch1=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
								
								
								if(rent<0){
								
								
									
								System.out.print("Do you want to enter the correct value again (Y/N): ");
								char ch2=input.next().charAt(0);
								clearConsole();
								
										if(ch2=='Y'||ch2=='y'){
									
											continue L3;
									
										}
								
										else if(ch2=='N'||ch2=='n'){
									
											continue L1;
									
										}
										
										else{
								
									
									
										}
										
								
								
								
								}
								
						}
						
						if(b==2){
							
						BANKINTERESTTAX();
						
						System.out.print("Enter your Bank Interest Tax        : ");
						double BIT=input.nextDouble();
						
						double BIT1=((BIT*5)/100);
						String BIT2= df.format(BIT1); 
						
						System.out.println("You have to pay Bank Interest Tax per year :" +BIT2);
						System.out.println();	
						
						System.out.print("Do you want to calculate another Bank Interest Tax(Y/N)?");
						char ch1=input.next().charAt(0);
						clearConsole();
								
								if(ch1=='Y'||ch1=='y'){
									
									continue L3;
									
								}
								
								else if(ch1=='N'||ch1=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
						
						
						
						
							
						}
						
						
						if(b==3){
							
						DIVIDENDTAX();
						
						System.out.print("Enter your Dividend Tax        : ");
						double DIT=input.nextDouble();
						
						double DIT1=(((DIT-100000)*14)/100);
						String DIT2= df.format(DIT1); 
						
						System.out.println(DIT>100000?"You have to pay Rent Tax :" +DIT2:"You dont have to pay rent tax....");
						System.out.println(); 
						
						System.out.print("Do you want to calculate another Dividend Tax Tax(Y/N)?");
						char ch1=input.next().charAt(0);
						clearConsole();
								
								if(ch1=='Y'||ch1=='y'){
									
									continue L3;
									
								}
								
								else if(ch1=='N'||ch1=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
						
						
						
						
						}
						
						if(b==4){
							
						continue L1;
							
							}
						
					}while(true);
			
				}while(true);
					
				
					
			case 2 :
			
			L4:do{
			
			
			PAYABLETAX();
			
					
			
			
			System.out.print("Do you want to calculate another Payable  Tax(Y/N)?");
			char ch3=input.next().charAt(0);
			clearConsole();
								
								if(ch3=='Y'||ch3=='y'){
									
									continue L4;
									
								}
								
								else if(ch3=='N'||ch3=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
			
			
			
			
						
			break;					
			}while(true);
			
			case 3:
			
			L5:do{
				
			INCOMETAX();
					
			System.out.print("Enter your total income per year:  ");
			int d=input.nextInt();
			
			double it=(450000+(((d-3700000)*36)/100));
			String it2=df.format(it);
			System.out.println(d>3700000?"You have to pay Income Tax per year: "+it2:"" );
			
			System.out.println(d<=1200000?"You don't have to Income Tax...":"");
			
			System.out.println(1200000<d&d<=1700000?"You have to pay Income Tax per year: "+((d*6)/100):"" );
			
			System.out.println(1700000<d&d<=2200000?"You have to pay Income Tax per year: "+(30000+(((d-1700000)*12)/100)):"" );
			
			System.out.println(2200000<d&d<=2700000?"You have to pay Income Tax per year: "+(90000+(((d-2200000)*18)/100)):"" );
			
			System.out.println(2700000<d&d<=3200000?"You have to pay Income Tax per year: "+(180000+(((d-2700000)*24)/100)):"" );
			
			
			System.out.println(3200000<d&d<=3700000?"You have to pay Income Tax per year: "+(300000+(((d-3200000)*30)/100)):"" );
			
			System.out.print("Do you want to calculate another Income Tax (Y/N): ");
						char ch4=input.next().charAt(0);
						clearConsole();
								
								if(ch4=='Y'||ch4=='y'){
									
									continue L5;
									
								}
								
								else if(ch4=='N'||ch4=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
			
			
			
			break;
			
			}while(true);
			
			case 4:
			
			L6:do{
				
			SSCLTax();
			
			System.out.print("Do you want to calculate another SSCl Tax (Y/N): ");
			char ch5=input.next().charAt(0);
			clearConsole();
								
								if(ch5=='Y'||ch5=='y'){
									
									continue L6;
									
								}
								
								else if(ch5=='N'||ch5=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
			

			break;
			
			}while(true);
			
			case 5:
			
			L7:do{
			
			LEASINGPAYMENTTax();
			System.out.print("Enter an option to continue -> ");
			int e=input.nextInt();
			clearConsole();
					
					
				L8:do{
					
										
					if(e==1){
						
					CALCULATE_LEASING_PAYMENT();
					System.out.print("Enter lease amount         : ");
					double A=input.nextDouble();
					
					System.out.print("Enter annual interest rate         : ");
					double ii=input.nextDouble();
					
										
					System.out.print("Enter number of year         : ");
					double year=input.nextDouble();
					
					
						  if(year>5){
						
								System.out.println("Invalid number of year...Enter the correct value again...");
								
								System.out.print("Enter number of year         : ");
								double year2=input.nextDouble();
								
								
								
								double i=(ii/12)/100;
								double n=year2*12;
								double j=(i+1);
								double K=Math.pow(j,n);
								double MI= (A*i*K)/(K-1);
								String MI2=df.format(MI);
					
								System.out.println("Your monthly instalment : "+MI2);  
					
								System.out.print("Do you want to calculate another monthly instalment (Y/N): ");
								char ch5=input.next().charAt(0);
								clearConsole();
								
								if(ch5=='Y'||ch5=='y'){
									
									continue L8;
									
								}
								
								else if(ch5=='N'||ch5=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
								
								
								
							}
						
							else{
					
							
								
								double i=(ii/12)/100;
								double n=year*12;
								double j=(i+1);
								double K=Math.pow(j,n);
								double MI= (A*i*K)/(K-1);
								String MI2=df.format(MI);
					
								System.out.println("Your monthly instalment : "+MI2);  
					
								System.out.print("Do you want to calculate another monthly instalment (Y/N): ");
								char ch5=input.next().charAt(0);
								clearConsole();
								
								if(ch5=='Y'||ch5=='y'){
									
									continue L8;
									
								}
								
								else if(ch5=='N'||ch5=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
								
							}
								
								
								
								
							
					
					
					
					
								
								
					
					
					
					
							
					}
					
			
					
					if(e==2){
						
					SEARCH_LEASING_CATEGORY();
					System.out.print("Enter lease amount        : ");
					double a1=input.nextDouble();
					
					System.out.print("Enter annual interest rate       : ");
					double a2=input.nextDouble();
					
					   
					double i=(a2/12)/100;
					   int n=3*12;
					double j=(i+1);
					double K=Math.pow(j,n);
					double MI= (a1*i*K)/(K-1);
					String MI2=df.format(MI);
					
							
					System.out.println("your monthly instalment for 3 year leasing plan - "+MI2);
					
					
					double i1=(a2/12)/100;
					   int n1=4*12;
					double j1=(i1+1);
					double K1=Math.pow(j1,n1);
					double MI1= (a1*i1*K1)/(K1-1);
					String MI21=df.format(MI1);
					
					System.out.println("your monthly instalment for 4 year leasing plan - "+MI21);
					
					double i2=(a2/12)/100;
					   int n2=5*12;
					double j2=(i2+1);
					double K2=Math.pow(j2,n2);
					double MI3= (a1*i2*K2)/(K2-1);
					String MI22=df.format(MI3);
					
					System.out.println("your monthly instalment for 5 year leasing plan - "+MI22);
					
					System.out.print("Do you want to calculate another SSCl Tax (Y/N): ");
					char ch5=input.next().charAt(0);
					clearConsole();
								
								if(ch5=='Y'||ch5=='y'){
									
									continue L8;
									
								}
								
								else if(ch5=='N'||ch5=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
			
					
					
					
						
						
					}
					
					
					if(e==3){
					FIND_LEASING_AMOUNT();
					System.out.print("Enter the monthly lease payment amount you can afford : ");
					double a3=input.nextDouble();
					
					System.out.print("Enter number of year : ");
					double a4=input.nextDouble();
					
					System.out.print("Enter annual interest rate : ");
					double a5=input.nextDouble();
					
					double i5=(a5/12)/100;
					double n5=a4*12;
					double j5=(i5+1);
					double K5=Math.pow(j5,n5);
					double A5= (a3*(K5-1))/(i5*K5);
					int roundedNumber = (int) Math.ceil(A5);
					String MI25=df.format(roundedNumber);
					
				
					System.out.println("You can get Lease Amount : "+MI25); 
					
					System.out.print("Do you want to  another monthly instalment (Y/N): ");
					char ch5=input.next().charAt(0);
					clearConsole();
								
								if(ch5=='Y'||ch5=='y'){
									
									continue L8;
									
								}
								
								else if(ch5=='N'||ch5=='n'){
									
									continue L1;
									
								}
								else{
								
									
									
								}
					
					
				
					}
			
					if(e==4){
					
					continue L1;
						
					}
			
			break;
			
					}while(true);
			
			}while(true);
			
			
			
			case 6:
				
			System.exit(0); break;
			
			}
			
		}while(true);
		
		
		
	}
}

