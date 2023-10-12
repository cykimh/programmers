


// 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/81301

public class Question12 {

    private static final String[] numberWords = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
    };

    public int solution(String s) {
        int answer = 0;


        for (int i = 0; i < numberWords.length; i++) {
            s = s.replace(numberWords[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}

// 답
// https://school.programmers.co.kr/learn/courses/30/lessons/81301/solution_groups?language=java