public class perfectnumber {
    static void perfectnumber(int n){
        int sum=1,i;
        if(n<1)
             System.out.println("invalid number");
        if(n>=1)
       {
        for(i=2;i*i<=n;i++){
           if(n%i==0){
             sum+=i;
           }
           if(i != n/i){
            sum+=n/i;
           }
        }
       
       }
      System.out.println((sum==n)? "Perfect Number!!" :"Not a Perfect Number!!");


    }
    public static void main(String[] args) {
        perfectnumber(6);
        
    }
}
