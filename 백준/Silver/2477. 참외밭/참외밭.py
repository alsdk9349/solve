N=int(input())
garo=[]
saro=[]
direct = []
distance = []
for i in range(6):
    a,b=map(int,input().split())
    direct.append(a)
    distance.append(b)
    if a == 1 or a== 2:
        garo.append(b)
    else:
        saro.append(b)

lst=[]
for j in range(4):
    if direct[j]==direct[j+2]:
        lst.append(distance[j+1])

if direct[4]==direct[0]:
    lst.append(distance[5])
if direct[5]==direct[1]:
    lst.append(distance[0])

bg = max(garo)
bs = max(saro)
total = bg*bs

if lst:
    total-=lst[0]*lst[1]
else:
    total-=distance[0]*distance[5]
total*=N
print(total)
