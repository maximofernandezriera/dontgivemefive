//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (!hasDigitFive(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean hasDigitFive(int number) {
        while (number != 0) {
            if (number % 10 == 5 || number % 10 == -5) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(5, 17));
    }
}