//Byte wrapper classes and its methods.

package Demo;

public class Example2 {

	public static void main(String[] args) {
      
		Byte b = new Byte( "123");
		byte e =b.byteValue();                         //1st type Byte constructor
		System.out.println(e);
		
		Byte c = new Byte((byte) (23));                  //2nd type Byte constructor
		byte f =c.byteValue();
		System.out.println(f);
		
		System.out.println("------------------------------------->");
		
              String d ="125";
		
		 byte k = Byte.parseByte(d);
		 System.out.println(k);
		
		 System.out.println("------------------------------------->");
		 
		 Byte j = new Byte("111");
		 String s =j.toString();
		 System.out.println(s.length());
		 
		 System.out.println("------------------------------------->");
		 
		String l = "93";
		Byte cc = Byte.valueOf(l);
		System.out.println(cc);
		
		 System.out.println("------------------------------------->");
		 
		 
		 //valueOf() method of the Byte class, which typically takes a String as 
		 //input to parse and return a Byte object. However, since you're passing a primitive byte 
		 //variable bd directly to valueOf(), it's being autoboxed into a Byte object. 
		 
		 
		 byte bd =12;
		 
		 //Using autoboxing, byte is automatically converted to Byte
		 Byte ff = Byte.valueOf(bd);
		 
		 System.out.println(ff);
	}

}
