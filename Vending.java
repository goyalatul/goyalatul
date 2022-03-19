import java.util.Scanner;
class Vending{
	public void TeaChoice(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please select your favorite tea flavor : ");
		String tea[] = {"Black Tea","Green Tea","Yellow Tea"};
		for(int i=0;i<tea.length;i++){
			System.out.println((i+1)+" for "+tea[i]);
		}
	System.out.print("Please Enter your choice : ");
	int c = s1.nextInt();
	if(c>3 || c<1){
		System.out.println("Please try again with correct entry");
	}
	else
		System.out.print("How much sugar will you like? Select from 0 to 3 unit : ");
		int s = s1.nextInt();
		if(s>3 || s<0){
			System.out.println("Please try again with unit between 0 to 3");
		}
	else
		System.out.print("How much milk will you like? Select from 0 to 3 unit : ");
		int m = s1.nextInt();
		if(m>3 || m<0){
			System.out.println("Please try again with unit between 0 to 3");
		}
	else
		System.out.println("YOUR "+tea[c-1]+" IS READY WITH "+s+" UNIT OF SUGAR AND "+m+" UNIT OF MILK");
	
	}
	public void CoffeeChoice(){
		Scanner s2 = new Scanner(System.in);
		System.out.println("Please select your favorite Coffee flavor : ");
		String coffee[] = {"Espresso","Americano","Latte Macchiato"};
		for(int i=0;i<coffee.length;i++){
			System.out.println((i+1)+" for "+coffee[i]);
		}
	System.out.print("Please Enter your choice : ");
	int c = s2.nextInt();
	if(c>3 || c<1){
		System.out.println("Please try again with correct entry");
	}
	else
		System.out.print("How much sugar will you like? Select from 0 to 3 unit : ");
		int s = s2.nextInt();
		if(s>3 || s<0){
			System.out.println("Please try again with unit between 0 to 3");
		}
	else
		System.out.print("How much milk will you like? Select from 0 to 3 unit : ");
		int m = s2.nextInt();
		if(m>3 || m<0){
			System.out.println("Please try again with unit between 0 to 3");
		}
	else
		System.out.println("YOUR "+coffee[c-1]+" IS READY WITH "+s+" UNIT OF SUGAR AND "+m+" UNIT OF MILK");
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Automatic Beverage Machine");
		System.out.print("What do want to purchase ? Enter 1 for tea and 2 for coffee : ");
		int t = sc.nextInt();
		Vending obj = new Vending();
		if(t==1){
			obj.TeaChoice();
		}
		else if(t==2){
			obj.CoffeeChoice();
		}
		else{
			System.out.println("Please try again");
		}
	}
}