package javaOOP.lesson9.homework.level1.l9ex4;

public class Main {
    public static void main(String[] args) {

//        4) Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди за «двойной колой».
//        Как только человек выпьет такой колы, он раздваивается и оба становятся в конец очереди, чтобы выпить еще стаканчик.
//        Напишите программу, которая выведет на экран состояние очереди в зависимости от того, сколько стаканов колы выдал
//        аппарат с чудесным напитком. Например, если было выдано только два стакана, то очередь выглядит как:
//        [Volovitc, Kutrapalli, Penny, Sheldon, Sheldon, Leonard, Leonard]

        LineForDoubleCola line1 = new LineForDoubleCola();
        System.out.println(line1.getQueueForDoubleCola());
        System.out.println();
        System.out.println();
        System.out.println(line1.changeQueueForDoubleCola(6));









    }
}
