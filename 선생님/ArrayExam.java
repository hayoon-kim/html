package com.kh;
/*
 * �迭�� ����ؼ� �л�����ŭ ������ �Է¹ް� �м��Ҽ� �ִ� ���α׷���
 * �ۼ��Ͻÿ�.
 * �䱸����
 * 1) �ִ밪, �ּҰ�, ��� ���ϱ�
 */
import java.util.Scanner;

public class ArrayExam {
			
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] scores = null;
		
		boolean flag = false;		
		while(!flag) {
			printLine('-', 20);
			System.out.println("1.�л��� | 2.�����Է� | 3.������ȸ | 4.�м� | 5.����");
			printLine('-', 20);
			
			System.out.print("�޴����� >> ");
			int menu = scanner.nextInt();
			
			//���α׷� ����
			if(menu == 5) {
				flag = true;
				continue;
			}
			
			switch(menu) {
			case 1: //�л��� �Է�
				System.out.print("�л��� >> ");
				int studentCount = scanner.nextInt();
				scores = new double[studentCount];
				break;
			case 2: //���� �Է�
				for(int i=0; i<scores.length; i++) {
					System.out.print("����" + (i+1) + ">>");
					scores[i] = scanner.nextDouble();
				}
				System.out.println("�����Է� �Ϸ�!!");
				break;
			case 3: //���� ��ȸ
				int cnt = 0;
				for(double score : scores ) {
					System.out.println("�л�["+ (++cnt) + "] = " + score);
				}
				break;
			case 4: //���� �м�
				double maxValue, minValue, average;
				maxValue = minValue = average = 0.0;
				
				//�ִ밪
				maxValue = getMaxValue(scores);
				
				//�ּҰ�
				minValue = getMinValue(scores);
				
				//���
				average = getAvgValue(scores);
				
				System.out.printf("�ִ밪%-5.2f ,"
						+ "�ּҰ�%-5.2f, "
						+ "���%-5.2f\n", maxValue,minValue,average);
				
				break;
			default:
					
			}
		}
		
		System.out.println("���α׷� ����!!");
	}
	
	//�ִ밪 ���ϱ�
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
	
	//�ּҰ� ���ϱ�
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
	
	//��� ���ϱ�
	private static double getAvgValue(double[] scores) {
		double avgValue = 0.0;
		double sum = 0.0;
		
		for(double score: scores) {
			sum += score;
		}
		
		avgValue = sum / scores.length;
		
		return avgValue;
	}





	//���м�
	private static void printLine(char ch, int cnt) {	
		
		for(int i=0; i<cnt ; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}	
}







