def solution(num_list):
    answer = 0
    for i in num_list:
        if i > 0:
            answer += 1
        else:
            return answer
    return -1