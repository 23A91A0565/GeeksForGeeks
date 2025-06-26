class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> posArr= new ArrayList<>();
        ArrayList<Integer> negArr= new ArrayList<>();
        
        for(Integer num: arr){
            if(num>=0){
                posArr.add(num);
            }else{
                negArr.add(num);
            }
        }
        
        int m=posArr.size();
        int n=negArr.size();
        int i=0;
        int j=0;
        int current=0;
        
        while(current<arr.size() && i<m && j<n){
           arr.set(current++, posArr.get(i++)); 
           arr.set(current++, negArr.get(j++));
        }
        
        while(i<m){
              arr.set(current++, posArr.get(i++)); 
        }
        
        while(j<n){
            arr.set(current++, negArr.get(j++));
        }
        
    }
}
