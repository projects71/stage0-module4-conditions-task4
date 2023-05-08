package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        System.out.println(first > second && second > third ? first: second>first && second> third ? second : third);
    }
}
