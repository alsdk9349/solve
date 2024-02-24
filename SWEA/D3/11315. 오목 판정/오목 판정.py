from collections import deque
T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N=int(input())
    arr=[list(input()) for _ in range(N)]
    directy=[0,1,1,1]
    directx=[1,0,1,-1]
    result='NO'
    def abc(sty,stx):
        B=False
        for i in range(4):
            for j in range(1,5):
                dy=sty+directy[i]*j
                dx=stx+directx[i]*j
                if dy<0 or dx<0 or dy>=N or dx>=N:
                    break
                if arr[dy][dx]=='.':
                    break
            else:
                B=True
                break
        return B
    for i in range(N):
        for j in range(N):
            if arr[i][j]=='o':
                K=abc(i,j)
                if K:
                    result='YES'
    print(f'#{test_case} {result}')