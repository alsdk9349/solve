n=int(input())
cnt=n
for i in range(2,n//2):
    for j in range(i,n//i+1):
        cnt+=1
print(cnt)
