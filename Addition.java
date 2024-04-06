public class Addition {

    public static int add(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("Both inputs must be positive integers");
        }
        return num1 + num2;
    }
}
