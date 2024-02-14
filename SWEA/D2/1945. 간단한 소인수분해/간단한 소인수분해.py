T=int(input())
arr=[2,3,5,7,11]
result=[]
for i in range(1,T+1):
    lst=[0]*5
    N=int(input())
    for j in range(len(arr)):
        while N%arr[j]==0:
            N/=arr[j]
            lst[j]+=1
    result.append(lst)
for i in range(T):
    print(f'#{i+1}',*result[i])