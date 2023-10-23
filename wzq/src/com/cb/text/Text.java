package com.cb.text;

import com.cb.service.Init;
import com.cb.service.IsWin;
import com.cb.service.PlayerMove;

import static com.cb.service.IsWin.isWin;
import static java.lang.System.exit;

/**
 * @author 名
 * @date 2023/10/9-19:23
 */
public class Text {
    public static void main(String[] args) {
        int testflag=0;//测试1
        if(Init.flag!=0) {
            System.out.println("init() error");
            exit(0);
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if(Init.map[i][j]!=0){
                    System.out.println("init() error");
                    exit(0);
                }
            }
        }
        System.out.println("init() success\n");
        testflag++;
        boolean result=true;//测试2
        result &= PlayerMove.playermove(2,2);
        result &= PlayerMove.playermove(2,3);
        result &= PlayerMove.playermove(2,4);
        result &= PlayerMove.playermove(2,5);
        if (result!=true||
                !(Init.map[2][2]!=0&&Init.map[2][3]!=0&&Init.map[2][4]!=0&&Init.map[2][5]!=0)){
            System.out.println("playerMove() error");
            exit(0);
        }
        Init.flag=1;
        result &=PlayerMove.playermove(2,5);
        if (result==true||Init.map[2][5]!=1){
            System.out.println("playerMore() error");
            exit(0);
        }
        System.out.println("playerMove success\n");
        testflag++;
        PlayerMove.playermove(2,1);//测试3
        if (isWin(2,1)!=0){
            System.out.println("isWin() error");
            System.exit(0);
        }
        PlayerMove.playermove(1,0);
        PlayerMove.playermove(3,2);
        PlayerMove.playermove(4,3);
        PlayerMove.playermove(5,4);
        if (IsWin.isWin(1,0)!=2){
            System.out.println("isWin() error");
            exit(0);
        }
        System.out.println("isWin() success\n");
        testflag++;
        if(testflag==3){
            System.out.println("service code success\n");
        }

    }
}
