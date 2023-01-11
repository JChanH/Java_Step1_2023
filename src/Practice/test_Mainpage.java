package Practice;

import java.util.Scanner;

public class test_Mainpage {
	public void inFo() // 실행 메소드
	{
		int b = 0, i, a, max = 0, total = 0;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		System.out.println("점수 입력 프로그램을 실행합니다.");
		System.out.println("학생은 몇명입니까?");
		int std = scan.nextInt();
		Test_data name[] = new Test_data[std * 2]; // Test_data에 데이터를 넣는다

		// 나중에 필요하면 update
		// test_Proc00 Proc = new test_Proc00(); // 매게변수 test_Proc00을 소환함

		outerwh: while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.학생이름 입력 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------");
			a = scan.nextInt();
			switch (a) {
			case 1:// 이름 등록 명령어 실행
				for (i = 0; i < std; i++) {
					System.out.print((i + 1) + "번 학생의 이름 :");
					String stdN = scan.next();
					name[i] = new Test_data(stdN); // name을 통해서 위에서 지정한 test내부의 studentName에 자료 저장
				}
				continue outerwh;

			case 2: // 점수를 입력받는 곳
				/*
				 * //2번부터 입력하면 다시 입력하라고 하고 싶은데.... 너무 어려움... 길이를 표현하는 명령어가 계속 액박 if (name.length
				 * == 0) System.out.println("1번부터 다시하세요");
				 * 
				 * else {
				 */
				for (i = 0; i < std; i++) { // 현재 studentname에 저장된 이름만큼만 반복함
					System.out.println(name[i].getStudentName() + ":점수를 입력해 주세요"); // student name에 저장되어 있는 값을 사용
					name[i].setTestScore(scan.nextInt()); // 동일하게 하나씩 위에 TestScore에 넣어준다
					total += name[i].getTestScore(); // total에 총점을 누적시킨다
				}

				continue outerwh;

			case 3:
				for (i = 0; i < std; i++)
					System.out.println(name[i].getStudentName() + "점수는" + name[i].getTestScore() + "입니다");
				continue outerwh;

			case 4:
				for (i = 0; i < std; i++) { // i< name[i].studentName.length()
					if (max < name[i].getTestScore()) { // 저장된 값들중에 최고점을 찾아냄
						max = name[i].getTestScore();
					}
				}
				System.out.println("최고점수: " + max);
				System.out.println("총점: " + total);
				double avg = total / (double) std;
				System.out.println("평균" + avg);

				continue outerwh;

			case 5:
				System.out.println("현재 페이지를 나갑니다."); // 초기페이지로 돌아감

			default:
				System.out.println("번호를 잘못 입력하셨습니다");
			}

			// 초기 패이지 설정
			System.out.println("1.초기메뉴 2.종료");// 2번 누루면 종료
			// 1번 누루면 다시 시작
			int num2 = scan.nextInt();

			if (num2 == 2) {
				System.out.println("시스템을 종료합니다.");
				run = false; // 진짜 탈출
			} else if (num2 == 1) {
				continue;

			} else {
				System.out.println("잘못된 서비스를 선택하셨습니다");
				System.out.println("다시 입력해 주세요");
			}
		}
	}
}
