T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N,M=map(int,input().split())
    A=list(map(int,input().split()))
    B=list(map(int,input().split()))
    if N>M:
        A,B=B,A
        N,M=M,N
    maxi=-21e8
    for i in range(M-N+1):
        result=0
        for j in range(N):
            result+=A[j]*B[j+i]
        if result>maxi:
            maxi=result
    print(f'#{test_case} {maxi}')
