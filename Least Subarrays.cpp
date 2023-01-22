#include<bits/stdc++.h>

using namespace std;



#define fast ios_base::sync_with_stdio(false); cin.tie(NULL);

#define int long long

#define pb push_back

#define ff first

#define ss second

#define endl '\n'

#define all(a) a.begin(), a.end()

#define rall(a) a.rbegin(), a.rend()

using T = pair<int, int>;

typedef long double ld;

const int mod = 1e9 + 7;

const int INF = 1e9;



// #include <ext/pb_ds/assoc_container.hpp>

// #include <ext/pb_ds/tree_policy.hpp>

// using namespace __gnu_pbds;

// template <typename T>

// using ordered_set = tree

//     <T, null_type, less<T>, 

//     rb_tree_tag,tree_order_statistics_node_update>; 

// ordered_set<pair<int, int>> s;



void solve(){

    int n, m;

    cin >> n >> m;

    vector<int> a(n);

    vector<int> b(m);

    for(auto &i : a) cin >> i;

    for(auto &i : b) cin >> i;

    int p;

    cin >> p;

    int l = 1, r = min(n, m), ans = -1;

    while(l <= r){

        int mid = (l + r)/2;

        int sum1 = 0, sum2 = 0, cur = 0;

        for(int i = 0; i < n; i++){

            cur += a[i];

            if(i >= mid) cur -= a[i - mid];

            sum1 = max(sum1, cur);

        }

        cur = 0;

        for(int i = 0; i < m; i++){

            cur += b[i];

            if(i >= mid) cur -= b[i - mid];

            sum2 = max(sum2, cur);

        }

        int temp = sum1 * sum2;

        if(temp >= p){

            ans = mid;

            r = mid - 1;

        }

        else l = mid + 1;

    }

    cout << ans;

}



signed main(){

    fast

    int t = 1;

    cin >> t;

    for(int i = 1; i <= t; i++){

        solve();

        if(i != t) cout << endl;

    }

}
