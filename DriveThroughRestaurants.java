import java.util.*;

class MacD {
	
	private int Max = 5;
	private String CustomerName[] = new String[Max];
	private int front, rear;
	private static Scanner sc = new Scanner(System.in); 
	int a, b, c, d, w, x, y, z;
	
	MacD() {
		front = -1;
		rear = -1;
	}
	//===========================================================
	boolean isFull() {
		if(front==0 && (rear==Max-1))
			return true;
		else if(front == rear+1)
			return true;
		return false;
	}
	
	boolean isEmpty(){
		if((front == -1))
			return true;
		return false;
	}
	//===========================================================
	int size() {
		if(front == -1)
			return 0;
		return (rear-front+1);
	}
	
	void peek(){
        if (size() == 0)
            System.out.print("\n\t   ******!!NO CUSTOMER IN MACD QUEUE!!******\n");
        else
            System.out.println("\n\tStarting Customer in MaCD Queue is: "+CustomerName[front]);
    }
	//===========================================================
	int InsertOrder(String name){
		
		if(isFull()){
			System.out.println("\n**********!!!!CURRENTLY WE REACH TO MAXIMUM NUMBER OF ORDER!!!!**********");
			return -1; 
		}
		else{
			
		    selectMenu();
			if(front == -1){
				front = 0;
			}
			
			rear = (rear + 1)%Max;
			CustomerName[rear] = name;
			System.out.println("\t\t**** Inserted Customer Name is: "+name+" ****");
		}	
		return -1;
	}
	//===========================================================
	int RemoveCustomer(){
		
		String name;
		
		if(isEmpty()){
			System.out.print("\n\t   ******!!NO CUSTOMER IN MACD QUEUE!!******\n");
			return -1;
		} else {
			name = CustomerName[front];
			if(front == rear){
				front = -1;
				rear = -1;
			} else {
				front = (front+1)%Max;
			}
			
			System.out.println("\t    Deleted Customer Name is  : "+name);
			return 1;
		}
	}
	//===========================================================
	void selectMenu() {
		
		int ch;
		
		System.out.println("\n\t\t~~~~~~~~Select your order~~~~~~~~~~ ");
		System.out.println("\t\t\t1. Burger         : 250/-");
		System.out.println("\t\t\t2. Cold Coffee    : 50/-");
		System.out.println("\t\t\t3. French Fries   : 100/-");
		System.out.println("\t\t\t4. Chicken Burger : 150/-");
		System.out.println("\t\t\t0. Exit/Bill");
		
		do{
			System.out.println("\t\t~~~~~~~~Enter your choice~~~~~~~~~~ ");
			System.out.print("\t\t\t       ");
			ch=sc.nextInt();
			
			int count = 1;
			int bill = 0;
			int quantity;
			
			switch(ch) {
				
				case 0: 
					System.out.println("\t\t   TOTAL BILL AMOUNT IS : "+(w+x+y+z)+" Rs.");
					/*
					System.out.println("Amount paid ??: (yes/no)");
						String x=sc.next();
						if(x.equals("yes"))
							System.out.println("Thnak You... Visit again");
						else
							RemoveCustomer();*/
					break;
					
				case 1:
					int burger = 250;
					System.out.print("\t\tPlease specify the Burger quantity: ");
					quantity = sc.nextInt();
					a = quantity * burger;
					w = w + a;
					System.out.println("\t\tTotal Burger cost is: "+w+" Rs.\n");
					break;
					
				case 2: 
					int Coffe = 50;
					System.out.print("\t\tPlease specify the Cold Coffee quantity: ");
					quantity = sc.nextInt();
					b = quantity * Coffe;
					x = x + b; 
					System.out.println("\t\tTotal Cold Coffee cost is: "+x+" Rs.\n");
					break;
					
				case 3:
					int FrenchFries = 100;
					System.out.print("\t\tPlease specify the French Fries quantity: ");
					quantity = sc.nextInt();
					c = quantity * FrenchFries ;
					y = y + c;
					System.out.println("\t\tTotal French Fries cost is: "+y+" Rs.\n");
					break;
					
				case 4: 
					int ChickenB = 150;
					System.out.print("\t\tPlease specify the Chicken Burger quantity: ");
					quantity = sc.nextInt();
					d = quantity * ChickenB ;
					z = z + d;
					System.out.println("\t\tTotal Chicken Burger cost is: "+z+" Rs.\n");
					break;
				
				default: 
					System.out.println("\t\t   Please enter valid choice!!!");
			}
		} while(ch!=0);
		w = x = y = z = 0;
	}
	//===========================================================
	void display() {
		
		int i;	
		if(front == -1) {
			System.out.print("\n\t   ******!!NO CUSTOMER IN MACD QUEUE!!******");
		} else {
			System.out.print("\n\tCustomers Standing in MaCD Queue is: ");
		
			for(i = front; i!=rear; i=(i+1)%Max){
				System.out.print(CustomerName[i]+" ");
				System.out.print("-> ");
			}
			System.out.print(CustomerName[i]);
		}	
	}
}
//=================================================================
class DriveThroughRestaurants{
		
	public static void main(String[] args){
		
		MacD c1 = new MacD();
		String opt;
		boolean ex = true;
		boolean menu = true;
		
		while(ex){
			
			try{
				Scanner sc = new Scanner(System.in);
				do{
					System.out.print("=========================================================================");
					System.out.print("\n\t||\t\tLIST OF MENU \t\t\t\t||");
					System.out.print("\n=========================================================================");
					System.out.println("\n\t||\t1. ADD Customer order in McDonald's queue       ||");
					System.out.println("\t||\t2. REMOVE Starting position of customer\t\t||");
					System.out.println("\t||\t3. DISPLAY Customers in MacD Queue\t\t||");
					System.out.println("\t||\t4. STARTING Customer in Queue \t\t\t||");
					System.out.println("\t||\t5. TOTAL Customer in Queue\t\t\t||");
					System.out.print("\t||\t6. EXIT\t\t\t\t\t\t||");
					System.out.print("\n=========================================================================");
					System.out.print("\n\t\tENTER YOUR CHOICE    : ");
					int ch = sc.nextInt();
					
					switch (ch) {
						
						case 1:
							System.out.print("\t\tEnter Name of customer : ");
							String name = sc.next();
							c1.InsertOrder(name);
							break;
						case 2:
							c1.RemoveCustomer();
							break;
						case 3:
							c1.display();
							System.out.println();
							break;
						case 4:
							c1.peek();
							break;
						case 5:
							System.out.println("\n\tTotal Number of Customer in MaCD Queue is: "+c1.size());
							break;
						case 6:
							System.out.println("\n\t\t*****THANK YOU*****");
							System.exit(0);
							break;
						default:
							System.out.println("\t\tINVALID INPUT");
					}
					
					// System.out.print("\n\t\tDo you want to continue(y/n): ");
					// opt = sc.next();
				} while (menu);
				  ex = false;
			} catch(Exception e ) {
				System.out.println("\t***EXCEPTION OCCURED, PLEASE RECHECK YOUR INPUT***");
			}
		}
	}
} 