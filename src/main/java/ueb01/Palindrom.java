package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

        if(s.length() == 1)
            return true;

        char[] cs = s.toLowerCase().replaceAll(" ", "").toCharArray();

        CharStack ele = new CharStackImpl();

        //Stack aufteilen
        int i = 0;
        for(; i < cs.length / 2; i++)
            ele.push(cs[i]);

        //Ungerade Länge ignorieren
        if(cs.length % 2 == 1)
            i++;

        for(; i < cs.length; i++) {
            if (ele.pop() != cs[i])
                return false;

        } return true;
	}
}
