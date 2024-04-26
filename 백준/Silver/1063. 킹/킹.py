kn,sn,mc = input().split()
mc=int(mc)
arr=[[0]*8 for _ in range(8)]
y,x =int(kn[1])-1,ord(kn[0])-65
stoney,stonex = int(sn[1])-1,ord(sn[0])-65
for _ in range(mc):
    mov = input()
    prey,prex=y,x
    if 'R' in mov:
        x+=1
    if 'L' in mov:
        x-=1
    if 'B' in mov:
        y-=1
    if 'T' in mov:
        y+=1
    if y<0 or y>=8 or x<0 or x>=8:
        y,x = prey,prex
        continue
    if y==stoney and x==stonex:
        prestoney,prestonex=stoney,stonex
        stoney+=y-prey
        stonex+=x-prex
        if stoney<0 or stoney>=8 or stonex<0 or stonex>=8:
            stoney,stonex=prestoney,prestonex
            y,x=prey,prex

kresult=chr(65+x)+str(y+1)
sresult=chr(stonex+65)+str(stoney+1)
print(kresult)
print(sresult)