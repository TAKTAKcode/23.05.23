package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //영문자의 총 개수 : 26
        int[] arr = new int[26];
        String s = sc.next();

        for (int i = 0; i < s.length(); i++){

            //if : 대문자 범위
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                //해당 인덱스의 값 1 증가
                arr[s.charAt(i) - 'A']++;
            }

            //else : 소문자 범위
            else {
                arr[s.charAt(i) - 'a']++;
            }
        }

    }

}
