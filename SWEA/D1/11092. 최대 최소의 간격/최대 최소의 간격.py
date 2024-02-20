
T = int(input())
arr=[]
for test_case in range(1, T + 1):
    N=int(input())
    lst=list(map(int,input().split()))
    mini=lst.index(min(lst))
    maxv=-21e8
    maxi=-1
    for i in range(len(lst)):
        if lst[i]>=maxv:
            maxv=lst[i]
            maxi=i
    result=abs(maxi-mini)
    arr.append(result)

for i in range(len(arr)):
    print('#%d %d'%(i+1,arr[i]))