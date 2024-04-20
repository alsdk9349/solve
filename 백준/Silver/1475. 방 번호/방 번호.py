N=int(input())
bucket=[0]*10
text=str(N)

for i in range(len(text)):
    bucket[int(text[i])]+=1

spn = bucket[6]+bucket[9]
bucket[6] = spn//2 + spn%2
bucket[9] = spn//2
result=max(bucket)
print(result)