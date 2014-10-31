import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
* @author Oscar
* Create a new Cycle, prompt the user to enter the number of wheels and weight
* If the values are less than or equal to zero.  Add or use the appropriate try and/or catch blocks. 
*/
public class Cycle {
	static double numberOfWheels;
	static double weight;	
	static Scanner scan = new Scanner(System.in);
	public Cycle(double numberOfWheels, double weight){
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
		//constructor of cycle

	}
	@Override
	public String toString() {
		return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight
				+ "]";
	}
	public static void main(String[] args) throws ValueException {
		// TODO Auto-generated method stub
			//prompt user to enter the number of wheels and weight
		System.out.println("Insert number of wheels");
		double NumberOfWheels = scan.nextDouble();
		System.out.println("Insert weight");
		double Weight = scan.nextDouble();
		//use the constructor of Cycle
		try{
			setData(NumberOfWheels,Weight);
		}
		//catch exception
		catch(Exception ValueMismatch){
			throw new ValueException("Values cannot be less than or equal to zero");	
		}
		String fileName="Cycle.txt";
		File file =new File(fileName);
		PrintWriter output=null;
		//
		try{
			output=new PrintWriter(fileName);
			output.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not exists");
			//e.printStackTrace();
		}
		//instantiate cycle
		Cycle cycle1=new Cycle(numberOfWheels, weight);
		System.out.println(cycle1.toString());
		
		
	}
	//if value is less or equal to zero whe use this constructor
	public static void setData(double numberOfWheels2, double weight2)
			throws ValueException{
		numberOfWheels=(numberOfWheels2);
		weight=(weight2);
		if (numberOfWheels<=0 || weight<=0)//throw when the value is less than or equal to 0
			throw new ValueException("Values cannot be less than or equal to zero");
	}	
	
}	
