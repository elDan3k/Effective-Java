package others;

import java.io.IOException;

public class Exceptions {

    public static void main(String[] args) {
        try {
            throw new Exception("Hello ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
            // already catched, throws compile error
//        } catch (IOException e) {
//            System.out.print(e.getMessage());
        } finally {
            System.out.println("World");
        }
    }
}