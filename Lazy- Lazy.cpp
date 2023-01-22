#include <bits/stdc++.h>

using namespace std;

#define int long long

signed main(){

    int n;

    cin>>n;

    int p=n;

    int x = sqrt(n);

    int cnt=0;

    int i=2;

    while(n!=1 && i<=x){

        if(n%i==0){

            n/=i;

            cnt++;

        }

        else{

            i++;

        }

    }

    if(n!=1){cnt++;}

    if(cnt<=1){

        cout<<"Nobita";

    }

    else if(cnt==2){

        cout<<"Doraemon";

    }

    else{

        cout<<"Nobita";

        

    }

}
