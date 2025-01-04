package Package2;

public class TestAccess {

    public static void main(String[] args) {
        AccessLevels obj = new AccessLevels();
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        // к privateVar доступа нет
    }
}



// Модификаторы доступа - это область видимости переменных.
// Модификаторы доступа: public, private, protected, default.
// Модификаторы отвечают за то, откуда мы можем обратиться к переменной.
// Public - можем обращаться к переменной откуда угодно.
// Private - ни при каких условиях, ни откуда, как кроме из самого класса доступ к переменной мы не получим.
// Default - поучаем доступ на уровне пакета.
// Protected - закрытый тип переменной, к нему мы имеем доступ внутри пакета либо в классах наследниках.