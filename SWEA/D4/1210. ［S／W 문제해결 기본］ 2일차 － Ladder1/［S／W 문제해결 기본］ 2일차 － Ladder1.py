lst=[]
for i in range(10):
    num=int(input())
    arr=[list(map(int,input().split())) for i in range(100)]
    def ladder(y):
        x=0
        while x < 99:
            if 1<=y<=98:
                while arr[x][y+1]==0 and arr[x][y-1]==0:
                    x+=1
                    if x==99:
                        break
                if arr[x][y+1]:
                    y+=1
                    while arr[x+1][y]==0:
                        y+=1
                    else:
                        x+=1
                        if x==99:
                            break
                elif arr[x][y-1]:
                    y-=1
                    while arr[x+1][y]==0:
                        y-=1
                    else:
                        x+=1
                        if x==99:
                            break
            elif y<1:
                while arr[x][y+1]==0:
                    x+=1
                    if x==99:
                        break
                else:
                    y+=1
                    while arr[x+1][y]==0:
                        y+=1
                    else:
                        x+=1
                        if x==99:
                            break
            elif y>98:
                while arr[x][y-1]==0:
                    x+=1
                    if x==99:
                        break
                else :
                    y-=1
                    while arr[x+1][y]==0:
                        y-=1
                    else:
                        x+=1
                        if x==99:
                            break
        else:
            if y == 0:
                return '0'
            else:
                return y
    for i in range(100):
        if arr[0][i]:
            result = ladder(i)
            if result and arr[99][int(result)]==2:
                lst.append(i)
 
for i in range(10):
    print(f'#{i+1} {lst[i]}')