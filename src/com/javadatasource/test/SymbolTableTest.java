package com.javadatasource.test;

import com.javadatasource.linear.SymbolTable;

/**
 * @program: datasource
 * @description: SymbolTableTest Test
 * @author: Chen2059
 * @create: 2021-06-30
 **/
public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();
        symbolTable.put(1,"张三");
        symbolTable.put(2,"李四");
        symbolTable.put(3,"王五");
        System.out.println(symbolTable.size());
        System.out.println(symbolTable);

        symbolTable.put(1,"老三");
        System.out.println(symbolTable.get(1));
        System.out.println(symbolTable.size());
        symbolTable.delete(1);
        System.out.println(symbolTable.size());
    }
}
