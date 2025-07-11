public class Sum{
    public static int Sum(int n){
        //Base case: If n is 1, the sum is 1
        if (n==1){
            return 1;
        }
        else{
            // Recursive cae: n + sum(n-1)
            return n + Sum(n - 1);
        }
    }
    public static void main(String[] args) {
        int result = Sum(5);
        System.out.println("Sum:"+ result);
    }

}