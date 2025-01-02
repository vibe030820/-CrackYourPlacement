class Solution {
    public static boolean isVowelString(String s){
        char st=s.charAt(0),end=s.charAt(s.length()-1);

        if((st=='a' || st=='e' || st=='i' || st=='o' || st=='u') && (end=='a' || end=='e' || end=='i' || end=='o' || end=='u'))
            return true;

        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int prefix[]=new int[words.length+1];
        prefix[0]=0;
        for(int i=1;i<=words.length;i++)
        {
            if(isVowelString(words[i-1]))
                prefix[i]=prefix[i-1]+1;
            else
                prefix[i]=prefix[i-1];
        }
        int result[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            result[i]=prefix[queries[i][1]+1]-prefix[queries[i][0]];
        }
        return result;
    }
}