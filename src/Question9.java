

// 문제9
// https://school.programmers.co.kr/learn/courses/30/lessons/68935

public class Question9 {

    public int solution(int n) {
        int answer = 0;

        String str = Integer.toString(n, 3);

        String reversedStr = new StringBuilder(str).reverse().toString();
        answer = Integer.valueOf(reversedStr, 3);
        return answer;
    }
}

// 답
// https://school.programmers.co.kr/learn/courses/30/lessons/68935/solution_groups?language=java
