#include<bits/stdc++.h>

using namespace std;



#define LL long long



void solve() {

    LL n, m, x, y;

    cin >> n >> m >> x >> y;

    LL l = 0, r = n + 1, mid;

    while(l < r-1) {

        mid = (l + r) / 2;

        if(mid * x <= m + (n - mid) * y) l = mid;

        else r = mid;

    }    

    cout << l << '\n';

}



int main() {

    ios::sync_with_stdio(0), cin.tie(0);

    

    int tt = 1; //cin >> tt;

    while(tt--) solve();

}
