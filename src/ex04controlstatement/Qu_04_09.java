package ex04controlstatement;

/*
문제4]
구구단을 이중 for문을 이용해서 다음과 같이 출력하시오
출력]				
	2*1=2   3*1=3 ~~~~~~~~~~  9*1=9
	2*2=4   ~~~~~~~~~~~~~~~   9*2=18
	~~~~~~~~~~~~~
	2*8=16~~~~~~~~~~~~~~~~    9*8=72
	2*9=18~~~~~~~~~~~~~~~~    9*9=81
 */
public class Qu_04_09 {

	public static void main(String[] args) {
		int su,dan;
		for(su=1 ; su<=9 ; su++){
			for(dan=2 ; dan<=9 ; dan++){
				System.out.printf("%d*%d=%2d   ",dan,su,dan*su);
			}
			System.out.println();
		}
	}//end of main

}//end of class