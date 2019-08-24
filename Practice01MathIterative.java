public class Practice01MathIterative implements Practice01Math{

    public int fact (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int total = 1;
            if (n<1){
                return 1;
            }
            while (n > 1) {
                total = total * n;
                n = n - 1;
            }
            return total;
        }
    }


    public int fib (int n){
        if (n == 0 || n == 1) {
            return n;
        } else {
            int x = 1; //this is n = 1, or n-1
            int y = 0; //this is n = 0, or n-2
            int z = 0; // this is for the running total
            if (n<1){
                return 1;
            }
            while (n > 1) {
                z = x + y; // this adds the two previous numbers
                y = x; //this changes n-1 to n-2
                x = z;  // this creates a new n-1
                n = n - 1;
            }
            return z;
        }
    }
}
