public class countsetBit {
    public static void main(String[] args) {
        int n=18 ;
         int count=0;
        while(n>0){
            int rem=n%2;
           if(rem==1)
            count++;   
            n=n/2;
        }
        
        System.out.println("Numbe of set bit in the number is: "+count);
    }
    
}
