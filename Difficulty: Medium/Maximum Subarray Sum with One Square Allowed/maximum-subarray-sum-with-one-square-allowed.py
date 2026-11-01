class Solution:

    def maximumSubarray(self, arr: list[int]) -> int:
        """ code here """
        dp0=arr[0]
        dp1=arr[0]*arr[0]
        
        ans=max(dp0,dp1)
        
        for i in range(1,len(arr)):
            ele=arr[i]
            
            new_dp0=max(ele,dp0+ele)
            
            new_dp1=max(
                dp1+ele,
                dp0+ele*ele,
                ele*ele
            )
            
            ans=max(ans,new_dp0,new_dp1)
            
            dp0=new_dp0
            dp1=new_dp1
            
        return ans
        