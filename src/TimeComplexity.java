
/*
#Time Complexity:
- Amt of time taaken by an algorithm to execute


#Programmer 1:  (More Efficent, coz there is onlu one fn)
public int findSum(int n){
return n*(n+1)/2;
}

#Programmer 2: (Less Efficent, coz there is more than one fn)
public int findSum(int n){
int sum=0;
for (int i=1;int <=n; i++)
sum+=i;}
return sum;
}

*/

public class TimeComplexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexity demo = new TimeComplexity();
        System.out.println(demo.findSum(100000));
        
        System.out.println("Time taken: " + (System.currentTimeMillis() - now));
    }
/* 
public int findSum(int n){
    return n*(n+1)/2;
}*/
    public int findSum(int n)
    {
        int sum=0;
        for (int i=1; i<=n; i++)
        {
            sum+=i;
        }
        return sum;
    }
}