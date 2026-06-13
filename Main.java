import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== GRAPH ALGORITHMS MENU =====");
            System.out.println("1. Dijkstra's Algorithm");
            System.out.println("2. Kruskal's Algorithm");
            System.out.println("3. Prim's Algorithm");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Dijkstra.run();
                    break;
                case 2:
                    Kruskal.run();
                    break;
                case 3:
                    Prims.run();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
