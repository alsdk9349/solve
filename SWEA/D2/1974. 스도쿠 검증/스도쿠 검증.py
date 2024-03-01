T = int(input())
directy=[0,0,0,3,3,3,6,6,6]
directx=[0,3,6,0,3,6,0,3,6]
for test_case in range(1, T + 1):
    arr=[list(map(int,input().split())) for _ in range(9)]
    result=1
    def check(num):
        global result
        path=[0]*10
        for i in range(9):
            path[arr[num][i]]+=1
            if path[arr[num][i]]>1:
                result=0
                break
        path=[0]*10
        for j in range(9):
            path[arr[j][num]]+=1
            if path[arr[j][num]]>1:
                result=0
                break
        path=[0]*10
        B=False
        for l in range(3):
            for m in range(3):
                path[arr[directy[num]+l][directx[num]+m]]+=1
                if path[arr[directy[num]+l][directx[num]+m]]>1:
                    result=0
                    B=True
                    break
            if B:
                break
    for k in range(9):
        check(k)
    print(f'#{test_case} {result}')