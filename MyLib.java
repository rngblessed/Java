import java.util.*;

public class MyLib {
    public static boolean isSimple(int num) {
        for(int i = 2; i < num; ++i) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

//     static int sumSmp(Array array) {
//         int s = 0;
//         for(int i = 0; i < a.length - 1; ++i) {
//             if(isSimple(a[i]) == true && a[i + 1] % 2 == 0)
//                 s += a[i];
//         }
//         return s;
//     }

    static boolean isPerfect(int num) {
        int sum = 0;
        for(int j = 1; j < num; ++j) {
            if(num % j == 0)
                sum += j;
        }
        if(num == sum)
            return true;
        return false;
    }

}