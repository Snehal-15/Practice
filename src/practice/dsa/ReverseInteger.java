package practice.dsa;

public class ReverseInteger {

    public static void main(String[] args) {
        int num = 86364;
        int ans = 0;

        while(num > 0){
            int curr = num % 10;
            ans = ans * 10 + curr;
            num = num / 10;
        }

        System.out.println(ans);
    }
}
