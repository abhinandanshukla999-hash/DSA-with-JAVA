
public class NullExc {
    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println(name.toUpperCase());
        } 
        catch (NullPointerException e) {
            System.out.println("Error: The name is null!");
        }

        System.out.println("Program continues normally without throwing the exception error");
    }
}
