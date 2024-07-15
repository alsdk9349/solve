from collections import deque

N=int(input())
arr=[list(map(int,input())) for _ in range(N)]
result = []
directy=[0,0,1,-1]
directx=[1,-1,0,0]



def bfs(sty,stx):
    global cnt
    q=deque()
    q.append((sty,stx))
    arr[sty][stx]=0
    while q:
        nowy,nowx=q.popleft()
        cnt+=1
        for i in range(4):
            dy=nowy+directy[i]
            dx=nowx+directx[i]
            if dy<0  or dx <0 or dy>=N or dx>=N:
                continue
            if arr[dy][dx]==0:
                continue
            arr[dy][dx]=0
            q.append((dy,dx))

for i in range(N):
    for j in range(N):
        if arr[i][j]:
            cnt=0
            bfs(i,j)
            result.append(cnt)

print(len(result))
result.sort()
for i in range(len(result)):
    print(result[i])