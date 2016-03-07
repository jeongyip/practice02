package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean ans = true;
		String answer;
		
		while(ans){
			System.out.print(">> ");
			
			String sentence = sc.nextLine();

			if(sentence.equals("quit")){
				break;
			}
			
			String[] words = sentence.split(" ");
			
			int a = Integer.parseInt(words[0]);
			String mark = words[1];
			int b = Integer.parseInt(words[2]);
			
			
			switch(mark){
				case "+" : {
					Add temp = new Add();
					temp.setValue(a,b);
					System.out.println(">> "+temp.calculate());
					break;
				}
				case "-" : {
					Sub temp = new Sub();
					temp.setValue(a,b);
					System.out.println(">> "+temp.calculate());
					break;
				}
				case "*" : {
					Mul temp = new Mul();
					temp.setValue(a,b);
					System.out.println(">> "+temp.calculate());
					break;
				}
				case "/" : {
					Div temp = new Div();
					temp.setValue(a,b);
					System.out.println(">> "+temp.calculate());
					break;
				}
			}
			
			
		}
	}

}
