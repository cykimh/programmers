



// 문제10
// https://school.programmers.co.kr/learn/courses/30/lessons/70129

public class Question10 {

    public int[] solution(String s) {
        int[] answer = {};

        int loopNumber = 0;
        int removedNumber = 0;

        while (!s.equals("1")) {
            int zeroCnt = countZeros(s);
            loopNumber++;
            removedNumber += zeroCnt;
            int ones = s.length() - zeroCnt;
            s = Integer.toString(ones, 2);
        }
        answer = new int[]{loopNumber, removedNumber};
        return answer;
    }

    public int countZeros(String s) {
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zeros = zeros + 1;
            }
        }

        return zeros;
    }
}

// 답
// https://school.programmers.co.kr/learn/courses/30/lessons/70129/solution_groups?language=java