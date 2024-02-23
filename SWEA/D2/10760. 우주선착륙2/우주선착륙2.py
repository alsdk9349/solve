T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N,M=map(int,input().split())
    arr=[list(map(int,input().split())) for _ in range(N)]
    directy=[0,0,1,1,1,-1,-1,-1]
    directx=[-1,1,-1,0,1,-1,0,1]
    
    def abc(y,x):
        cnt=0
        for i in range(8):
            dy=y+directy[i]
            dx=x+directx[i]
            if dy<0 or dx<0 or dy>=N or dx>=M:
                continue
            if arr[dy][dx]<arr[y][x]:
                cnt+=1
        return cnt
    result=0
    for i in range(N):
        for j in range(M):
            if abc(i,j)>=4:
                result+=1
    print(f'#{test_case} {result}')