T=int(input())
for i in range(T):
    tc,*arr=map(int,input().split())
    lst=[]
    cnt=0
    for j in range(20):
        for k in range(len(lst)):
            if arr[j]<lst[k]:
                lst.insert(k,arr[j])
                cnt+=len(lst)-k-1
                break
        else:
            lst.append(arr[j])
    print(tc, cnt)