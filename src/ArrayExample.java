//Full Java program to demonstate array declaration and initailization

public class ArrayExample {
    public static void main(String[] args) {

        //Approach 1:
        int[] num=new int[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=15;
        
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
        
//insert a new element at the end
        int[] newArray=new int[num.length+1];
        for(int i=0;i<num.length;i++) {
            newArray[i]=num[i];
        }
        newArray[num.length]=60;
        num=newArray;
        System.out.println("Array after adding new element");
        for (int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println(num.length);
        System.out.println(num2.length);

//Delete and element @ index 2
        int[] updatedArray=new int[num.length-1];
        for (int i=0;i<num.length-1;i++) {
            if (i==2)
                continue;
            updatedArray[i]=num[i];
        }
        num=updatedArray;
        System.out.println("Update Array: "+java.util.Arrays.toString(num));
        
//Searching an element target=30
        int target=30;
        boolean found=false;
        for (int numb : num){
        if (numb==target){
            found=true;
            break;
        }
    }
        System.out.println("Target found: "+found);

//Sorting an Array
        for (int i=0;i<num.length-1;i++){  
            for (int j=i+1;j<num.length;j++){
                if (num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array: "+java.util.Arrays.toString(num));





    }
    
}
