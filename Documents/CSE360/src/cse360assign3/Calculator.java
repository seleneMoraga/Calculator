package cse360assign3;

public class Calculator {

	private int total;
	String history = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		
		return total;
	}
	
	public void add (int value) {
		
		total = total + value;	
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		
		total = total - value;
		history = history + " - " + value;
	}
	
	public void multiply (int value) {
		
		total = total * value;
		history = history + " * " + value;
	}
	
	public void divide (int value) {
		
		if(value == 0)
			total = 0;
		else
			total = total/value;
		
		history = history + " / " + value;
	}
	
	public String getHistory () {
		
		return history;
	}
}