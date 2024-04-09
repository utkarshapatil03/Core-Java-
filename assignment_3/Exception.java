package Assign4;

public class Exception {
	public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred: " + e.getMessage());
        }

        try {
            
            int result = divide(10, 0); 
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            
            int result = divide(10, 2); 
            System.out.println("Result of division: " + result);
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            
            try {
                int[] arr = new int[5];
                arr[5] = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception occurred inside nested try block: " + e.getMessage());
                throw e; 
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught in outer try block: " + e.getMessage());
        }
    }

    
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
