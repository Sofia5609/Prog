class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
		ByThrees ob3 = new ByThrees();
		//Последовательность "через 2"
		for(int i = 0; i < 5; i++)
			System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее значение: " + ob.getPrevious());

		System.out.println("\nСброс последоватшльности к стартовому значению");
		ob.reset();
		for(int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее значение: " + ob.getPrevious());

                System.out.println("\nУстанавливаем новое стартовое значение");
                ob.setStart(100);
		for(int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее значение: " + ob.getPrevious());

		//Последовательность "через 3"
		System.out.println();
		System.out.println("\nНовая последовательность");
		for(int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности: " + ob.getNext());
                //System.out.println("Последнее предыдущее значение: " + ob.getPrevious());

                System.out.println("\nСброс последоватшльности к стартовому значению");
                ob.reset();
                for(int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности: " + ob.getNext());
                //System.out.println("Последнее предыдущее значение: " + ob.getPrevious());

                System.out.println("\nУстанавливаем новое стартовое значение");
                ob.setStart(100);
                for(int i = 0; i < 5; i++)
                        System.out.println("Следующее значение в последовательности: " + ob.getNext());
                //System.out.println("Последнее предыдущее значение: " + ob.getPrevious());
		//Демонстрация использования интерфейсной переменной
		Series obInt;

		for(int i = 0; i < 5; i++) {
			obInt = ob;
                        System.out.println("Следующее значение в последовательности ByTwos: " + ob.getNext());
			obInt = ob3;
			System.out.println("Следующее значение в последовательности ByThrees: " + ob.getNext());
		}

	}

}


