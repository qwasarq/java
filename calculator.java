/**
  Класс реализует калькулятор
*/
public class calculator {
 /**
 Результат вычисления
 */
private int result;
 /**
  Суммируем аргументы.
 @param params Аргументы суммирования
 */ 
public void add(int ... params) {
       for (Integer param : params) {
                this.result += param;		   
			  }
}

/**
 Получить результат.
 @return результат вычисления.
*/
public int getResult() {
	   return this.result;
}

/** очистить результат вычисления */

public void cleanResult() {
	this.result = 0;
}

}

