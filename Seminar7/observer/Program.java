package observer;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  ***. Добавить возможность отписаться от рассылки новых вакансий.
     * @param args
     */
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Observer student1 = new Student("Студент #1", "programmer");
        Observer master1 = new Master("Мастер #1", "programmer");
        Observer master2 = new Master("Мастер #2", "tester");
        Observer junior1 = new Junior("Junior #1", "project_manager");
        Observer middle1 = new Middle("Middle #1", "architect");
        Observer senior1 = new Senior("Senior #1", "team_leader");

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(junior1);
        publisher.registerObserver(middle1);
        publisher.registerObserver(senior1);


        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }

}
