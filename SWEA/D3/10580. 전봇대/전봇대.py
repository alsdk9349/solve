T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N=int(input())
    arr=[]
    result=0
    for i in range(N):
        A,B=map(int,input().split())
        for j in range(len(arr)):
            if arr[j][0]<A and arr[j][1]>B:
                result+=1
            if arr[j][0]>A and arr[j][1]<B:
                result+=1
        arr.append([A,B])
    print(f'#{test_case} {result}')
