n=int(input())
arr=arr = list(map(int, input().strip().split()))

if(n%2==1 and arr[0]%2==1 and arr[n-1]%2==1):
    print("YES")
else:
    print("NO")
