#include "bits/stdc++.h"

#pragma GCC optimize "03"

using namespace std;

 

#define int long long int

#define ld long double

#define pi pair<int, int>

#define pb push_back

#define fi first

#define se second

#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)

#ifndef LOCAL

#define endl '\n'

#endif

 

const int N = 2e5 + 5;

const int mod = 1e9 + 7;

const int inf = 1e9 + 9;



signed main() {

	IOS;

	int t;	cin >> t;

	while(t--){

		int n, x;

		cin >> n >> x;

		int a = 0, b = 0, c = 0;

		int l = 0, r = inf;

		for(int i = 1; i <= n; i++){

			int p;	cin >> p;

			if(p < x)	a++, l = max(l, p);

			else if(p == x)	 b++;

			else	c++, r = min(r, p);

		}

		//cout << l << " " << r << endl;

		//cout << a << " " << b << " " << c << endl;

		int ans;

		if(n&1){

			if(a <= n/2){

				if(a+b > n/2)

					ans = 0;

				else{

					if(2*x - r >= l && b == 0)

						ans = 2*c - n;

					else

						ans = 2*c + 1 - n;

				}

			}

			else{

				if(2*x - l <= r && b == 0)

					ans = 2*a - n;

				else

					ans = 2*a + 1 - n;

			}

		}

		else{

			if(a < n/2){

				if(c == n)

					ans = n;

				else if(a+b > n/2)

					ans = 0;

				else{

					if(2*x - r >= l && b == 0)

						ans = 2*c - n;

					else

						ans = 2*c + 1 - n;

				}

			}

			else if(a > n/2){

				if(2*x - l <= r && b == 0)

					ans = 2*a - n;

				else

					ans = 2*a + 1 - n;

			}

			else

				ans = 1 - ((l+r) == 2*x);

		}

		cout << ans << endl;

	}	

	return 0;

}
