from collections import deque

N,M,K=map(int,input().split())
arr=[list(map(int,input().split())) for _ in range(N)]
directy=[0,0,1,-1]
directx=[1,-1,0,0]
mush = 0

def bfs(y,x):
    q=deque()
    arr[y][x]=2
    cnt=1
    q.append([y,x])
    while q:
        nowy,nowx=q.popleft()
        for i in range(4):
            dy=nowy+directy[i]
            dx=nowx+directx[i]
            if dy<0 or dx<0 or dy>=N or dx>=N:
                continue
            if arr[dy][dx]==1:
                continue
            if arr[dy][dx]==0:
                arr[dy][dx]=2
                cnt+=1 
                q.append([dy,dx])
    return cnt

for i in range(N):
    for j in range(N):
        if arr[i][j]==0:
            once=bfs(i,j)
            mush+=once//K
            if once%K:
                mush+=1

result = M-mush
if result>=0 and mush>0 :
    print('POSSIBLE')
    print(result)
else:
    print('IMPOSSIBLE')
