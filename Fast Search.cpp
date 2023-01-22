#include <bits/stdc++.h>



#include <ext/pb_ds/assoc_container.hpp>

#include <ext/pb_ds/tree_policy.hpp>



using namespace std;

using namespace __gnu_pbds;



template <class T>

using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;



template <class key, class value, class cmp = std::less<key>>

using ordered_map = tree<key, value, cmp, rb_tree_tag, tree_order_statistics_node_update>;

// find_by_order(k)  returns iterator to kth element starting from 0;

// order_of_key(k) returns count of elements strictly smaller than k;



#ifdef LOCAL

#define debug(...) cerr << "[" << #__VA_ARGS__ << "]:", debug_out(__VA_ARGS__)

#else

#define debug(...) 2351

#endif



#define int long long



mt19937_64 rng(chrono::steady_clock::now().time_since_epoch().count());



inline int64_t random_long(int l = LLONG_MIN, int r = LLONG_MAX) {

    uniform_int_distribution<int64_t> generator(l, r);

    return generator(rng);

}



vector<int> a;



int searchLeft(int x, int n) {

    int l = 0, r = n - 1;

    while (l <= r) {

        int mid = l + (r - l) / 2;

        if (a[mid] <= x) {

            l = mid + 1;

        } else {

            r = mid - 1;

        }

    }

    return l;

}



int searchRight(int x, int n) {

    int l = 0, r = n - 1;

    while (l <= r) {

        int mid = l + (r - l) / 2;

        if (a[mid] < x) {

            l = mid + 1;

        } else {

            r = mid - 1;

        }

    }

    return l + 1;

}



int32_t main() {

    ios::sync_with_stdio(false);

    cin.tie(0);

    int n, k;

    cin >> n;

    a.assign(n, 0);

    for (int i = 0; i < n; i++) {

        cin >> a[i];

    }

    sort(a.begin(), a.end());

    cin >> k;

    while (k--) {

        int x, y;

        cin >> x >> y;

        x -= 1, y += 1;

        int left = searchLeft(x, n);

        int right = searchRight(y, n);

        cout << right - left - 1 << " ";

    }

    return 0;

}
