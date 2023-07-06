package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceImpl05 implements Service05{
	private ArrayList<DTO05> member;
	public ServiceImpl05() {
		member = new ArrayList<>();
	}
	private int register(String name, String addr) {
		DTO05 dto = new DTO05();
		dto.setAddr(addr);
		dto.setName(name);
		member.add(dto);
		//if 문을 통해서 저장이 잘되면 1을 돌려주고 실패하면 0으로 돌려준다
		return 1;
	}
	public void memberView() {
		System.out.println("=============");
		System.out.println("이름\t주소");
		System.out.println("=============");
		for(int i=0;i<member.size();i++) {
			DTO05 dto = member.get(i);
			System.out.println(dto.getName()+"\t"+dto.getAddr());
			System.out.println("--------------");
		}
		
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		int num, result;
		String name, addr;
		while(true) {
			System.out.println("1. 회원 저장");
			System.out.println("2. 모든 회원 보기");
			System.out.println("3. main 이동");
			System.out.print(">>>");
			num = input.nextInt();
			switch (num) {
			case 1 : 
				System.out.print("이름 : ");
				name = input.next();
				System.out.print("주소 : ");
				addr = input.next();
				result = register(name, addr);
				if(result ==1) {
					System.out.println("등록되었습니다");
				}else {
					System.out.println("문제가 발생했습니다");
				}
				break;
			case 2 : 
				memberView();
				break;
			case 3 : 
				
				return;
			}
		}
	}
}
