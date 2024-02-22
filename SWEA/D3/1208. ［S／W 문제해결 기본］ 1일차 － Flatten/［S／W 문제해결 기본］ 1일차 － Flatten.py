for test_case in range(1, 11):  
    rep = int(input())
    arr=list(map(int,input().split()))
    for i in range(rep):
        x= arr.index(max(arr))
        y = arr.index(min(arr))
        arr[x]-=1
        arr[y]+=1
    print(f'#{test_case} {max(arr)-min(arr)}')