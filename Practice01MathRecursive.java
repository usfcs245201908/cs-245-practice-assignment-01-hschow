public class Practice01MathRecursive implements Practice01Math{
    public int fact (int n) {
        if (n==0 || n==1){
            return 1;
        }
        else{
            if (n<0){
                throw new IllegalArgumentException();
            }
            else {
                return n * fact(n - 1);
            }
        }
    }

    public int fib (int n){
        if (n==0 || n==1){
            return n;
        }
        else{
            if (n<0){
                throw new IllegalArgumentException();
            }
            else {
                return fib(n - 1) + fib(n - 2);
            }
        }
    }

}
