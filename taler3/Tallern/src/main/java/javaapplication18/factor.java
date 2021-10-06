/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author ZARAT
 */
public class factor {

    public static int fact(int num) {

        if (num > 0) {
            int caluculo = num * fact(num - 1);
            return caluculo;
        }
        return 1;
    }
}
  
