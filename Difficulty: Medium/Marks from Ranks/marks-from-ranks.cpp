class Solution {
  public:
    vector<int> getMarks(vector<int> &l, vector<int> &r, vector<int> &rank) {
        // code here
        int n=l.size();
        vector<long long> pre(n);
        pre[0]=r[0]-l[0]+1;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+r[i]-l[i]+1;
        }
        vector<int> res;
        for(int ele:rank){
            int low=0;
            int h=n-1;
            // int ind = lower_bound(pre.begin(),pre.end(),x)-pre.begin();
            while(low<h){
                int mid=(low+h)/2;
                if(pre[mid]>=ele){
                    h=mid;
                }
                else{
                    low=mid+1;
                }
            }
            int ind=low;
            long long before=(ind==0)?0:pre[ind-1];
            long long rem=ele-before;
            res.push_back((int)(l[ind]+rem-1));
            
        }
        return res;
    }
};