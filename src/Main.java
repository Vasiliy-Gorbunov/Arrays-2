public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
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
        System.out.println("Задание 1");
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
        System.out.println("Задание 2");
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
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей%n", min, max);
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int day : arr) {
            sum += day;
        }
        float averageConsumption = (float) sum / arr.length;
        float penny = (averageConsumption % 1) * 100;
        System.out.printf("Средняя сумма трат за месяц составила %.0f рублей %.0f копеек%n", averageConsumption, penny);
    }

    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}