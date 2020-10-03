import java.util.Scanner;

public class Recursion {
    private int val; //очередной элемент последовательности
    private int max = Integer.MIN_VALUE;
    private int cnt = 0; //количество элементов, равных максимуму

    Scanner in = new Scanner(System.in);

    public int Recurs(){

        val = in.nextInt();
        if (val > max) {
            max = val;
            //cnt = 0;
        }
        if (max == val) cnt++;
        if (val == 0) return cnt-1;
        return Recurs();
    }
}