package srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Укажите параметры заказа:");
        Order order1 = new ConsoleOrderInput().inputFromConsole();
        new JsonOrderExporter().saveToJson(order1);
    }
}
