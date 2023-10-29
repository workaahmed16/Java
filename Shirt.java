

public class Shirt{
	//Build constructor

	public static String color;
	public static char size;

	Shirt(){
		System.out.println("inside constructor");
	}

	Shirt(String color, char size){
		this.color = color;
		this.size = size;
	}

	public static void putOn(){
		System.out.println("Shirt is on!");
	}

	public static void takeOff(){
		System.out.println("Shirt is off!");
	}

	public static void setColor (String newColor){
		color = newColor;
	}

	public static void setSize (char newSize){
		size = newSize;
	}

}