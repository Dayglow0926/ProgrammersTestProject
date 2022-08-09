package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 신고당한 사람의 횟수와 신고한 사람에 대한 정보 중복 제거 필수!
public class ReportResult {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        report = Arrays.stream(report).distinct().toArray(String[]::new);

        int[] reportCount = new int [id_list.length];
        int[] mailSendCount = new int [id_list.length];

        List<String> freeze_list = new ArrayList<>();

        for(String check : report){
            String[] name = check.split(" ");
            int num = Arrays.asList(id_list).indexOf(name[1]);

            reportCount[num]++;
            if(reportCount[num] >= k) freeze_list.add(id_list[num]);
        }

        for(String check : report){
            String[] name = check.split(" ");
            if(freeze_list.indexOf(name[1])>=0){
                int num = Arrays.asList(id_list).indexOf(name[0]);
                mailSendCount[num]++;
            }
        }

        for (int i : mailSendCount){
            System.out.println(i);
        }


    }

}
