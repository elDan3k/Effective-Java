package others.Exceptions;

public class Exceptions {

    public static void main(String[] args) {
        try {
            throw new Exception("Hello ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
/*            // already caught, throws compile error - always need to order exceptions from most specialized to most broad ones
        } catch (IOException e) {
            System.out.print(e.getMessage());*/
        } finally {
            System.out.println("World");
        }
    }
}