/*
Azariel Del Carmen
CS2323 prints '1 2 3 4' to the screen using different print methods
*/

public class Chapter2Question14 {
    
    public static void main(String[] args) {
        //'1 2 3 4' via println
        System.out.println("Using Println:");
        System.out.println("1 2 3 4");
        
        //'1 2 3 4' via print
        System.out.println("Using Print:");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");

        //'1 2 3 4' via printf
        System.out.println("Using Printf:");
        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
    }
}
