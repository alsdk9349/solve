from collections import deque

N,M=map(int, input().split())
arr=[list(map(int,input())) for _ in range(N)]
directy=[0,0,1,-1]
directx=[1,-1,0,0]
used=[[0]*(M) for _ in range(N)]
used[0][0]=1
def bfs(sty,stx,cnt):
    q=deque()
    q.append((sty,stx,cnt))
    while q:
        nowy,nowx,cnt=q.popleft()
        if nowy==N-1 and nowx ==M-1:
            print(cnt+1)
            break
        for i in range(4):
            dy=nowy+directy[i]
            dx=nowx+directx[i]
            if dy<0 or dx<0 or dy>=N or dx>=M:
                continue
            if used[dy][dx]:
                continue
            if arr[dy][dx]==0:
                continue
            used[dy][dx]=1
            q.append((dy,dx,cnt+1))

bfs(0,0,0)

