package $06_Iterative_Statements;
import java.util.Scanner;

public class _05_Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of row : ");
        int r = input.nextInt();
        System.out.print("Enter no of column : ");
        int c = input.nextInt();
        input.close();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}