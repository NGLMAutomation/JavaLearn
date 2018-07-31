public class PhraseGenerator {
    public static void main (String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "метод критического пути", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "кластеризированный", "фирменный", "нестандартный ум", "сетевой", "использованный с выгодой"};
        String[] wordListThre = {"процес", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "период веремени", "образец", "обзор", "пункт следования"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threLength = wordListThre.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThre[rand3];

        System.out.println("Все, что на м нужно - это " + phrase);
    }
}
