T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    directy=[0,0,1,-1]
    directx=[1,-1,0,0]
    N,M=map(int,input().split())
 
    arr=[list(map(int,input().split())) for i in range(N)]
    def abc(a,b):
        sum1=arr[a][b]
        for l in range(1,arr[a][b]+1):
            for k in range(4):
                dy=a+l*directy[k]
                dx=b+l*directx[k]
                if 0<=dy<N and 0<=dx<M:
                    sum1+=arr[dy][dx]
        return sum1
    maxi=-21e8
    for i in range(N):
        for j in range(M):
            result=abc(i,j)
            if maxi<result:
                maxi=result
    print(f'#{test_case} {maxi}')
