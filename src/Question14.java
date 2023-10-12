
// 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/72410
public class Question14 {

    public String solution(String new_id) {
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]", "");
        //3단계
        new_id = new_id.replaceAll("\\.+", ".");
        //4단계
        new_id = new_id.replaceAll("^\\.+|\\.+$", "");
        //5단계
        if (new_id.isEmpty()) new_id = "a";
        //6단계
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.+$", "");
        }
        //7단계
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }

        return new_id;
    }
}

// 답
// https://school.programmers.co.kr/learn/courses/30/lessons/72410/solution_groups?language=java