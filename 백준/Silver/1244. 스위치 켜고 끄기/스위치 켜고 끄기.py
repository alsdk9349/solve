N=int(input())
arr=list(map(int,input().split()))
num=int(input())
for _ in range(num):
    a,b=map(int,input().split())
    if a==1:
        for i in range(b,N+1,b):
            arr[i-1]=1-arr[i-1]
    else:
        arr[b-1]=1-arr[b-1]
        for i in range(1,N+1):
            if b-1-i<0 or b-1+i>=N:
                continue
            if arr[b-i-1]==arr[b+i-1]:
                arr[b-i-1]=1-arr[b-i-1]
                arr[b+i-1]=1-arr[b+i-1]
            else:
                break
for m in range(N):
    print(arr[m],end=' ')
    if (m+1)%20==0:
        print()

