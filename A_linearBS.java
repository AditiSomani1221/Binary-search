import java.util.Scanner;

public class A_linearBS {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[10];
        System.out.println("Enter a array of size 10 (Sorted)");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("whats the target?");
        int target=sc.nextInt();
        System.out.println(linearBs(arr, target));

    }
    public static boolean linearBs(int arr[],int target)
    {
        int start=0;
       int  end=arr.length-1;
      
     
      while(start<=end)
      {
        int mid=(start+end)/2;
        if(target==arr[mid])
        return true;
        else if(target<arr[mid])
        end=mid-1;
        else
        start=mid+1;
      }
      return false;
      
      
      

    }
}
