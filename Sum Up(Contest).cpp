#include <bits/stdc++.h>

using namespace std;

#define int long long



int solve(int n){

if(n<=1){return 0;}

int x = n/2;

int y = x*2;

x*=(2+y);

x/=2;

return x+solve(n/2);

}



signed main(){

    int t;

t=1;

    while(t--){

int a,b;

cin>>a>>b;

int ans = solve(b)-solve(a-1);

cout<<ans<<endl;}





}
