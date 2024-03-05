T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N,K=map(int,input().split())
    arr=[list(map(int,input().split())) for i in range(N)]
    cnt=0
 
    def check(x,y):
        global cnt
        for m in range(K):
            if y+m>=N or arr[x][y+m]==0 or (y>0 and arr[x][y-1]):
                break
        else:
            if y+K>=N or arr[x][y+K]==0:
                cnt+=1
        for m in range(K):
            if x+m>=N or arr[x+m][y]==0 or (x>0 and arr[x-1][y]):
                break
        else:
            if x+K>=N or arr[x+K][y]==0:
                cnt+=1            
    for i in range(N):
        for j in range(N):
            if arr[i][j]:
                check(i,j)
    print(f'#{test_case} {cnt}')