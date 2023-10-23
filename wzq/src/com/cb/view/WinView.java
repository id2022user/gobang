package com.cb.view;

import com.cb.service.Init;

import java.util.Scanner;

/**
 * @author 名
 * @date 2023/10/10-19:36
 */
public class WinView {

    public static void winView(){//打印赢单
        if(Init.flag%2==1){
            System.out.println("Black Part Win!");
        }else {
            System.out.println("Blank Part Win!");
        }
    }
}
