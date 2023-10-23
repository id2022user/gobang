package com.cb.view;

import com.cb.service.Init;

/**
 * @author 名
 * @date 2023/10/10-19:36
 */
public class GameView_ShowMap  {
    public static void gameView_ShowMap (){//打印界面
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(Init.map[i][j]);
            }
            System.out.print("\n");
        }
    }
}
