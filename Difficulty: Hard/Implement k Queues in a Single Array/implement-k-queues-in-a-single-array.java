class kQueues {
    List<Queue<Integer>>l;
    int total;
    int curr;

    kQueues(int n, int k) {
        // Initialize your data members
        total=n;
        curr=0;
        l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new LinkedList<>());
        }
        
    }

    void enqueue(int x, int i) {
        // enqueue element x into queue number i
        curr++;
        l.get(i).offer(x);
    }

    int dequeue(int i) {
        // dequeue element from queue number i
        if(l.get(i).isEmpty())return -1;
        curr--;
        return l.get(i).poll();
    }

    boolean isEmpty(int i) {
        // check if queue i is empty
        return l.get(i).isEmpty();
    }

    boolean isFull() {
        // check if array is full
        return curr==total;
    }
}
