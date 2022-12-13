public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        for (int day : arr) {
            sum += day;
        }
        String rouble = "я";
        if (sum % 10 > 4 || sum % 10 == 0) {
            rouble = "ей";
        } else if (sum % 10 == 1) {
            rouble = "ь";
        }

        System.out.printf("Сумма трат за месяц составила %d рубл%s%n", sum, rouble);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int day : arr) {
            if (day > max) {
                max = day;
            } else if (day < min) {
                min = day;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", min, max);
    }

}