package com.cb.view;

import com.cb.service.Init;
import com.cb.service.IsWin;
import com.cb.service.PlayerMove;

import java.util.Scanner;

/**
 * @author 名
 * @date 2023/10/10-19:37
 */
public class GameView {
    public static Scanner s=new Scanner(System.in);
    public void gameView (){
        while (true){
            GameView_ShowMap.gameView_ShowMap();//打印界面
            int x = s.nextInt();
            int y = s.nextInt();//输入x，y
            if(!PlayerMove.playermove(x,y)) continue;//不能放子
            else {
                if(IsWin.isWin(x,y)!=0) {//赢了
                    WinView.winView();
                    break;
                }
                else {
                    Init.flag++;//更新
                }
            }

        }
    }
}
