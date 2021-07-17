**Паттерн "BUILDER"**
***
Используется для возможности гибкого создания объекта класса.
***
**Проблема**

У нас есть класс с кучей полей. Поля эти необязательные (т.е. могут быть null, 0, false - как положено по дефолту).

Надо создать объекты этого класса.
- В одном месте - со всеми заполненными полями
- В другом - без заполнения полей
- В третьем - с некоторыми заполненными полями
- В четвертом - с некоторыми, но другими
- и т.д.

Делать кучу конструкторов на все случаи - громоздко и неудобно. 
***
**Решение**

builder предполагает создание специального класса, с помощью которого будет инстанцироваться объект нашего класса.

Класс-билдер устроен так, что может создавать объект нашего класса с любым кол-вом определенных полей.

Логично сделать этот класс-билдер внутренним.