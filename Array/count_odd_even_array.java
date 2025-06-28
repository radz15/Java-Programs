public class count_odd_even_array {
    public static void main(String[] args){
        int a[] = { 1,2,3,4,5,6,7,8};

        int even = 0;
        int odd = 0;

        for(int num : a){
            if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even number count = "+even);
        System.out.println("Odd number count = "+odd);
    }
    
}
