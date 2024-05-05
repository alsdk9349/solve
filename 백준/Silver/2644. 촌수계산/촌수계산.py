from collections import deque
n=int(input())
a,b=map(int,input().split())
arr=[[0]*(n+1) for _ in range(n+1)]
m=int(input())
for _ in range(m):
    x,y=map(int,input().split())
    arr[x][y]=1

mini=21e8
def bfs(c,d):
    global mini
    q=deque()
    q.append([c,0])
    flag=0
    used=[0]*(n+1)
    while q:
        now,cnt = q.popleft()
        used[now]=1
        for i in range(n+1):
            if used[i]:
                continue
            if arr[i][now]:
                if i==d:
                    if mini>cnt+1:
                        mini=cnt+1
                    flag=1
                    break
                q.append([i,cnt+1])
            if arr[now][i]:
                if i==d:
                    if mini>cnt+1:
                        mini=cnt+1
                    flag=1
                    break
                q.append([i,cnt+1])
        if flag:
            break

bfs(a,b)
if mini==21e8:
    print(-1)
else:
    print(mini)