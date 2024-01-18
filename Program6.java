import java.util.*;
public class Program6 {

    public int binarySearch(int [] arr,int a)
    {
        int l=0;
        int r=arr.length-1;
        int ans=-1;

        while(l<r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==a)
            {
                ans=mid;
                return ans;
            }
            else if(arr[mid]>a)
            {
               r=mid-1;
            }
            else if(arr[mid]<a)
            {
                l=mid+1;
            }

        }
        return ans;
       
    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);

        Program6 p=new Program6();

    
      int n=s1.nextInt();//array size
      
      int arr[] = new int[n];
      int sum=s1.nextInt();
       
      for(int i=0;i<n;i++)
      {
        arr[i]=s1.nextInt();
      }

        System.out.println("element present at index "+p.binarySearch(arr,sum ));

    }
    
}
