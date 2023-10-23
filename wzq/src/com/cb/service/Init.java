package com.cb.service;

/**
 * @author 名
 * @date 2023/10/10-19:39
 */
public class Init {
    public static int[][] map=new int[19][19];
    public static int flag;
     static {//初始化map，flag
        flag=0;
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                map[i][j]=0;
            }

        }
    }

}
