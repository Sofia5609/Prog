public interface Series {
	int getNext(); //возврат следующего числа в последовательности
	void reset(); //востановление исходного состояния последовательности (сброс)
	void setStart(int x); //установка начального значения в последовательности
}  