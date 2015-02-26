package cn.codetector.RandomNameGen.Generator;

import java.util.Random;

public class RandomStringGenerator {
	/**
	 * 
	 * @param Cap 0:Rnd Cap/Lower
	 * 1: All Cap
	 * 2: All Lower
	 * @return
	 */
	public static String GenerateRandomString(int Cap,int len){
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		for(int z = 0; z<len; z++){
			char c = (char)(r.nextInt(26) + 'a');
			sb.append(c);
		}
		String s = sb.toString();
		switch(Cap){
			case 1:
				s = s.toUpperCase();
				break;
			case 2: 
				s = s.toLowerCase();
				break;
			case 0:
				char[] chars = s.toCharArray();
				StringBuilder sb2 = new StringBuilder();
				for(char i : chars){
					if(r.nextInt(2) == 0){
						sb2.append(Character.toUpperCase(i));
					}else{
						sb2.append(Character.toLowerCase(i));
					}
				}
				return sb2.toString();
		}
		return s;
	}
}
