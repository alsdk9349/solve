N=int(input())
lenN = len(str(N))
result=0
for i in range(1,lenN):
    result+=9*i*(10**(i-1))
result+=(N-(10**(lenN-1))+1)*lenN
print(result)