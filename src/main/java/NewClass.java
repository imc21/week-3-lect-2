



public class NewClass {
    
    //Lab 3 task: create a method that takes a string and return how many
    //characters there are.
    //call this method and pass your name as an argument
     int getStrLength(String x){
         String str = x;
         int y = str.length();
         return y;
     }
    
    public static void main(String[] args){
        NewClass nc = new NewClass();
        String x = "Caleb Im";
       int len = nc.getStrLength(x);
       System.out.println("The length is " + len);
       
    }
    
}
