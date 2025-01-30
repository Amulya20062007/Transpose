import java.util.Scanner;
    public class Transpose {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no.of rows: ");
        int rows = sc.nextInt();
        System.out.println("enter the no.of columns: ");
        int columns = sc.nextInt();
        int[][] mat= new int[rows][columns];
        int[][] transpose =new int[rows][columns];
        System.out.println("enter elements  of matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                mat[i][j] =  sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                transpose[j][i]= mat[i][j];
            }
            System.out.println();
        }
        System.out.println("transpose matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}