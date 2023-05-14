public class Basket {

    private static int count = 0; //кол-во корзин
    private String items = "";//товары
    private static int totalPrice = 0;//стоимость корзины
    private int limit;//лимит корзины
    public double totalWeight = 0;//вес корзины
    private static int totalCost = 0; //общая стоимость товара во всех корзинах
    private static int totalCount = 0;//общее количество товара во всех корзинах

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
        increaseTotalCount(0);
        increaseTotalCost(0);
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }
    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }
    public Basket(String items, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalWeight = totalWeight;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static void increaseTotalCount(int count){
        Basket.totalCount = Basket.totalCount + count;
    }

    public static void increaseTotalCost(int cost){
        Basket.totalCost = Basket.totalCost +cost;
    }
    public void add(String name, int price) {
        add(name, price, 1, 1.0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        totalWeight = totalWeight + count * weight;


        items = items + "\n" + name + " - " + "Количество: "+
            count + " шт. - " + "Цена: " + price + "Вес единицы товара: " + weight + " - " + "Общий вес: " + totalWeight;

        calculateTotalCount(count);
        calculateTotalPrice(count, price);
    }

public static void calculateTotalCount(int count) {
    Basket.totalCount = Basket.totalCount + count;
}

public static void calculateTotalPrice(int count, int price) {
        Basket.totalPrice = Basket.totalPrice + count * price;

}

public static  int getTotalCount(){
        return totalCount;
}


public int getTotalPrice(){
        return totalPrice;
}


public static int getAveragePriceEveryCount(){//расчет средней стоимости корзины
        return totalPrice / count ;
}

public static int getAveragePriceAllCount(){//расчет средней цены товара во всех корзинах
        return totalPrice / totalCount;
}

//

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }


    public  double getTotalWeight(){
        return totalWeight;
    }


    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
