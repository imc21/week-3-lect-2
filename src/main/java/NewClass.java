



public class NewClass {
    
    int getSum(int a, int b){
        return a+b;
    }
    
    public static void main(String[] args){
        NewClass nc = new NewClass();
        int x=10, y = 100;
        int z = nc.getSum(x,y);
        System.out.println("The sum is " + z);
    }
    
}
