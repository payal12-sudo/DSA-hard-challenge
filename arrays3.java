class  Array{
    private long[] a;
    private int n;
    public Array(int max){
        a=new long[max];
        n=0;


    }
   public void insert(int value){
        a[n]=value;
        n++;
    }


    public boolean find(long key){
         
        int j;
        for(j=0;j<n;j++){
            if(a[j]==key)
            break;
        }
         
              if(j!=n)
              return true;
                else 
             return false;
        
    }

public void display(){
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
}
public boolean delete(long x){
    int j;
    for(j=0;j<n;j++){
       if( a[j]==x)
       break;
    }
    if(j==n)
    return false;
    else {
        for(int k=j;k<n;k++)
a[k]=a[k+1];
n--;
return true;
        
    }

}
}



public class arrays3 {
    public static void main(String[] args) {
        Array a=new Array(10);
        a.insert(12);
        a.insert(13);
        a.insert(14);
        a.insert(15);
        a.insert(16);
        a.insert(17);
        a.insert(18);
        a.insert(19);

        a.display();
        System.out.println();
        int key=21;
      if(  a.find(key)){
      System.out.println("found:"+key);
      }
      else 
      System.out.println("not found:"+key);
a.delete(16);
a.display();




    }
}
