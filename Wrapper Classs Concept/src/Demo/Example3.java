package Demo;

public class Example3 {
    public static void main(String[] args) {
        String l = "93"; // Valid byte representation

        try {
            Byte cc = Byte.valueOf(l);
            System.out.println(cc);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse the byte value.");
            e.printStackTrace();
        }
    }
}
