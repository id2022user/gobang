package com.cb.service;

/**
 * @author 名
 * @date 2023/10/10-19:39
 */
public class PlayerMove extends Init {

    public static boolean playermove(int x,int y){
        if(map[x][y]==0){//map空
            if(flag%2==1) map[x][y]=2;//奇数
            else map[x][y]=1;//偶数
            return true;
        }else {//map不空
            return false;
        }
    }
}
