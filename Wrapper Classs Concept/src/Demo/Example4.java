//Short wrapper class and its methods.

package Demo;

public class Example4 {

	public static void main(String[] args) {

		//Short class has two contrcutor
		//1st constructor
		
		short s = 125;
		Short obj = new Short(s);
		System.out.println(obj.shortValue());
		
		System.out.println("--------------1st constructor---------------------->");
		//2nd type Constructor
		
		String t ="345";
		Short obj1 = new Short(t);
		System.out.println(obj1);
		System.out.println("--------------1st constructor---------------------->");
		
		int l =obj.compareTo(obj1);
		System.out.println(l);
		
		System.out.println("--------------1st Method---------------------->");
		
		boolean x =obj.equals(obj1);
		System.out.println(x);
		
		System.out.println("--------------2nd Method---------------------->");
		
		String v ="3456";
		short bb = Short.parseShort(v);
		System.out.println(bb+bb);  //return int eqivalent of string value
		
		System.out.println("-------------3rd Method---------------------->");
		
		 Short m = new Short("456");
	
		System.out.println(m.toString());
		
		System.out.println("-------------4th Method---------------------->");
		
		
          short bd =2112;
		 
		 //Using autoboxing, byte is automatically converted to Byte
		 Short ff = Short.valueOf(bd);
		 
		 System.out.println(ff);
		 
		 System.out.println("-------------5th Method---------------------->");
	}

}
