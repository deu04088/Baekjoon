N = int(input())
cnt = N

for i in range(N):
    word = input()
    for j in range(len(word)-1):
        if word[j] != word[j+1]:
            compare = word[j+1:]
            if compare.count(word[j]) > 0:
                cnt -= 1
                break
print(cnt)