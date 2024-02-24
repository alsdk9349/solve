T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N,K=map(int,input().split())
    result=['A+','A0','A-','B+','B0','B-','C+','C0','C-','D0']
    arr=[]
    for _ in range(N):
        a,b,c=map(int,input().split())
        total=0.35*a + 0.45*b + 0.2*c
        arr.append(total)
    lst=sorted(arr,reverse=True)
    rank=lst.index(arr[K-1])
    check=rank//(N//10)
    print(f'#{test_case} {result[check]}')



