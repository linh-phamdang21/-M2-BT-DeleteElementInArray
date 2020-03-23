import java.util.Scanner;

public class ElementDeletion {
    public static void main(String[] args) {
        int size;
        int[] arrNumber;
        int numberToCheck;
        int index_del = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size of array: ");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("This size does not exceed");
            }
        } while (size > 10);
        arrNumber = new int[size];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            arrNumber[i] = scanner.nextInt();
        }
        System.out.println("Enter a number to delete: ");
        numberToCheck = scanner.nextInt();
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] == numberToCheck) {
                System.out.println("Your number is in Array at position: " + (i + 1));
                index_del = i + 1;
            }
        }
        for (int i = index_del; i < arrNumber.length; i++){
            arrNumber[i-1] = arrNumber[i];
        }
        arrNumber[arrNumber.length - 1] = 0;
        System.out.print("New array: ");
        for (int i = 0; i < arrNumber.length; i++){
            System.out.print(arrNumber[i] + "\t");
        }
    }
}