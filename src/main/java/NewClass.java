



public class NewClass {
    
    //Lab 3 task: create a method that takes a string and return how many
    //characters there are.
    //call this method and pass your name as an argument
     int getStrLength(String x){
         String str = x;
         int y = str.length();
         return y;
     }
    
     //task 2: create a method that takes an integer array and returns
     //the sum of the elements
     
     int getArrSum(int arr[]){
         int sum = 0;
         for(int i=0; i<arr.length; i++)
         {
             sum += arr[i];
         }
         return sum;
             
     }
     
     
    public static void main(String[] args){
        NewClass nc = new NewClass();
        String x = "Caleb Im";
       int len = nc.getStrLength(x);
       System.out.println("The length is " + len);
       
       int arrone[];
       arrone = new int[5];
       arrone[0] = 1;
       arrone[1] = 2;
       arrone[2] = 3;
       arrone[3] = 4;
       arrone[4] = 5;
       int arrsum = nc.getArrSum(arrone);
       System.out.println("The sum of the array elements is " + arrsum);
       
       
       
    }
    
}
