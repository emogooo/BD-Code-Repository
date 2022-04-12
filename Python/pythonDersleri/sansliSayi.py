def isSubsetSum(A, k):
    n = len(A)
    T = [[False for x in range(k+1)] for x in range(n+1)]
    for i in range(0,k+1,1):
        T[0][i] = False
    for i in range(0,n+1,1):
        T[i][0] = True
    for i in range(1, n + 1, 1):
        for j in range(1, k + 1, 1):
            if A[i - 1] > j:
                T[i][j] = T[i - 1][j]
            else:
                T[i][j] = T[i - 1][j] or T[i - 1][j - A[i - 1]]
    return T[n][k]

diziBoyutu, k = map(int, input().split())
dizi = list(map(int, input().split()))
sayac = 0

for i in range(1, k+1, 1):
    if i in dizi:
        continue
    else:
        if isSubsetSum(dizi, i):
            continue
        else:
            dizi.append(i)
            sayac += 1
print(sayac)