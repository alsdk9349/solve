import copy
N=int(input())
arr=[list(input()) for _ in range(N)]
directy=[0,0,1,-1]
directx=[1,-1,0,0]
maxi = 1

def find(bayeol):
    global maxi
    for i in range(N):
        for j in range(N):
            cnt1=1
            for k in range(i+1,N):
                if bayeol[i][j]==bayeol[k][j]:
                    cnt1+=1
                else:
                    if cnt1>maxi:
                        maxi=cnt1
                    break
                if cnt1>maxi:
                    maxi=cnt1
    for i in range(N):
        for j in range(N):
            cnt2=1
            for k in range(j+1,N):
                if bayeol[i][j]==bayeol[i][k]:
                    cnt2+=1
                else:
                    if cnt2>maxi:
                        maxi=cnt2
                    break
                if cnt2>maxi:
                    maxi=cnt2

for i in range(N):
    for j in range(N):
        for k in range(4):
            dy=i+directy[k]
            dx=j+directx[k]
            if dy<0 or dx<0 or dy>=N or dx>=N:
                continue
            if arr[i][j]!=arr[dy][dx]:
                lst=copy.deepcopy(arr)
                lst[i][j],lst[dy][dx]=lst[dy][dx],lst[i][j]
                find(lst)

print(maxi)