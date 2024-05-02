def solution(numbers, target):
    global answer
    answer = 0
    def dfs(level,total):
        global answer
        if level >= len(numbers):
            if total == target:
                answer+=1
            return
        for i in range(2):
            if i ==0:
                dfs(level+1,total+numbers[level])
            else:
                dfs(level+1,total-numbers[level])
    dfs(0,0)    
    print(answer)

    return answer