public class _Main {

    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", " Л. Толстой");
        Book book2 = new Book("Сказки", " А. Пушкин");
        Book book3 = new Book("Чапаев и Пустота", " В. Пелевин");
        Book book4 = new Book("Повелитель мух", " У. Голдинг\n");
        Book book5 = new Book("Властелин колец", " Дж. Р. Р. Толкин");
        Book book6 = new Book("Гордость и предубеждение", " Д. Остин");
        Book book7 = new Book("Тёмные начала", " Ф. Пулман");
        Book book8 = new Book("Автостопом по галактике", " А. Иванов");
        Book book9 = new Book("Бронепароходы", " А. Пушкин");
        Book book10 = new Book("Убыр", " Ш. Идиатуллин");
        Book[] b = new Book[10];
        b[0] = book1;
        b[1] = book2;
        b[2] = book3;
        b[3] = book4;
        b[4] = book5;
        b[5] = book6;
        b[6] = book7;
        b[7] = book8;
        b[8] = book9;
        b[9] = book10;
        System.out.println(Reader.choiseBook(b));

    }
}
