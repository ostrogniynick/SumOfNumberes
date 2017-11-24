package org.itstep;
public class AppRunner {
	public static void main(String[] args) {
		int var;
		int n = 12345;//наше число 
		var = parsingTheNumber(n);// вызов метода с числом 
		System.out.println("Ваше число : "+n + " ,сумма цифр этого числа  = "+ var);// вывод на экран 
	}
	public static int parsingTheNumber(int number) {// метод для деления числа на цифры и их сумирование 
	    String num = String.valueOf(number);// создание обьекта 
	    String result[] = new String[num.length()]; //создание  стринг массива  для хранения чар елементов 
	    Integer[] resInt = new Integer[num.length()];// создание инт массива для хранения инт елементов 
	    for (int i = 0; i < num.length(); i++) {// цикл
	    	result[i] = Character.toString(num.charAt(i));// записываем в стринг массив чар элементы 
            resInt[i] = Integer.parseInt(result[i]);// преобразуем и записываем в массив инт елементы 
	    }
	    int sum = 0; // 
	    for (int i = 0; i < num.length(); ++i)// цикл 
	        sum += resInt[i];// сумируем все елементы 
		return sum; // возвращаем  сумму 
	}
}
