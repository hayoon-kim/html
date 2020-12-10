package com.kh;

public class PrintStar {

	//구분선 출력
	public static void splitLine(char ch, int cnt) {

		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int dan = 4;
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=dan; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		splitLine('=',5);
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		splitLine('=',5);
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=dan-i+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		splitLine('=',5);
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=dan-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		splitLine('=',5);
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(' ');
			}
			for(int j=1; j<=dan-i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		splitLine('=',5);
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=dan-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		splitLine('=',5);		
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(dan-i)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		splitLine('=',5);	
		
		for(int i=1; i<=dan; i++) {
			for(int j=1; j<=dan; j++) {
				if(j < dan-i+1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		splitLine('=',5);	
		for(int i=0; i<dan; i++) {
			for(int j=0; j<dan+i; j++) {
				if(j < dan-i-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}				
	}
}









