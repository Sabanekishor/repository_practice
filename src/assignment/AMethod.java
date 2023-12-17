package assignment;

 class B{ 
	public static void main(String[]  args){
	   
		AMethod a1 = new AMethod();
	    a1.add(a1.add(10,20), a1.add(30,40));
	}
}
 
 public class AMethod {
		public int add (int i, int j) {
			return i+j;
		}

	}