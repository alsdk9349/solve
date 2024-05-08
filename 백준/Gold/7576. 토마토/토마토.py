from collections import deque
M,N = map(int,input().split())
arr=[list(map(int,input().split())) for _ in range(N)]
directy=[1,-1,0,0]
directx=[0,0,-1,1]
mini=21e8

def bfs():
    global mini
    q=deque()
    for i in range(N):
        for j in range(M):
            if arr[i][j]==1:
                q.append([i,j,0])
    while q:
        nowy, nowx, day = q.popleft()
        for i in range(4):
            dy=nowy+directy[i]
            dx=nowx+directx[i]
            if dy<0 or dx<0 or dy>=N or dx>=M:
                continue
            if arr[dy][dx]!=0:
                continue
            arr[dy][dx]=1
            q.append([dy,dx,day+1])
            mini=day+1

bfs()
for i in range(N):
    for j in range(M):
        if arr[i][j]==0:
            mini=-1
if mini==21e8:
    mini=0
print(mini)