//Full Java program to demonstate array declaration and initailization



public class ArrayExample {
    public static void main(String[] args) {

        //Approach 1:
        int[] num=new int[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;
        
        System.out.println("Array initalized step by step");
        for (int i=0;i<num.length;i++) {
            System.out.println(num[i]);
        }

        //Approach 2:
        int[] num2={10,20,30,40,50};
        System.out.println("Array initalized at once");
        for (int i=0; i<num2.length; i++) {
            System.out.println(num2[i]);
            }
    }
    
}
