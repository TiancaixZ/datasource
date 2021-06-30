package com.javadatasource.test;

import com.javadatasource.linear.Stack;

/**
 * @program: datasource
 * @description: BracketsMatch Test
 * @author: Chen2059
 * @create: 2021-06-26
 **/
public class BracketsMatch {
    public static void main(String[] args) {
        String str = "(上海(长安)())";
        boolean match = isMatch(str);
        System.out.println(str+"中的括号是否匹配："+match);
    }

    /**
     * 判断str中的括号是否匹配
     * @param str 括号组成的字符串
     * @return 如果匹配，返回true，如果不匹配，返回false
     */
    private static boolean isMatch(String str) {
        Stack stack = new Stack();
        char[] array = str.toCharArray();
        for (char c : array) {
            if (c == '('){
                stack.push(c);
            }
            if(c == ')'){
                Object pop = stack.pop();
                if(pop == null){
                    return false;
                }

            }
        }

        if (stack.size() == 0){
            return true;
        }

        return false;
    }

}
