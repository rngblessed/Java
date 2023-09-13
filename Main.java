import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Matrix a = new Matrix(n, m);
        a.printMatrix();
        a.sumSimple(a);
        a.replacePerfect(a);
        a.printMatrix();
        int num = in.nextInt();
        a.prodBigger(num);
    }
}
