package OrderingSystem;

import java.util.*;

public class Customers {
    private int count; //人数
    private int vipID; //会员号
    private List<Dish> dishs; //点的菜品

    public Customers(int count, int vipID) {
        this.count = count;
        this.vipID = vipID;
        dishs = new ArrayList<>();
    }


    public Customers() {
    }

    public Customers(int count, int vipID, List<Dish> dishs) {
        this.count = count;
        this.vipID = vipID;
        this.dishs = dishs;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getVipID() {
        return vipID;
    }

    public void setVipID(int tableID) {
        this.vipID = vipID;
    }

    public List<Dish> getDishs() {
        return dishs;
    }

    public void setDishs(List<Dish> dishs) {
        this.dishs = dishs;
    }




    //算账
    public double totleSpendMoney() {

        double totle = 0.0;
        for (Dish dish : dishs) {
            totle = totle + dish.getPrice();
        }
        ArrayList<Double> Money = new ArrayList<>();
        if (totle>100){
            for (Dish dish : dishs) {
               Money.add(dish.getPrice());
            }
            Double freeGreen = Collections.min(Money);
            totle=totle-freeGreen;
        }
        return totle;
    }

}
