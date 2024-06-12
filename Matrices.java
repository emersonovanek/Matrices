import java.util.*;

public class Matrices {
    // Function to compare two two-dimemsional matrices
    public static boolean equals(int[][] m1, int[][] m2) {
        // Checks if the number of rows and columns of both matrices match
        if(m1.length==m2.length && m1[0].length==m2[0].length) {
            // Loop to iterate for rows
            for(int i=0;i<m1.length;i++) {
                // Loop to iterate for columns
                for(int j=0;j<m1[0].length;j++) {
                    // If any two values do not match, return false
                    if(m1[i][j]!=m2[i][j]) {
                        return false;
                    }
                }
            }
            // If the loop contains no false values, return true
            return true;
        }
    // If the loop contains at least one false value, return false
        return false;
    }
    public static void main(String args[]) {
        // Dimensions
        int dim=3;
        int item;
        Scanner sc = new Scanner(System.in);
        int list1[][]=new int[dim][dim];
        int list2[][]=new int[dim][dim];
        // While loop to iterate for multiple inputs
        while(true) {
            item = 0;
            System.out.print("Enter list1: ");
            // Takes line of integers as input
            String l1=sc.nextLine();
            // Converts the input to an array
            String array1[]= l1.split(" ");
            System.out.print("Enter list2: ");
            String l2=sc.nextLine();
            String array2[]= l2.split(" ");
            for(int i=0;i<dim;i++) {
                for(int j=0;j<dim;j++) {
                    // Places each integer into the arrays
                    list1[i][j]=Integer.parseInt(array1[item]);
                    list2[i][j]=Integer.parseInt(array2[item]);
                    item++;
                }
            }
            // Call the function and check for true/false value
            if (equals(list1,list2))
                System.out.println("The two arrays are identical\n");
            else
                System.out.println("The two arrays are not identical\n");
        }
    }
}
