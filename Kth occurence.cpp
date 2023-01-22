#include <bits/stdc++.h>

using namespace std;

#define int long long



signed main(){



int n,x,q;

cin>>n>>x>>q;

vector<int> a(n),v;

for(int i=0;i<n;i++){

    cin>>a[i];

    if(a[i]==x){

        v.push_back(i+1);

    }

}

while(q--){

    cin>>x;

    if(x<=v.size()){

        cout<<v[x-1]<<'\n';

    }

    else{

        cout<<-1<<'\n';

    }

}



}
