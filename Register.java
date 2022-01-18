package library;

import java.util.Scanner;

public class Register {
		public boolean checkName(String username){
			if (username == null) {
				return false;
			}
			
			if (username.length() < 4 ) {
				return false;
			}
			return true;
		}
		
		public boolean checkPwd(String pwd){
			if (pwd == null) {
				return false;
			}
			if ( pwd.length() < 5 || pwd.length() >14) {
				return false;
			}
			return true;
		}
		
		
		public boolean checkPwdAgain(String pwd,String repwd){
			if (pwd == null) {
				return false;
			}
			if (repwd == null) {
				return false;
			}
			if (!pwd.equals(repwd)) {
				return false;
			}
			return true;
		}
		
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Register reg = new Register();
			
			System.out.println("*******************Welcome to the registration system*******************");
			System.out.print("\n");
			
			do {
				System.out.println("Please enter a user name£º");
				String username = scanner.next();
				
				System.out.println("Please enter a user password£º");
				String pwd = scanner.next();
				
				System.out.println("Please enter your password again£º");
				String repwd = scanner.next();
				
				boolean flag1 = reg.checkName(username);
				boolean flag2 = reg.checkPwd(pwd);
				boolean flag3 = reg.checkPwdAgain(pwd, repwd);
				
				if (!flag1) {
					System.out.println("The username cannot contain less than 4 characters");
					continue;
				}if (!flag1) {
						System.out.println("The password must contain at least 5 characters");
						System.out.println("The password contains a maximum of 14 characters");
								

						continue;
				}else if (!flag3) {
					System.out.println("The two passwords are inconsistent£¡");
					continue;
				}
				
				if (flag1 && flag2 && flag3) {
					System.out.println("Registration successful! Please remember the user name and password");
					break;
				}
				
			} while (true);
		}
	}
