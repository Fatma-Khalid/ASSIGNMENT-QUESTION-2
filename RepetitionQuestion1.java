public class RepetitionQuestion1 {
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");
        int n = 1;
        while (n <= 5) {
            int tenTimesN = 10 * n;
            int hundredTimesN = 100 * n;
            int thousandTimesN = 1000 * n;
          System.out.println(n + "\t" + tenTimesN + "\t" + hundredTimesN + "\t" + thousandTimesN);
             n++;
        }
    }
}