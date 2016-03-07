package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Goods[] item = new Goods[3];
		
		for(int i=0; i<3; i++){
			
			String input = sc.nextLine();
			String words[]= input.split(" ");
			
			item[i] = new Goods(words[0],words[1],words[2]);
		}
		
		for(int i=0; i<3; i++){
			item[i].show();
		}
		
	}
}
