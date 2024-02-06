//Character class i.e Wrapper class that convert char primitive type into object.

package Demo;

public class Example1 {

	public static void main(String[] args) {
   
		Character obj = new Character('A');
		char c =obj.charValue();
		
		System.out.println(c);
		System.out.println((int)c);
		
      System.out.println("---------------Method 1------------------------->");
      
      
      Character obj1 = new Character('D');
      int z = obj.compareTo(obj1);
      
      System.out.println("Obj < Obj1 : Since it returns negative value "+z);
      
      System.out.println("---------------Method 2------------------------->");
      
      Character obj2 = new Character('F');
      String k = obj2.toString();
      System.out.println(k.length());
      System.out.println("---------------Method 3------------------------->");
      
      Character ob3 = new Character('G');
      char c4 =Character.valueOf('K');
      System.out.println(c4);
      System.out.println("------------------Method 4--------------------->");
      
      Character ob4 = new Character('9');
      boolean g = Character.isDigit(ob4);
      System.out.println(g);
      
      System.out.println("---------------Method 5-------------------------->");
      
      
      Character ob5 = new Character('J');
      boolean h = Character.isLetter(ob5);
      System.out.println(h);
      
      System.out.println("---------------Method 6-------------------------->");
	}

}
