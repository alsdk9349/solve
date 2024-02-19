T=int(input())
lst=[]
for i in range(T):
    N=int(input())
    arr=list(map(int,input()))
    arr.sort()
    bucket=[0]*10
    max1=-21e8
    a=-1
    for i in arr:
        bucket[i]+=1
        if bucket[i]>=max1:
            max1=bucket[i]
            a=i
    lst.append([a,bucket[a]])
for i in range(len(lst)):
    print(f'#{i+1}',end=' ')
    print(*lst[i])