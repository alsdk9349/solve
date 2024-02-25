L=int(input())
N=int(input())
bucket=[0]*(L+1)
expect=-21e8
expectind=-21e8
real=-21e8

realind=-21e8
for i in range(N):
    a,b=map(int,input().split())
    if b-a>expect:
        expect=b-a
        expectind=i+1
    cnt=0
    for j in range(a,b+1):
        if bucket[j]==0:
            bucket[j]=i+1
            cnt+=1
    if cnt>real:
        real=cnt
        realind=i+1
print(expectind)
print(realind)
    
    
