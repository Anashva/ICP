package ICP;

import java.util.*;
public class Remove_Duplicate_Letters {
    public String removeDuplicateLetters(String s) {
        StringBuilder sb=new StringBuilder();
        Set<Character> sn = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!sn.contains(s.charAt(i))){
                sn.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        List<String> ll=new ArrayList<>();
        permute(sb.toString(),"",ll);
        Collections.sort(ll);
        return ll.get(0);

    }
    public static void permute(String s,String ans,List<String> ll){
        if(s.length()==0){
            ll.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String s1=s.substring(0,i);
            String s2=s.substring(i+1);
            permute(s1+s2,ans+ch,ll);
        }
    }
}
