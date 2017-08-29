package test;

import java.util.ArrayList;
import java.util.List;

public class Java8新機能 {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();
		cities.add("京都");
		cities.add("大阪");
		cities.add("神戸");

		// ラムダ式を使わないで出力します
		for (String city : cities) {
			System.out.println(city);
		}

		// ラムダ式を使って出力します
		cities.forEach((final String city) -> System.out.println(city));
	}

}
