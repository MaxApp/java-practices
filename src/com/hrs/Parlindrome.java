package com.hrs;

/*
 *  1.回文检测
 *  2.对排序后的数组，进行子集判断
 */
public class Parlindrome {

	public static void main(String[] args) {
		
		/*
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
        } */

		int[] a={2,3,3,4,6,8,9,13,15,23,24,28,32,36,54,69,72,75,81,88,89,94,96,97};
		int[] b={5,6,13,24,54,72};
		
		if(isSubset(a,b)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
	}
	
	/*
	 * 对排序后的两个数组
	 * 判断 small 是否是 big 的子集
	 */
	static boolean isSubset(int[] big, int[] small){
		int blen=big.length;
		int slen=small.length;
		int j=0;
		for(int i=0;i<slen;i++,j++){
			for(;j<blen;j++){
				if(small[i]==big[j]){
					break;
				}
			}
			
			if(j==blen)
				return false;
		}
		return true;
	}

}
