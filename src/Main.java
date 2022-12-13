public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        String rouble = "я";
        if (sum % 10 > 4 || sum % 10 == 0) {
            rouble = "ей";
        } else if (sum % 10 == 1) {
            rouble = "ь";
        }

        System.out.printf("Сумма трат за месяц составила %d рубл%s", sum, rouble);
    }
}