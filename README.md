# Gradle
После создания проекта Gradle добавила модуль Util

Создfkf файл.jar utils-1.3.5.jar

В bild.gradle добавила манифест с указанными условиями
Создала class StringUtils с методом boolean isPositiveNumber(String str), который возвращает положительное число.
Написала unit test для проверки этого метода в папке Test.


Дополнительно:
В модуле utils в bild.gradle создала плагин MyPlugin
Создала еще 2 модуля: core, api
В модуле core дсоздала class Utils с методом boolean isAllPositiveNumbers(String… str), который возвращает true, если в массиве все числа положительные

В модуле api добавила class App с методом main. 
Из модуля api в методе main вызвала Utils.isAllPositiveNumbers("12", "79"), т.к. в bild.gradle указала зависимости.
Написала в модуле core unit test для проверки метода boolean isAllPositiveNumbers(String… str).
