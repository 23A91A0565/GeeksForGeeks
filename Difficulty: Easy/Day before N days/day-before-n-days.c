int dayBefore(int d, int n) {
    int x = n % 7;
    int ans = d - x;
    if (ans < 0) {
        ans += 7;
    }
    return ans;
}