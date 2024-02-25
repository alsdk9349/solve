arr=[list(map(int,input().split())) for _ in range(5)]
lst=[list(map(int,input().split())) for _ in range(5)]
cnt=0
def mark(num):
    global cnt
    for i in range(5):
        for j in range(5):
            if arr[i][j]==num:
                cnt+=1
                arr[i][j]=0
def check():
    B=0
    for i in range(5):
        if sum(arr[i])==0:
            B+=1
        if arr[0][i]+arr[1][i]+arr[2][i]+arr[3][i]+arr[4][i]==0:
            B+=1
    if arr[0][0]+arr[1][1]+arr[2][2]+arr[3][3]+arr[4][4]==0:
        B+=1
    if arr[0][4]+arr[1][3]+arr[2][2]+arr[3][1]+arr[4][0]==0:
        B+=1                
    return B
flag=False
for i in range(5):
    for j in range(5):
        mark(lst[i][j])
        result=check()
        if result>=3:
            print(cnt)
            flag=True
            break
    if flag:
        break