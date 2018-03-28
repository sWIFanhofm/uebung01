package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

        char[] test = s.toCharArray();

        CharStackImpl ele = new CharStackImpl();
        for(int i = 0; i < test.length / 2; i++){
            ele.push(test[i]);
        }

        for(int i = (s.length() + 1) / 2; i < s.length(); i++) {
            if (test[i] == ele.pop()) {
                return true;
            }
        } return false;
	}
}
