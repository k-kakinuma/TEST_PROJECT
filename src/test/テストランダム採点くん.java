package test;

import java.util.Random;

public class テストランダム採点くん {

	public static void main(String[] args) {

		// Randomクラス
		Random random = new Random();

		// 0から1000までランダムで数字を生成する
		int num = random.nextInt(1001);

		// 点数を表示する
		System.out.println("あなたの点数は" + num + "点です。");

	}

}
