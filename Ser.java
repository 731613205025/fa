/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ser;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Ser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public static final int alp = 26;
	private static Scanner s;

	public int panChe(String str) {
		if (str.length() < alp) {
			return -1;
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if ((str.indexOf(c) < 0) && (str.indexOf((char) (c + 32)) < 0)) {
				return -1;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("\"Pangram Check\" "+ "\nEnter the String");
		String s1 = s.nextLine();
		PanCheck obj = new PanCheck();
		int rs; 
		rs= obj.panChe(s1);
		if (rs == -1)
			System.out.print("Given String : "+ "\"Not a Pangram\"");
		else
			System.out.print("Given String : " +"\"Pangram\"");
	}

    private static class PanCheck {

        public PanCheck() {
        }

        private int panChe(String s1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
    

