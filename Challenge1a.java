public class Challenge1a {

   public void primes(int n) {
       boolean[] primes = new boolean[n + 1];
       for (int i = 2; i < primes.length; i++) {
           primes[i] = true;
       }
       int sum = 0;
       int num = 2;
       while (true) {
           for (int i = 2;; i++) {
               int multiple = num * i;
               if (multiple > n) {
                   break;
               } else {
                   primes[multiple] = false;
               }
           }
           boolean nextNumFound = false;
           for (int i = num + 1; i < n + 1; i++) {
               if (primes[i]) {
                   num = i;
                   nextNumFound = true;
                   break;
               }
           }
           if (!nextNumFound) {
               break;
           }
       }
       for (int i = 0; i < primes.length; i++) {
           if (primes[i]) {
               sum = i + sum;
           }
       }
       System.out.println(sum);
   }

   public static void main(String[] args) {
       int n = 3000;
       Challenge1a main = new Challenge1a();
       main.primes(n);
   }

}
