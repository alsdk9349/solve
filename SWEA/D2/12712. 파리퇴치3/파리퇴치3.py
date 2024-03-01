T=int(input())
for tc in range(T):
    directy1=[0,0,1,-1]
    directx1=[1,-1,0,0]
    directy2=[1,1,-1,-1]
    directx2=[-1,1,-1,1]
    N,M=map(int,input().split())
    arr=[list(map(int,input().split())) for _ in range(N)]
    maxi=-21e8
    def abc(sty,stx):
        global maxi
        result=arr[sty][stx]
        for i in range(4):
            for j in range(1,M):
                dy=sty+directy1[i]*j
                dx=stx+directx1[i]*j
                if dy<0 or dx<0 or dy>=N or dx>=N:
                    continue
                result+=arr[dy][dx]
        if result>maxi:
            maxi=result
        result=arr[sty][stx]
        for i in range(4):
            for j in range(1,M):
                dy=sty+directy2[i]*j
                dx=stx+directx2[i]*j
                if dy<0 or dx<0 or dy>=N or dx>=N:
                    continue
                result+=arr[dy][dx]
        if result>maxi:
            maxi=result

    for i in range(N):
        for j in range(N):
            abc(i,j)
    print(f'#{tc+1} {maxi}')