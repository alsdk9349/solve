T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N=int(input())
    arr=list(input().split())
    if N%2==0:
        sli=N//2
    else:
        sli=N//2+1
    newarr=[]
    for i in range(N):
        if i%2==0:
            newarr.append(arr[i//2])
        if i%2==1:
            newarr.append(arr[sli+i//2])
    print(f'#{test_case}',end=' ')
    print(*newarr)