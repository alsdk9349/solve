T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n=int(input())
    arr=list(map(int,input().split()))
    lst=[]
    for i in range(5):
        lst.append(arr.pop(arr.index(max(arr))))
        lst.append(arr.pop(arr.index(min(arr))))
    print(f'#{test_case}',end=' ')
    print(*lst)