package com.javadatasource.test;

import com.javadatasource.linear.Stack;

/**
 * @program: datasource
 * @description: ReversePolishNotation
 * @author: Chen2059
 * @create: 2021-06-30
 **/
public class ReversePolishNotation {
    public static void main(String[] args) {
        //3 17 15 - * 18 6 / +
        String[] noation = {"3","17","15","-","*","18","6","/","+"};
        int result = caculate(noation);
        System.out.println("逆波兰表达式的结果为：" + result);
    }

    /**
     * @param noation 逆波兰表达式的数组表示方式
     * @return 逆波兰表达式的计算结果
     */
    private static int caculate(String[] noation) {
        Stack oprands = new Stack();
        for (String s : noation) {
            Integer o1;
            Integer o2;
            Integer result;
            switch (s){
                case "-":
                    o1 = (Integer) oprands.pop();
                    o2 = (Integer) oprands.pop();
                    result = o2 -o1;
                    oprands.push(result);
                    break;
                case "+":
                    o1 = (Integer) oprands.pop();
                    o2 = (Integer) oprands.pop();
                    result = o2 + o1;
                    oprands.push(result);
                    break;
                case "*":
                    o1 = (Integer) oprands.pop();
                    o2 = (Integer) oprands.pop();
                    result = o2 * o1;
                    oprands.push(result);
                    break;
                case "/":
                    o1 = (Integer) oprands.pop();
                    o2 = (Integer) oprands.pop();
                    result = o2 / o1;
                    oprands.push(result);
                    break;
                default:
                    oprands.push(Integer.parseInt(s));
                    break;
            }
        }

         Integer result = (Integer) oprands.pop();

        return result;
    }
}
