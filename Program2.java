import java.util.*;
public class Program2 {

    public ArrayList<Integer> evenElements(int [] arr)
    {
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                ans.add(arr[i]);
            }
        }
        
        return ans;
       
    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);

        Program2 p=new Program2();

    
      int n=s1.nextInt();//array size

      int arr[]=new int[n];

      for(int i=0;i<n;i++)
      {
        arr[i]=s1.nextInt();
      }

        System.out.println("resulatant arr "+p.evenElements(arr) );

    }
    
}
