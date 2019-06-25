import java.util.Scanner;

public class EqualSumEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        for (int currentNum = firstNumber; currentNum <= secondNumber; currentNum++) {
            String currentNumStr = String.valueOf(currentNum);
            int evenSum = 0;
            int oddSum = 0;
            for (int i = 0; i < currentNumStr.length(); i++){
                char currentDigit = currentNumStr.charAt(i);
                if (i % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }

            if (evenSum == oddSum) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
