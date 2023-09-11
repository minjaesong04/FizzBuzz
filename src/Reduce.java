public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;
        while (i > 0) {
            boolean divisibleBy2 = i % 2 == 0;
            if (divisibleBy2) {
                i = i / 2;
            }
            else {
                i = i - 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
