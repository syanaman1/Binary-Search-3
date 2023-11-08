
//Time Complexity O( log n)
//Space Complexity O(log n)

class Powx {
    public double myPow(double x, int n) {
      return binaryExp(x, (long) n);
    }
    private double binaryExp(double x, long n){
     //base case
      if(n==0) return 1;
      if(n<0){
          n = -n;
          x = 1/x;
      } 
      return n % 2 == 0 ? binaryExp(x * x, n/2) : x * binaryExp(x * x, (n-1)/2);
    }
   
}
