N,M=map(int,input().split())
arr=list(map(int,input().split()))
used=[0]*N
maxi=-21e8
def dfs(level,total):
    global maxi
    if total>M:
        return
    if level==3:
        if total>maxi:
            maxi=total
        return
    for i in range(N):
        if used[i]==0:
            used[i]=1
            dfs(level+1,total+arr[i])
            used[i]=0
dfs(0,0)
print(maxi)