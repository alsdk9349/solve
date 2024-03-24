T = int(input())
for test_case in range(1, T + 1):
    N,B=map(int,input().split())
    arr=list(map(int,input().split()))
    mini=21e8
    def dfs(level,height,ind):
        global mini
        if height>=B:
            if height<mini:
                mini=height
            return
        if level == N:
            return
        if height >mini:
            return
        for i in range(ind, N):
            dfs(level+1,height+arr[i],i+1)
    dfs(0,0,0)
    result=mini-B
    print(f'#{test_case} {result}')