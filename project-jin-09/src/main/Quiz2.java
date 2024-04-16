package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		System.out.println("드라이버를 선택하세요.");
		System.out.println("1 : mysql");
		System.out.println("2 : oracle");
		System.out.println("3 : postgres");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number == 1) {
			MySqlBDriver mysqldbriver = new MySqlBDriver();
			mysqldbriver.dbConnet();
		} else if (number == 2) {
			OracleDBDriver mysqldbriver = new OracleDBDriver();
			mysqldbriver.dbConnet();
		} else if (number == 3) {
			PostgresDBDriver postgresdbdriver = new PostgresDBDriver();
			postgresdbdriver.dbConnet();
		} else {
			System.out.println("다시 입력하세욧!!");
		}
		
	}
}

class MySqlBDriver implements DBDriver {

	@Override
	public void dbConnet() {
		System.out.println("MySql DB에 연결합니다.");
	}
	
}

class OracleDBDriver implements DBDriver {

	@Override
	public void dbConnet() {
		System.out.println("Oracle DB에 연결합니다.");
	}
	
}

class PostgresDBDriver implements DBDriver {

	@Override
	public void dbConnet() {
		System.out.println("postgres에 연결합니다.");
	}
	
}