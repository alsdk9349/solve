from collections import deque
N,K = map(int,input().split())

used=[0]*100002
mini=21e8

def bfs():
    global mini,used
    q=deque()
    q.append([N,0])
    used[N]=1
    while q:
        now,cnt=q.popleft()
        if now==K:
            mini=cnt
            break
        if 0<=now+1<=100001 and used[now+1]==0:
            used[now+1]=1
            if now+1==K:
                mini=cnt+1
                break
            q.append([now+1,cnt+1])
        if 0<=now-1<=100001 and used[now-1]==0:
            used[now-1]=1
            if now-1==K:
                mini=cnt+1
                break
            q.append([now-1,cnt+1])
        if 0<=now*2<=100001 and used[now*2]==0:
            used[now*2]=1
            if now*2==K:
                mini=cnt+1
                break
            q.append([now*2,cnt+1])
bfs()
print(mini)