import java.util.Scanner;

class NameList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of names:");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer
        
        String names[] = new String[n];
        
        System.out.println("Enter the names:");
        for(int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        
        System.out.println("List of Names:");
        for(int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}