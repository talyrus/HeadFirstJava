public class PhraseOMatic {
	public static void main(String[] args){
		
		String[] wordListOne = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный",
		 "кластеризированный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", 
		 "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"}; 

		 String[] wordListTwo = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход",
		 "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

		String[] wordListThree = {"круглосуточный", "трех-звенный", "300-фунтовый", "взаимный", "обоюдный выигрыш", 
		"фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};		 

		 int oneLength = wordListOne.length;
		 int twoLength = wordListTwo.length;
		 int threeLength = wordListThree.length;

		 for (int i = 1; i <= 10 ; i++ ) {
			int rand1 = (int) (Math.random() * oneLength);
		 	int rand2 = (int) (Math.random() * twoLength);
		 	int rand3 = (int) (Math.random() * threeLength);

		 	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		 	System.out.println(i + ". " + phrase);		 	
		 }

		 
	}
}