T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    N=int(input()) #N개의 버스가 있음
    arr=[list(map(int,input().split())) for _ in range(N)] #각 버스별 노선
    P=int(input()) #확인할 정류장 개수
    lst=[]
    for i in range(P):
        lst.append(int(input()))#리스트에 확인할 정류장 번호 추가
 
    path=[0]*5001 #각 정류장별로 지나가는 노선수체크
    for i in range(N):
        for j in range(arr[i][0],arr[i][1]+1):
            path[j]+=1
 
    result=[]
    for i in range(P):
        result.append(path[lst[i]])
    print(f'#{test_case}',end=' ')
    print(*result)