import java.util.Scanner;

class Bubble{
    public static void main(String args[]){

        // Inputting array-size from the user
        int total_num, i , j , temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of integers: ");
        total_num = input.nextInt();

      
        // Setting array-elements inside a loop
        int array [] = new int[total_num];
        System.out.println("Enter " + total_num + " integers: ");
        for(i = 0; i< total_num; i++)
            array[i] = input.nextInt();


        // Swapping values in case of n > n+1
              for(i=0;i<(total_num-1);i++){
                for(j=0;j<total_num-i-1;j++){
                    if(array[j]>array[j+1]){
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }

        // Output - low to high
            System.out.println("sorting low to high: ");
            for(i=0;i<total_num;i++){
            System.out.print(array[i]);
            System.out.print("\n");

    }

            // swapping values in case of n < n+1
      

            for(i=0;i<(total_num-1);i++){
                for(j=0;j<total_num-i-1;j++){
                    if(array[j]<array[j+1]){
                        temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                    }
                }
            }
      
      
          // Output - sorting high to low
      
            System.out.println("sorting high to low: ");
            for(i=0;i<total_num;i++){
            System.out.print(array[i]);
            System.out.print("\n");


    
    input.close();
    }
}
}
