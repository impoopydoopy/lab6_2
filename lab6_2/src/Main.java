import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int first = in.nextInt();

        System.out.println("Введите 2 число: ");
        int second = in.nextInt();

        Comparable compare = new СomparatorBigger();

        System.out.println("Больше ли первое число второго: " + compare.match(first, second));
        compare = new ComparatorCoprime();
        System.out.println("Являются ли числа взаимно простыми: " + compare.match(first, second));
    }
}