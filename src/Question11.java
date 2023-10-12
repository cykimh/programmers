

// 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12916?language=java
public class Question11 {

    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') pCount++;
            if (c == 'y' || c == 'Y') yCount++;
        }

        return (pCount == yCount);
    }
}

// 답
// https://school.programmers.co.kr/learn/courses/30/lessons/12916/solution_groups?language=java
