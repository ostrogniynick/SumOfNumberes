package org.itstep;
public class AppRunner {
	public static void main(String[] args) {
		int var;
		int n = 12345;//���� ����� 
		var = parsingTheNumber(n);// ����� ������ � ������ 
		System.out.println("���� ����� : "+n + " ,����� ���� ����� �����  = "+ var);// ����� �� ����� 
	}
	public static int parsingTheNumber(int number) {// ����� ��� ������� ����� �� ����� � �� ����������� 
	    String num = String.valueOf(number);// �������� ������� 
	    String result[] = new String[num.length()]; //��������  ������ �������  ��� �������� ��� ��������� 
	    Integer[] resInt = new Integer[num.length()];// �������� ��� ������� ��� �������� ��� ��������� 
	    for (int i = 0; i < num.length(); i++) {// ����
	    	result[i] = Character.toString(num.charAt(i));// ���������� � ������ ������ ��� �������� 
            resInt[i] = Integer.parseInt(result[i]);// ����������� � ���������� � ������ ��� �������� 
	    }
	    int sum = 0; // 
	    for (int i = 0; i < num.length(); ++i)// ���� 
	        sum += resInt[i];// �������� ��� �������� 
		return sum; // ����������  ����� 
	}
}
