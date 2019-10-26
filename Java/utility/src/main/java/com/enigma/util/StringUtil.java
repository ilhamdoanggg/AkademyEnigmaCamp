package com.enigma.util;

/**
 * * Create at 9/24/2019 3:06 PM @author Ilhamdoanggg
 **/
public class StringUtil {

    /*
    * get left padding nod di depan angka
    * */
    public static String getLeftPadding(int number, int padding){
        return String.format("%"+number+"s", padding).replaceAll(" ", "0");
    }

    /*
    * get right pading nol di belakang angka
    * */
}
