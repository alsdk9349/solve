T = int(input())
 
arr=[]
 
for test_case in range(1, T + 1):
    n = int(input())
    lst=list(map(int,input()))
    maximum=0
    su=0
    for i in range(n):
        if lst[i]:
            su+=1
            if maximum<su:
                maximum=su
        else:
            su=0
    arr.append(maximum)
 
for i in range(len(arr)):
    print('#%d %d'%(i+1,arr[i]))