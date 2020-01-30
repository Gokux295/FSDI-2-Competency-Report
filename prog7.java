public class prog7{


        public static void main(String args[]){
            int[] numbers = {3,5,7,6,3,2,9};
                int total = 0;
                for(int i:numbers){
                    total=total+i;
                     }    
            for(int i=0; i<numbers.length;i++){
                System.out.println("number: "+ numbers[i] );
                if(numbers[i] ==7){
                    System.out.println("hi everyone");
                }
            }
    System.out.println("The sum is: "+ total);
    
        }
    
    }
