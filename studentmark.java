import java.util.Scanner;

class studentmark {
    public static void main(String args[]) {
        char grade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the grade (A/B/C/D):");
        grade = sc.next().charAt(0);

        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}