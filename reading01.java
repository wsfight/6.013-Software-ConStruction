import java.util.ArrayList;
import java.util.List;

public class reading01 {
    public static void hailstone(final int _n){
        int n = _n;
        while(n != 1){
            System.out.println(n);
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
    }

    public static void hailstone_linked(final int _n) {
        List<Integer> list = new ArrayList<Integer>();
        int n = _n;
        while(n != 1){
            list.add(n);
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = 3 * n + 1;
            }
        }
        list.add(n);    // 最后就是1了
        for(int x : list){  // 运用迭代
            System.out.println(x);
        }

    }

    public static void max_arr(int[] arr) {
        int max = arr[0];
        for(int x : arr){
            if(x > max){
                max = x;
            }
        }
    }
    public static void main(String[] args) {
        hailstone(3);
        hailstone_linked(3);
    }
}
