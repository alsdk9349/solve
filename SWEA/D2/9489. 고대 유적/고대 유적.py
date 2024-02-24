T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N,M=map(int,input().split())
    arr=[list(map(int,input().split())) for _ in range(N)]
    result=-21e8
    def abc(sty,stx):
        maxi=-21e8
        cnt=1
        for i in range(sty+1,N):
            if arr[i][stx]==0:
                break
            else:
                cnt+=1
        if cnt>maxi:
            maxi=cnt
        cnt=1
        for j in range(stx+1,M):
            if arr[sty][j]==0:
                break
            else:
                cnt+=1
        if cnt>maxi:
            maxi=cnt    
        return maxi
    
    for i in range(N):
        for j in range(M):
            if arr[i][j]:
                K=abc(i,j)
                if K>result:
                    result=K
                    
    print(f'#{test_case} {result}')