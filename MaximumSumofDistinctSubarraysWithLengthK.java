/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SlidingWindow;

import java.util.HashMap;

/**
 *
 * @author HP
 */
class MaximumSumofDistinctSubarraysWithLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0,max=0;
        int j=0,i=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(j<nums.length){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            if(j-i+1==k){
                if(hm.size()==k)
                    max=Math.max(max,sum);
                sum=sum-nums[i];
                hm.put(nums[i],hm.get(nums[i])-1);
                if(hm.get(nums[i])==0) hm.remove(nums[i]);
                i++;
            }
            j++;
        }
        return max;
    }
}
