import java.util.*;
public class Program5 {

    public ArrayList<ArrayList<Integer>> pair(int [] arr,int sum)
    {
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
           map.put(arr[i],i);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            int a=sum-arr[i];
            if(map.containsKey(a) && map.get(a)!=i)
            {
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add(arr[i]);
                ans.add(a);
                answer.add(ans);
            }
        }
        return answer;
       
    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);

        Program5 p=new Program5();

    
      int n=s1.nextInt();//array size
      int sum=s1.nextInt();

      int arr[]=new int[n];

      for(int i=0;i<n;i++)
      {
        arr[i]=s1.nextInt();
      }

        System.out.println("Pairs are "+p.pair(arr,sum ));

    }
    
}
