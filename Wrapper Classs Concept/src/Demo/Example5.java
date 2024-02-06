//Integer wrapper class and its method.

package Demo;

public class Example5 {

	public static void main(String[] args) {
		
           //1st constructor
		Integer i = new Integer(123234);
		System.out.println(i);
		
		System.out.println("----------------1st constructor------------------->");
		
		   //12nd constructor
				Integer i1 = new Integer("33234");
				System.out.println(i1);
				
				System.out.println("----------------2nd constructor------------------->");
				
			int g =i.compareTo(i1);
			System.out.println("comparision is :"+g);
			
			System.out.println("----------------1st method------------------->");
			
			boolean h =i.equals(i1);
			System.out.println("comparision is :"+h);
			
			System.out.println("----------------2nd method------------------->");

          String n ="2568";
          int gh =Integer.parseInt(n);
          System.out.println(gh);
          System.out.println("---------------3rd method------------------->");
          
          
          
          
	}

}
