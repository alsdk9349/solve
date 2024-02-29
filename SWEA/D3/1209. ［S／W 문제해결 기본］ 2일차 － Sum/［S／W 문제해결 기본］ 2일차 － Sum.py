lst=[]
for i in range(10):
    result=[]
    num=int(input())
    arr=[list(map(int,input().split()))for j in range(100)]
    def hang():
        max1=-21e8
        for i in range(100):
            if sum(arr[i])>max1:
                max1 = sum(arr[i])
        return max1
    def ten():
        max2=-21e8
        for i in range(100):
            for j in range(100):
                if i < j:
                    arr[i][j],arr[j][i] = arr[j][i],arr[i][j]
        for i in range(100):
            if sum(arr[i])>max2:
                max2 = sum(arr[i])
        return max2
    def cross():
        a=0
        b=0
        for i in range(100):
            a+=arr[i][i]
            b+=arr[i][-1-i]
        if a<b:
            return b
        else:
            return a
    result.append(hang())
    result.append(cross())
    result.append(ten())
    lst.append(max(result))
 
for i in range(10):
    print(f'#{i+1} {lst[i]}')