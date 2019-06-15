package com.hrs;

/*
 *  回文检测
 */
public class Parlindrome {

	public static void main(String[] args) {
		String param = args[0];
		int front = 0;
        int end = param.length()-1;
        boolean flag = true;
        for(;front<end;front++,end--){
            if(param.charAt(front) == param.charAt(end)){
                continue;
            }else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        } 

	}

}
