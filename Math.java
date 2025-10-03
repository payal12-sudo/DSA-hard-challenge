public class Math {
    public static int closestnumber(int n,int  m){
        int q=n/m;
        int n1=q*m,n2=(q+1)*m;
        if(java.lang.Math.abs(n-n1) < java.lang.Math.abs(n-n2))
       { return n1;
    }
        else if(java.lang.Math.abs(n-n2) < java.lang.Math.abs(n-n1))
        return n2;
        else return (java.lang.Math.abs(n1)>java.lang.Math.abs(n2)) ? n1 : n2;
    }
    public static void main(String[] args) {
        int ans=closestnumber(6, 4);
        System.out.print(ans);
    }
}
