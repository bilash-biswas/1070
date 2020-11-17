X = int(input())
if X % 2 == 0 :
    for i in range(1,12,2):
        print(X + i)
else:
    for i in range(2,13,2):
        print(X + i)
