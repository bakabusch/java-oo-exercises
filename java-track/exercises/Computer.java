
public class Computer {
	//Fields:
	
	private int memory;
	//memory - int
	private double size;
	//size - double
	private double processor;
	//processor - double
	private String brand;
	//brand - String
	
	//Behaviors:
	
	//Create a computer
	public Computer(int memory, double size, double processor, String brand)
	{
		this.memory = memory;
		this.size = size;
		this.processor = processor;
		this.brand = brand;
		//Computer in above case is a method(constructor), not Class
		//this. means you're referring to field and not parameter
		//constructor ensures each field has a value 
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public double getSize()
	{
		return this.size;
	}
	 
	public double getProcessor()
	{
		return this.processor;
	}
	
	public int getMemory()
	{
		return this.memory;
	}
	
	public void addMemory(int newMemory)
	{
		if(this.memory + newMemory > 8)
		{
			return;
		}
		else
		{
			this.memory = this.memory + newMemory;
			
		}
	}
	
	public void setProcessor(double newProcessor)
	{
		this.processor = newProcessor;
	}
	
	public String toString()
	{
		return " Memory: " + this.memory + " Processor: " + this.processor + " Size: " + this.size + " Brand: " + this.brand;
	}
	
	public static void main(String args[])
	{
		Computer myComputer = new Computer(8, 2.4, 15.5, "Dell");
		System.out.println(myComputer.getBrand());
		Computer yourComputer = new Computer(4, 3.3, 13.3, "Apple");
		System.out.println(yourComputer.getBrand());
		myComputer.addMemory(4);
		System.out.println(myComputer.getMemory());
		yourComputer.addMemory(3);
		System.out.println(yourComputer.getMemory());
		System.out.println(myComputer);
		//this is an instance of the Computer class
	}

 
}
