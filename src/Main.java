/*Класс Java (name, age, gender, email) түзүңүз
        Класс Android (name, age, gender, email) түзүңүз
        Класс Go (name, age, gender, email) түзүңүз
        Жогорудагы 3 класс бир класстан мурасталсын.
        Класс Company(address, java, android, go, ownerName)
        Мейн класстан эки компания түзүңүз
        Биринчи компанияда 5 жава, 3 андроид, 2 gо программист иштесин
        Экинчи компанияда 2 жава, 1 андроид, 1 go программист иштесин
        Компанияларды консольго чыгарыңыз*/
public class Main {
    public static void main(String[] args) {


        Company company1 = new Company("Bishkek", 5, 3, 2, "Bobi");
        Company company2 = new Company("Osh", 2, 1, 1, "Gobi");
        System.out.println(company1.toString());
        System.out.println(company2.toString());
    }
}