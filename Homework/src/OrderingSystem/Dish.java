package OrderingSystem;

public class Dish {
 private int dishID; //菜品id
 private String dishName; //菜品名字
 private double price; //菜品价格
private int GreenNumber=10;

 public Dish(int dishID, String dishName, double price) {
 this.dishID = dishID;
 this.dishName = dishName;
 this.price = price;
 }

 public int getDishID() {
 return dishID;
 }

 public void setDishID(int dishID) {
 this.dishID = dishID;
 }

 public String getDishName() {
 return dishName;
 }

 public void setDishName(String dishName) {
 this.dishName = dishName;
 }

 public double getPrice() {
 return price;
 }

 public void setPrice(double price) {
 this.price = price;
 }

 @Override
 public String toString() {
  return
          "订单编号：" + dishID +
          "\t菜品名称：" + dishName + '\'' +
          "\t菜品价格：" + price +
          "\t菜品总量：" + GreenNumber +
          "\t菜品已用：" + number
          ;
 }

 //计数
 int number;
 public int GreenNumberJudge(){
  return GreenNumber-(++number);
 }
 //

}
