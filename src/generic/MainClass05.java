package generic;

import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
	Service05 mem = new ServiceImpl05();
	Scanner input = new Scanner(System.in);
	int num;
	while(true) {
		System.out.println("1. 회원 관리");
		System.out.println("2. 종료");
		System.out.print(">>>");
		num = input.nextInt();
		switch (num) {
		case 1 : 
			mem.display();
			break;
		case 2 : return;
		}
	}
}
}
