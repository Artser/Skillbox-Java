public class Main {

    public static void main(String[] args) {
        Basket basket1 = new Basket();
        basket1.add("Milk", 100);
        basket1.add("Халва", 200);
        basket1.add("Хлеб", 50);


        Basket basket2 = new Basket();
        basket2.add("Сервелат", 300);
        basket2.add("Сыр", 500);
        basket2.add("Батон", 30);

        System.out.println("Средняя стоимость корзины: " + Basket.getAveragePriceEveryCount());
        System.out.println("Средняя цена товара во всех корзинах:  " + Basket.getAveragePriceAllCount());
        System.out.println("Общее количество всех товаров: " + Basket.getTotalCount());
    }
}
