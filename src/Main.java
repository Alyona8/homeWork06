public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //Задание 1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задание 2
        int minMany = arr [0];
        int maxMany = arr [0];
        for (int i : arr) {
            if (i < minMany) {
                minMany = i;
            }
            if (i > maxMany) {
                maxMany = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMany + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxMany + " рублей");

        //Задание 3
        double average = 0;
        for (int i : arr) {
            average += (double) i / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}