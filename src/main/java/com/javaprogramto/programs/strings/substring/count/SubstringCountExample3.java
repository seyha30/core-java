package com.javaprogramto.programs.strings.substring.count;

public class SubstringCountExample3 {

	public static void main(String[] args) {

		int count = countSubStringInString("22222", "22");
		System.out.println(count);

		count = countSubStringInString("madam", "ma");
		System.out.println(count);

	}

	public static int countSubStringInString(String string, String toFind) {
		int M = toFind.length();
		int N = string.length();
		int res = 0;

		for (int i = 0; i <= N - M; i++) {

			int j;
			for (j = 0; j < M; j++) {
				if (string.charAt(i + j) != toFind.charAt(j)) {
					break;
				}
			}

			if (j == M) {
				res++;
				j = 0;
			}
		}
		return res;
	}
}
