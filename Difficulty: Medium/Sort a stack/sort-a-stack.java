/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        Stack<Integer> tem=new Stack<>();
        int len=s.size();
        int arr[]=new int[len];
        int i=0;
        while(!s.isEmpty()){
            arr[i++]=s.pop();
            
        }
        
        Arrays.sort(arr);
        
        for(int j=0;j<len;j++){
            tem.push(arr[j]);
        }
        
        return tem;
    }
}