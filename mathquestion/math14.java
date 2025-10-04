public class math14 {
    static int lcm(int n,int m){
        int max=java.lang.Math.max(n,m);
        int min=java.lang.Math.min(n,m);
      while(true){
        if(max%m==0 && max%n==0)
        return max;
        max++;
      }
    }
    static int gcd(int n,int m){
        if(m==0)
        return n;

        return gcd(m,n%m);
    }
    public static void main(String[] args) {
        System.out.println(lcm(24, 18));
        System.out.println(gcd(24, 18));
    }
}
