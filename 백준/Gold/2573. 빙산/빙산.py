import copy
from collections import deque

N,M = map(int,input().split())
arr=[list(map(int,input().split())) for _ in range(N)]
directy=[0,0,1,-1]
directx=[1,-1,0,0]
result=0

def melting(bayeol):
    global result
    result+=1
    for i in range(N):
        for j in range(M):
            if arr[i][j]:
                for k in range(4):
                    dy=directy[k]+i
                    dx=directx[k]+j
                    if dy<0 or dx<0 or dy>=N or dx>=M:
                        continue
                    if arr[dy][dx]!=0:
                        continue
                    if bayeol[i][j]>0:
                        bayeol[i][j]-=1
                    else:
                        break

def bfs(bayeol):
    cnt=0
    for i in range(N):
        for j in range(M):
            if bayeol[i][j]:
                q=deque()
                q.append([i,j])
                cnt+=1
                bayeol[i][j]=0
                while q:
                    nowy,nowx=q.popleft()
                    for k in range(4):
                        dy = directy[k]+nowy
                        dx = directx[k]+nowx
                        if dy<0 or dx<0 or dy>=N or dx>=M:
                            continue
                        if bayeol[dy][dx]==0:
                            continue
                        bayeol[dy][dx]=0
                        q.append([dy,dx])
    return cnt

while 1:
    lst=copy.deepcopy(arr)
    melting(lst)
    mid=copy.deepcopy(lst)
    ex = bfs(lst)
    if ex==0:
        result=0
        break
    elif ex>=2:
        break
    else:
        arr=copy.deepcopy(mid)

print(result)