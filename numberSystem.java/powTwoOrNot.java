public class powTwoOrNot {
    public static boolean number(int n) {
       
        int count=0,binary=0;
        while(n>0){
            int rem=n%2;
           if(rem==1)
            count++;   
            n=n/2;
        }
if(count==1)
return true;
else 
return false;
       
    }
    public static void main(String[] args) {
        int n=15;
        
        System.out.println(number(n));
    }
    
}
