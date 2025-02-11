package Package1;

import Package2.AccessLevels;

public class TestAccessOtherPackage extends AccessLevels {   // указываем наследование
    public static void main(String[] args) {
        AccessLevels obj = new AccessLevels();
         System.out.println(obj.publicVar);
        // System.out.println(obj.protectedVar); // нет доступа из другого пакета, но есть доступ из класса наследника
        //System.out.println(obj.defaultVar); // доступ на уровне пакета
        // к privateVar доступа нет
    }

    public void testProtect() {

        System.out.println(protectedVar);
    }
}




// Модификаторы доступа - это область видимости переменных.
// Модификаторы доступа: public, private, protected, default.
// Модификаторы отвечают за то, откуда мы можем обратиться к переменной.
// Public - можем обращаться к переменной откуда угодно.
// Private - ни при каких условиях, ни откуда, как кроме из самого класса доступ к переменной мы не получим.
// Default - поучаем доступ на уровне пакета.
// Protected - закрытый тип переменной, к нему мы имеем доступ внутри пакета либо в классах наследниках.