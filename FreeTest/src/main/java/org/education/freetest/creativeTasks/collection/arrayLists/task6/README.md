## Группировка строк по длине.

*Формулировка:*

Напишите программу, которая создает ArrayList строк, добавляет в него несколько строк разной длины, и затем 
группирует строки по их длине, формируя Map, где ключ - длина строки, а значение - список строк этой длины.

*Пример входной коллекции:*

```
ArrayList<String> содержит: [ "Apple", "Orange", "Banana", "Grapes", "Kiwi", "Pear", "Cherry" ]
```
*Результат выполнения кода:*
```
Группировка строк по длине:
{
   4=[Kiwi, Pear]
   5=[Apple]
   6=[Banana, Grapes, Cherry, Orange]
}
```