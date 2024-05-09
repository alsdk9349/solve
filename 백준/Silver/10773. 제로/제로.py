N=int(input())
arr=[]
for _ in range(N):
    number=int(input())
    if number ==0:
        if arr:
            arr.pop()
    else:
        arr.append(number)

print(sum(arr))
