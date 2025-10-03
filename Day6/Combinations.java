package ICP;

import java.util.*;
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        combination(n,1,0,k,ans,ll);
        return ans;
    }
    public void combination(int n,int idx,int c,int k,List<List<Integer>> ans,List<Integer> ll){
        if(c==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<=n;i++){
            ll.add(i);
            combination(n,i+1,c+1,k,ans,ll);
            ll.remove(ll.get(ll.size()-1));
        }
    }
}
