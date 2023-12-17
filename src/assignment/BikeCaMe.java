package assignment;

public class BikeCaMe {
	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		b1.Brand = "KTM";
		b1.color = "Yellow";
		b1.Speed = 110;
		b1.Average = 90;
		
		System.out.println("b1.Speed");
		{
			Bike b2 = new Bike();
			b2.Riding("Riding on high way");
		}
		
	}

}
package assignment;

public class Bike {
	String Brand;
	String color;
	int Speed;
	int Average;
	
	void Riding(String content) {
		System.out.println(content);
		
	}

}
