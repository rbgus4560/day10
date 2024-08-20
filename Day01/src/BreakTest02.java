//다중 반복문을 모두 강제 종료하기 위해서 이름 붙는 반복문을 응용한 메뉴선택 계산예제

import java.util.Scanner;

public class BreakTest02 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;

		Scanner scan = new Scanner(System.in);

		exit_for: while (true) {// 무한루프문
			System.out.println("=================================");
			System.out.println("1-물냉면");
			System.out.println("2-비빔냉면");
			System.out.println("3-삼겹살");
			System.out.print("원하는 메뉴(1-3)를 선택하세요.(종료:0)\n>> ");

			String resultMenu = scan.nextLine(); // 문자열로 메뉴를 입력받는다.
			menu = Integer.parseInt(resultMenu);// 입력받은 메뉴번호 문자열을 정수숫자로 변경해서 저장

			if (menu == 0) {
				System.out.println("메뉴를 종료합니다.");
				break;// 무한루프 while 반복문 종료
			} else if (!(menu >= 1 && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				System.out.println("=================================");
				continue;// 어랴문장을 실행하지 않고 반복문 처음으로 돌아가서 다음 반복 계속

			}
			System.out.println("=================================");
			
			for (;;) {// for 반복문 무한루프
				System.out.print("메뉴 계산할 값을 입력. (계산 종료:0,전체 종료:99)\n>> ");
				num=Integer.parseInt(scan.nextLine());
				
				if(num==0) {
					break; //무한루프 for 반복문 종료
				}
				
				if(num==99) 
					break exit_for;//전체 종료=> for, while 반복문 모두 종료하고 빠져 나간다.
					
				switch(menu) {
				case 1: System.out.println("물냉면="+num+"원");
				System.out.println("=================================");
				break;
				case 2: System.out.println("비빔냉면="+num+"원");
				System.out.println("=================================");
				break;
				case 3: System.out.println("삼겹살="+num+"원");
				System.out.println("=================================");
				}
				
			} // for
		} // while
	}

}
