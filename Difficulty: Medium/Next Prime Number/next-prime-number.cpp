// User function Template for C++
bool isPrime(int n){
    if(n<=1){
        return false;
    }
    for(int i=2;i<=sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
int nextPrime(int n) {
    while(true){
        if(isPrime(++n)){
            return n;
        }
    }
    // code here to find next prime number
    // return next prime number
}