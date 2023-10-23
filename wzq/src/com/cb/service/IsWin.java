package com.cb.service;

/**
 * @author 名
 * @date 2023/10/9-19:23
 */
public class IsWin {

    public static int isWin(int x,int y){
         int[] dx=new int[]{-1,-1,0,1};
         int[] dy=new int[]{1,0,1,1};//(dx,dy)分别是向右上，上，右，右下偏移
         int t;//白子黑子
         if(Init.flag%2==1)t=2;//白子
         else t=1;//黑子
        for (int i = 0; i < 4; i++) {//遍历四个方向
            int sum=0;//四个正反方向除原点的个数
            for (int j = 1; j <=4 ; j++) {//长度1-4
                int x1 = x + dx[i] * j;
                int y1 = y + dy[i] * j;//右上，上，右，右下

                if (pd(x1, y1)) {
                    if (Init.map[x1][y1] == t) sum++;
                    else break;//不连续，跳出

                }
            }
            for (int j = 1; j <=4 ; j++) {//长度1-4
                int x2=x-dx[i]*j;
                int y2=y-dy[i]*j;//反(右上，上，右，右下)
                if(pd(x2,y2)){
                    if(Init.map[x2][y2]==t) sum++;
                    else break;//不连续，跳出
                }

            }

            if(sum>=4) return t;
        }
        return 0;
    }
    //判断越界函数
    public static boolean pd(int x,int y){
        if(x>=0&&x<=19&&y>=0&&y<=19){
            return true;
        }return false;
    }

}
