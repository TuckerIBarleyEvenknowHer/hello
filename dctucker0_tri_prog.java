package dctucker0_tri_prog;
import java.util.Scanner;


public class dctucker0_tri_prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner KBin =new Scanner(System.in);
		//variables
double value1,value2,value3;
char chocie,again;

	 
	 
	 
	 
	 
	//start of the program 
		System.out.println("Welcome To Dzion's triangle Program  ");
		
		
		System.out.println("please enter a value for side length 1");
		value1=KBin.nextDouble();
		System.out.println("please enter a value for side length 2");
		value2= KBin.nextDouble();
		System .out.println("please enter a value for side length 3");
		value3=KBin.nextDouble();
	
		
		//breaking it down
		
		if (value1<0||value2<0||value3<0){
			System.out.println("sorry you a side length is less than zero. please enter a please insert a value greater than zero):");
		}
		else
		{
		if(value1>value2+value3||value2>value1+value3||value3>value2+value1){
				System.out.println("this is not a triangle try again");}
				//scalene
			
		else if (value1 !=value2&&value2!=value3&&value3!=value1){
		System.out.println("You have a Scalene triangle");}

	//equilateral
		
	else if (value1 ==value2&&value2==value3&&value2==value3){
			System.out.println("You have an equilateral triangle");}
	
	else if(value1 == value2||value2==value3||value3==value1){
	System.out.println("You have an isosceles Trianlge");}

	


				
		}
	}
}	
		
		

		
		
		




