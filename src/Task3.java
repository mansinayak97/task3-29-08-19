import java.util.StringTokenizer;

public class Task3 {

	int gmailCount = 0, rediffCount = 0, yahooCount = 0;
	int csCount = 0, itCount = 0, mechCount = 0, civilCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 obj = new Task3();
		String emails[] = { "ab@gmail.com", "xyz@yahoo.com",
				"pqr@rediffmail.com", "qwe@rediffmail.com", "lkjh@gmail.com",
				"zxcv@gmail.com", "asdf@rediffmail.com", "mnb@gmail.com" };
		obj.mailCount(emails);

		String rnos[] = { "12343434", "3415434", "5633232", "7845963",
				"7894563", "5612349", "1236987", "7845123", "3468753",
				"3402198", "34125698", "1236549" };
		obj.branchCount(rnos);
		String str = "1.java,2.oracle,3.python,4.php,5.linux";
		obj.opTokens(str);
		String numStr = "ad3daddfd5443dfsfss";
		obj.removeNos(numStr);
		String pallin = "abccba";
		String noPallin = "abcb";
		obj.checkPalSB(pallin);
		obj.checkPalSB(noPallin);

		String cities[] = { "bhopal", "agra", "mumbai", "chennai", "pune",
				"delhi" };
		obj.sortCities(cities);

		String s = "askjfslkjfskl";
		obj.checkPal(s);

		String string = "hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		obj.countCharacter(string);

		String java = "this is java and java is object oriented and java is powerful. I love java language";
		obj.countJava(java);
	}

	void countJava(String s) {
		int index = s.indexOf("java");
		while (index >= 0) {
			System.out.println("Index of java Occurence : " + index);
			index = s.indexOf("java", index + 4);
		}

		String a[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase("java")) {
				count++;
			}
		}

		System.out.println("Total occurences of the word java are : " + count);
	}

	void countCharacter(String s) {
		int upper = 0;
		int lower = 0;
		int number = 0;
		int spaces = 0;
		int special = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;
			else if (ch == 32)
				spaces++;
			else
				special++;
		}
		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
		System.out.println("Special characters : " + special);
		System.out.println("Spaces  : " + spaces);
	}

	void checkPal(String str) {
		String r = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			r = r + str.charAt(i);
		}

		if (r.equals(str)) {
			System.out.println("Is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	void sortCities(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

	void checkPalSB(String str1) {
		StringBuffer sb1 = new StringBuffer(str1);
		sb1 = sb1.reverse();
		String str2 = sb1.toString();
		if (str1.equals(str2))
			System.out.println("it is a pallindrome");
		else
			System.out.println("not a pallindrome");
	}

	void removeNos(String str) {
		String newStr = str.replaceAll("[0-9]", "");
		System.out.println(newStr);
	}

	void opTokens(String str) {
		String newStr = str.replaceAll("[0-9]", "");
		StringTokenizer st = new StringTokenizer(newStr, ".,");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	void mailCount(String arr[]) {
		for (String s : arr) {
			if (s.endsWith("@gmail.com"))
				gmailCount++;
			else if (s.endsWith("@yahoo.com"))
				yahooCount++;
			else if (s.endsWith("@rediffmail.com"))
				rediffCount++;
		}
		System.out.println("total gmail id= " + gmailCount);
		System.out.println("total yahoo id= " + yahooCount);
		System.out.println("total rediff id= " + rediffCount);
	}

	void branchCount(String arr[]) {
		for (String s : arr) {
			if (s.startsWith("12"))
				csCount++;
			if (s.startsWith("34"))
				itCount++;
			if (s.startsWith("56"))
				mechCount++;
			if (s.startsWith("78"))
				civilCount++;
		}
		System.out.println("total cs students= " + csCount);
		System.out.println("total it students= " + itCount);
		System.out.println("total mech students= " + mechCount);
		System.out.println("total civil students= " + civilCount);
	}

}
