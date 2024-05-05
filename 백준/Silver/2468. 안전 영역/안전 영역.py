import copy
from collections import deque

N=int(input())
arr=[list(map(int,input().split())) for _ in range(N)]

diy=[1,-1,0,0]
dix=[0,0,-1,1]

maxi=1

def bfs(y,x):
    global lst
    q = deque()
    q.append([y,x])
    lst[y][x]=0
    while q:
        nowy, nowx = q.popleft()
        for i in range(4):
            dy = nowy+diy[i]
            dx = nowx+dix[i]
            if dy<0 or dx<0 or dy>=N or dx>=N:
                continue
            if lst[dy][dx]==0:
                continue
            lst[dy][dx]=0
            q.append([dy,dx])
#while문으로 바꾸기
for k in range(1,100):
    cnt=0
    lst = copy.deepcopy(arr)
    for i in range(N):
        for j in range(N):
            if lst[i][j]<=k:
                lst[i][j]=0

    for i in range(N):
        for j in range(N):
            if lst[i][j]:
                cnt+=1
                bfs(i,j)
    
    if cnt>maxi:
        maxi=cnt
    
print(maxi)