public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Дмитрий Глуховский");
        Author author2 = new Author("Михаил Булгаков");

        Book book1 = new Book("Метро", author1, 2002);
        Book book2 = new Book("Мастер и Маргарита", author2, 2006);

        System.out.println("Название: " + book1.getName() + ", Автор: " + author1.getName() + ", Год издания: " + book1.getPublishYear());
        System.out.println();
        System.out.println("masterAndMargarita.getName() = " + book2.getName());
        System.out.println("masterAndMargarita.getAuthor() = " + author2.getName());
        System.out.println("masterAndMargarita.getPublishYear() = " + book2.getPublishYear());
    }
}