from collections import deque

def solution(maps):
    global answer
    answer = 21e8
    directy = [0,0,1,-1]
    directx = [1,-1,0,0]
    edy,edx = len(maps)-1, len(maps[0])-1
    used=[[0]*(edx+1) for _ in range(edy+1)]
    cnt=0
    def bfs():
        global answer
        q=deque()
        used[0][0]=1
        q.append([0,0,cnt,used])
        while q:
            nowy,nowx,result,check=q.popleft()
            if nowy == edy and nowx ==edx:
                if result < answer:
                    answer = result+1
                break
            for i in range(4):
                dy = nowy+directy[i]
                dx = nowx+directx[i]
                if dy<0 or dx<0 or dy>edy or dx>edx:
                    continue
                if maps[dy][dx]==0:
                    continue
                if check[dy][dx]:
                    continue
                check[dy][dx]=1
                q.append([dy,dx,result+1,check])

     
    bfs()
    
    if answer == 21e8:
        answer = -1

    return answer
