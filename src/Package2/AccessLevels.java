package Package2;

public class AccessLevels {

public int publicVar = 1;
protected int protectedVar = 2;
int defaultVar = 3;
private int privateVar = 4;
}


// Модификаторы доступа - это область видимости переменных.
// Модификаторы доступа: public, private, protected, default.
// Модификаторы отвечают за то, откуда мы можем обратиться к переменной.
// Public - можем обращаться к переменной откуда угодно.
// Private - ни при каких условиях, ни откуда, как кроме из самого класса доступ к переменной мы не получим.
// Default - поучаем доступ на уровне пакета.
// Protected - закрытый тип переменной, к нему мы имеем доступ внутри пакета либо в классах наследниках.