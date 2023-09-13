import java.util.*;

public class Array {
    Scanner sc = new Scanner(System.in);
    int[]a;
    int[]t;
    Array(int n) {
        a = new int[n];
        Random r = new Random();
        for(int i = 0; i <a.length; ++i) {
            a[i] = r.nextInt(50);
        }
    }

    void print() {
        for(int i = 0; i < a.length; ++i) {
            System.out.print(a[i]+" ");
        }
    }

    boolean isSymmetric() {
        for(int i = 0; i < a.length; ++i) {
            if(a[i] != a[a.length - i - 1])
                return false;
        }
        return true;
    }

    void sumDiff(Array array) {
        int s = 0;
        int s1 = 0;
        for(int i = 0; i < a.length; ++i) {
            s += this.a[i];
            s1 += array.a[i];
        }
        if(s >= s1)
            System.out.print("Сумма первого массива больше\n");
        else
            System.out.print("Сумма второго массива больше\n");
    }

    boolean isIncreasing(Array array) {
        for(int i = 0; i < a.length - 1; ++i)
            if(a[i] > a[i + 1])
                return false;
        return true;
    }

    void incSort(Array array) {
        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < a.length; ++j)
                if(a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
    }

}
