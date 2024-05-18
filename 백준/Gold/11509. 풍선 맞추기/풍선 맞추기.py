N=int(input())
arr=list(map(int,input().split()))
bucket = [0]*1000002

for i in range(len(arr)):
    k=arr[i]
    if bucket[k+1]:
        bucket[k]+=1
        bucket[k+1]-=1
    else:
        bucket[k]+=1

result=sum(bucket)
print(result)

