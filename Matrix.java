import java.util.*;

public class Matrix {
    Scanner in = new Scanner(System.in);
    int[][] a;
    int n;
    int m;
    Random r = new Random();
    Matrix(int n, int m) {
        a = new int[n][m];
        for(int i = 0; i < a.length; ++i)
            for(int j = 0; j < m; ++j)
                a[i][j] = r.nextInt(50);
    }

    int sumSimple(Matrix matrix) {
        int s = 0;
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j)
                if(i < j && MyLib.isSimple(a[i][j]) == true)
                    s += a[i][j];
        return s;
    }

    void replacePerfect(Matrix matrix) {
        int cntPerfect = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j)
                if(MyLib.isPerfect(a[i][j]) ==  true)
                cntPerfect++;
            if(cntPerfect > 2)
                for(int t = 0; t < n; ++t)
                    for(int r = 0; r < m; ++r)
                        if(a[t][r] % 2 == 0)
                            a[t][r] = 0;
            cntPerfect = 0;
        }
    }

    void printMatrix() {
        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j)
                System.out.print(a[i][j] + " ");
            System.out.print("\n");
        }
    }
    
    int prodPerfect(Matrix matrix) {
        int prod = 1;
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j) {
                if(MyLib.isPerfect(a[i][j]) == true)
                    prod *= a[i][j];
            }
        return prod;
    }

    int prodBigger(int num) {
        int prod = 1;
        for(int j = 0; j < m; ++j)
            for(int i = 0; i > n - j + 1; ++i)
                if(a[i][j] > num)
                    prod *= a[i][j];
        return prod;
    }
}
