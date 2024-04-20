N, M = map(int,input().split())
arr = [list(map(int,input().split())) for _ in range(N)]
rep = int(input())
for i in range(rep):
    a,b,c,d = map(int,input().split())
    result=0
    for m in range(a-1,c):
        for n in range(b-1,d):
            result+=arr[m][n]
    print(result)