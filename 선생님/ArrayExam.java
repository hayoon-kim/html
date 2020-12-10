package com.kh;
/*
 * 배열을 사용해서 학생수만큼 점수를 입력받고 분석할수 있는 프로그램을
 * 작성하시오.
 * 요구사항
 * 1) 최대값, 최소값, 평균 구하기
 */
import java.util.Scanner;

public class ArrayExam {
			
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] scores = null;
		
		boolean flag = false;		
		while(!flag) {
			printLine('-', 20);
			System.out.println("1.학생수 | 2.점수입력 | 3.점수조회 | 4.분석 | 5.종료");
			printLine('-', 20);
			
			System.out.print("메뉴선택 >> ");
			int menu = scanner.nextInt();
			
			//프로그램 종료
			if(menu == 5) {
				flag = true;
				continue;
			}
			
			switch(menu) {
			case 1: //학생수 입력
				System.out.print("학생수 >> ");
				int studentCount = scanner.nextInt();
				scores = new double[studentCount];
				break;
			case 2: //점수 입력
				for(int i=0; i<scores.length; i++) {
					System.out.print("점수" + (i+1) + ">>");
					scores[i] = scanner.nextDouble();
				}
				System.out.println("점수입력 완료!!");
				break;
			case 3: //점수 조회
				int cnt = 0;
				for(double score : scores ) {
					System.out.println("학생["+ (++cnt) + "] = " + score);
				}
				break;
			case 4: //점수 분석
				double maxValue, minValue, average;
				maxValue = minValue = average = 0.0;
				
				//최대값
				maxValue = getMaxValue(scores);
				
				//최소값
				minValue = getMinValue(scores);
				
				//평균
				average = getAvgValue(scores);
				
				System.out.printf("최대값%-5.2f ,"
						+ "최소값%-5.2f, "
						+ "평균%-5.2f\n", maxValue,minValue,average);
				
				break;
			default:
					
			}
		}
		
		System.out.println("프로그램 종료!!");
	}
	
	//최대값 구하기
	private static double getMaxValue(double[] scores) {
		double maxValue = 0.0;
		
		maxValue = scores[0];
		for(int i=1; i<scores.length; i++) {
			if(scores[i] > maxValue) {
				maxValue = scores[i];
			}
		}
		return maxValue;
	}
	
	//최소값 구하기
	private static double getMinValue(double[] scores) {
		double minValue = 0.0;
		
		minValue = scores[0];
		for(int i=1; i<scores.length; i++) {
			if(scores[i] < minValue) {
				minValue = scores[i];
			}
		}
		return minValue;
	}
	
	//평균 구하기
	private static double getAvgValue(double[] scores) {
		double avgValue = 0.0;
		double sum = 0.0;
		
		for(double score: scores) {
			sum += score;
		}
		
		avgValue = sum / scores.length;
		
		return avgValue;
	}





	//구분선
	private static void printLine(char ch, int cnt) {	
		
		for(int i=0; i<cnt ; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}	
}







