package com.zth.coupon.service;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 3zZ.
 * Date: 2020/7/11.
 */
public class TestService {


}

class Lesson8_1 {

    /**
     * @param teams-目前还剩多少队伍没有参与组合，result-保存当前已经组合的队伍
     * @return void
     * @Description: 使用函数的递归（嵌套）调用，找出所有可能的队伍组合
     */

    public static void combine(ArrayList<String> teams, ArrayList<String> result, int m) {

        // 挑选完了m个元素，输出结果
        if (result.size() == m) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < teams.size(); i++) {
            // 从剩下的队伍中，选择一队，加入结果
            ArrayList<String> newResult = (ArrayList<String>) (result.clone());
            newResult.add(teams.get(i));

            // 只考虑当前选择之后的所有队伍
            ArrayList<String> rest_teams = new ArrayList<String>(teams.subList(i + 1, teams.size()));

            // 递归调用，对于剩余的队伍继续生成组合
            combine(rest_teams, newResult, m);
        }

    }

}