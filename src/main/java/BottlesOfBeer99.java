public class BottlesOfBeer99 {

    /*10. Напишите метод, который распечатает песню “99 Bottles of Beer”
    точно в таком виде, в каком песня написана на
    странице http://www.99-bottles-of-beer.net/lyrics.html
    Вызовите этот метод в отдельном тесте (тест не будет ничего
    проверять, просто будет запускать метод и выводить песню на консоль)
     */
    private String bildNewString (String string, int index, char letter) {
        String result = "";
        for (int i =0; i < string.length(); i++) {
            if (i != index && string.charAt(i) != letter) {
                result += string.charAt(i);
            }
        }

        return result;
    }


    public void printBottles99Song () {
        String bottles = " bottles of beer";
        // Второй вариант заменить переменную
        //String bottle = bildNewString(bottles, 7, 's');
        String wall = " on the wall";
        String noMore = "No more";
        String take = "Take one down and pass it around, ";
        String go = "Go to the store and buy some more";
        String commaSpace = ", ";
        String dot = ".";

//        noMore.toLowerCase();
//        bottle.length();

        // Убираем букву s из переменной bottles
//        for (int i = 0; i < bottles.length(); i++) {
//            if (bottles.charAt(i) == 's') {
//                System.out.println(i);
//            }
//        }
//        String newResult="";
//        for (int i = 0; i < bottles.length(); i++) {
//            if (i != 7)
//            newResult = newResult + bottles.charAt(i);
//        }
//        for (int i = 0; i < bottles.length(); i++) {
//            if (bottles.charAt(i) != 's')
//                newResult = newResult + bottles.charAt(i);
//        }
        // Добавляем букву s после буквы 'e'  в переменной bottle
//        String result ="";
//        for (int i = 0; i < bottle.length(); i++) {
//            result = result +bottle.charAt(i);
//            if (i == 6) {
//                result = result + 's';
//          }
//        }




        for (int i = 99; i >= 0; i-- ) {
            if (i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + (i-1) + bildNewString(bottles, 7, 's') + wall + dot);
                System.out.println();
            } else if (i == 1) {
                System.out.println(i + bildNewString(bottles, 7, 's') + wall + commaSpace + i + bildNewString(bottles, 7, 's') + dot);
                System.out.println(take + noMore.toLowerCase() + bottles + wall + dot);
                System.out.println();
            } else if (i == 0) {
                System.out.println(noMore + bottles + wall + commaSpace + noMore.toLowerCase() + bottles + dot);
                System.out.println(go +commaSpace + 99 + bottles +wall + dot);
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + (i - 1) + bottles + wall + dot);
                System.out.println();
            }
        }
    }
}
