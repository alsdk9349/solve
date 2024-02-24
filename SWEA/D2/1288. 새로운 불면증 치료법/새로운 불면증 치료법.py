T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N=int(input())
    jump=N
    bucket=[0]*10
    result=''
    while sum(bucket)<10:
        N=str(N)
        for i in range(len(N)):
            bucket[int(N[i])]=1
        N=int(N)
        result=N
        N+=jump
    print(f'#{test_case} {result}')