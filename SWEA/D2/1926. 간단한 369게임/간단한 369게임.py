N=int(input())
for i in range(1,N+1):
    k=str(i)
    cnt=0
    for j in range(len(k)):
        if int(k[j])!=0 and int(k[j])%3==0:
            cnt+=1
    if cnt>0:
        k='-'*(cnt)
    print(k,end=' ')