import java.util.*;
public class Program7 {

    public int  longest(String s)
    {
        int ans=1;
        int start=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put(s.charAt(0),0);
        for(int i=1;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(map.containsKey(a))
            {
                if(map.get(a)<start)
                {
                    map.put(a,i);
                }
                else
                {
                    ans = Math.max(ans, i - start);
                   // System.out.println(ans);
                    start = map.get(a) + 1;
                    map.put(a,i);
                }
            }

            else{
                map.put(a,i);
            }

        }
        ans=Math.max(ans,s.length()-1-start);
        return ans;
    }

    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);
    
        String input=s1.next();

        Program7 p=new Program7();

        

        System.out.println("Longest Substring Without repeating characters "+p.longest(input) );

    }
    
}
