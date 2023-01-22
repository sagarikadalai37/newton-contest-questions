static int [] countOfNumbers(int A[],int n){

      int cnt[] = new int[n]; 

    for(int i=0;i<n;i++){

        cnt[i]=0;

    }

    

    for(int i=0;i<n-1;i++){

        int ans=0;

        for(int j=i+1;j<n;j++){

            if(A[j]%A[i]==0){ans++;}

        }

        cnt[i]=ans;

    }

    return cnt;

	}
