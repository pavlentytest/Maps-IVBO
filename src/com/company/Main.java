package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        Hashtable - хэш таблица
        Hash (хэш)
        Пары: ключ - значение
        null нельзя
        Выполнение любой операции начинается с вычисления хэша от ключа - он фактически индекс
        Неупорядочено (зависит от хэш функции)
        все методы в этом классе - они synchronzied (могут быть проблемы со скоростью)
         */

        String abc = "Test";
        System.out.println(abc.hashCode());

        Hashtable phoneBook = new Hashtable<>();
        phoneBook.put("Ivan","34534534");
        phoneBook.put("Petr","443434");
        phoneBook.put("Misha","43534534");

        Enumeration keys = phoneBook.keys();
        while(keys.hasMoreElements()) {
            String user = (String) keys.nextElement();
            String phone = (String) phoneBook.get(user);
            System.out.println("key: "+user+"; phone: "+phone);
        }

        /*
        HashMap - аналогично Hashtable, можно Null, потоконебезопасно
        * */
        Map<String, String> map = new HashMap<String,String>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");

        System.out.println(map);

        Map<String, String> map2 = new HashMap<String,String>();
        map.put("key4","value4");
        map.put("key5","value5");
        map.put("key6","value6");

        // добавление набора данных в существующий HashMap
        map.putAll(map2);
        System.out.println(map);
        // удаление объекта по ключу
        map.remove("key5");
        // размер набора
        map.size();
        // поиск по ключу
        String exist = (map.containsKey("key2")) ? "found" : "not found";
        // containsValue();
        // перебор значений

        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> s: set) {
            System.out.println("key: "+s.getKey() + "; value: "+s.getValue());
        }
        // очиска
        map.clear();

        // https://habr.com/ru/post/188010/

        /*
        LinkedHashMap - упорядоченная, в которой есть связи между след. и пред.
         */

        Map<String,Double> linked = new LinkedHashMap<String,Double>();
        linked.put("USD",80.2);
        linked.put("EUR",86.2);
        linked.put("CZK", 2.46);

        System.out.println(linked);
        // перебор
        for(String key: linked.keySet()) {
            System.out.println(key + "=>" + linked.get(key));
        }
        // получение  - get()
        // размер - sise()
        // поиск по ключу containsKey();
        // поиск по значение containsValue();

        /*
        TreeMap - сортируется по ключам - natural ordering. Свою сортировка через Comparator
        TreeSet - множество.
         */
        TreeMap<Integer, String> days = new TreeMap<>();
        days.put(3,"Monday");
        days.put(2,"Tuesday");
        days.put(1,"Wednesday");
        days.put(4,"Wednesday");

        // все ключи
        System.out.println(days.keySet());
        // все значения
        System.out.println(days.values());
        // получение
        days.get(3);
        // получение первого элемента
       // days.fi
        System.out.println(days.get(days.firstKey()));
        // последний - lastKey();
        // удаление последнего значения
        days.remove(days.lastKey());
    }
}
