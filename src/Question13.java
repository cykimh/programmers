

// 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12918

public class Question13 {

    public boolean solution(String s) {
        boolean answer = true;
        answer = s.matches("[0-9]{4}|[0-9]{6}]");
        return answer;
    }
}

// 답
// https://school.programmers.co.kr/learn/courses/30/lessons/12918/solution_groups?language=java