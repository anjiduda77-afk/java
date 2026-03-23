public class MostFreqAlpha {
    public static void main(String[] args)
    {
        String s = "JAVA Programming LANGUAGE";
        int[] freq = new int[52];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                freq[ch-'A']++;
            }
            if(ch>='a' && ch<='z')
            {
                freq[ch-'a'+26]++;
            }
        }

        int maxi =0;
        
        for(int i=0;i<52;i++)
        {
            if(freq[i]>maxi)
            {
                maxi = freq[i];
            }

        }
        System.out.println("Characters With Max Frequency:");
        for(int i=0;i<52;i++)
        {
            if(freq[i]==maxi && maxi>0)
            {
                if(i<26)
                    System.out.println((char)(i+'A')+"-->"+maxi+" times");
                else
                    System.out.println((char)(i-26+'a')+"-->"+maxi+" times");
            }
        }
        

    }
}