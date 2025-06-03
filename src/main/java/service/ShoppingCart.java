package service;
import model.Food;

public class ShoppingCart { // пакет service. В нём создай класс для корзины — ShoppingCart.
    private final Food[] products; //поле — массив элементов из объектов типа Food.

    public ShoppingCart(Food[] products) { // Понадобится конструктор с одним параметром — массивом элементов Food, для создания объеков корзины.
        this.products = products;
    }

    // В классе ShoppingCart реализуй методы для работы с корзиной:
    // 1. получить общую сумму товаров в корзине без скидки
    public double totalSum() {
        double total = 0.0;
        for (Food product: products) {
            total = total + product.getPrice() * product.getAmount();
        }
        return total;
    }
    // 2. получить общую сумму товаров в корзине со скидкой
    public double totalSumDiscount() {
        double total = 0.0;
        for (Food product: products) {
            double priceAfterDiscount = (100 - product.getDiscount()) / (double)100;
            total = total + product.getPrice() * product.getAmount() * priceAfterDiscount;
        }
        return total;
    }
    // 3. получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double totalSumVegetarian() {
        double total = 0.0;
        for (Food product: products)  {
            if (product.isVegetarian()) {
                total = total + product.getPrice() * product.getAmount();
            }
        }
        return total;
    }

    /*
    // Дополнительная реализация 3 методов с учетотом иной трактовни требований

    // 1. получить общую сумму товаров в корзине без скидки.
    // Будем сумировать не все товары, без применения скидки, а в расчет будет включать только те товары, у которых нет скидки

    public double totalSum2() {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            Food product = products[i];
            if (product.getDiscount() == 0) {
                total = total + product.getPrice() * product.getAmount();
            }
        }
        return total;
    }

    // 2. получить общую сумму товаров в корзине со скидкой
    // Учитываем только товары со скидкой, в данном случае только красные яблоки попадут в расчет уже с применение скидки 60%
    public double totalSumDiscount2() {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            Food product = products[i];
            if (product.getDiscount() == 60) {
                double priceAfterDiscount = (100 - product.getDiscount()) / (double)100;
                total = total + product.getPrice() * product.getAmount() * priceAfterDiscount;
            }
        }
        return total;
    }

    // 3. получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    // Учитываем только вег. продукты, но только если нет скидки у них, в данном кейсе мы посчитает только зеленые яблоки

    public double totalSumVegetarian2() {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            Food product = products[i];
            if (product.getIsVegetarian() && product.getDiscount() == 0) {
                total = total + product.getPrice() * product.getAmount();
            }
        }
        return total;
    }
    */

}


