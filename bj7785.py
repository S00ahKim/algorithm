n = int(input("회사에 있는 사람 수: "))

nameList = []

for i in range(0,n):
    name, status = input("").split()
    if status == "leave":
        nameList.remove(name)
    elif status == "enter":
        nameList.append(name)

nameList.sort()
nameList.reverse()

for n in nameList:
    print (n)