package OrderingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DishDemo extends IndentManager {
    private static HashMap<Integer, Dish> Menu;

    static {
        Menu = new HashMap<>();
        Dish dish1 = new Dish(1, "水饺", 12);
        Dish dish2 = new Dish(2, "猪肉", 16);
        Dish dish3 = new Dish(3, "汤饺（素）", 5);
        Dish dish4 = new Dish(4, "汤饺（肉）", 7);
        Dish dish5 = new Dish(5, "米饭", 2);
        Dish dish6 = new Dish(6, "面条", 4);
        Dish dish7 = new Dish(7, "饹豆子", 4);
        Dish dish8 = new Dish(8, "鸡蛋炒面", 6);
        Dish dish9 = new Dish(9, "火腿炒面", 6);
        Dish dish10 = new Dish(10, "肉炒面", 7);
        Dish dish11 = new Dish(11, "鸡蛋炒饭", 6);
        Dish dish12 = new Dish(12, "扬州炒饭", 7);
        Dish dish13 = new Dish(13, "担担面面", 5);
        Dish dish14 = new Dish(14, "鲤鱼", 30);
        Dish dish15 = new Dish(15, "刀鱼", 16);
        Dish dish16 = new Dish(16, "小黄花", 30);
        Dish dish17 = new Dish(17, "青鱼", 30);
        Menu.put(1, dish1);
        Menu.put(2, dish2);
        Menu.put(3, dish3);
        Menu.put(4, dish4);
        Menu.put(5, dish5);
        Menu.put(6, dish6);
        Menu.put(7, dish7);
        Menu.put(8, dish8);
        Menu.put(9, dish9);
        Menu.put(10, dish10);
        Menu.put(11, dish11);
        Menu.put(12, dish12);
        Menu.put(13, dish13);
        Menu.put(14, dish14);
        Menu.put(15, dish15);
        Menu.put(16, dish16);
        Menu.put(17, dish17);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customers customers = new Customers(3, 1);
        while (true) {
            showMenu(); //显示主菜单
            int choose = sc.nextInt();
            switch (choose) {
                case 1: //点菜
                    showDishMenu(); //显示菜单
                    while (true) {
                        int c = sc.nextInt();

                        GreenUse.add(c);
                        //返回上一级菜单
                        if (c == 0) {
                            break;
                        }
                        //获取菜品
                        Dish dish = Menu.get(c);//Dish里的对象
                        //记录菜品用量
                        if (dish.GreenNumberJudge() < 0) {
                            break;
                        }
                        ;
                        //向顾客订单中添加菜品
                        //new IndentManager().getDish().add(dish);
                        customers.getDishs().add(dish);

//                        System.out.println("菜品详情   价格      订单生成时间        订单总金额");
//                        System.out.println(dish.getDishName() + "\t\t" + dish.getPrice() + "\t" + startTime + "\t\t" + totalAmount);
                    }
                    break;
                case 2: //查看已点

                    showCustomersDishes(customers);
                    if (customers.totleSpendMoney() > 100) {
                        System.out.println("可免费赠送一份10元以下菜品");
                    }
                    while (true) {
                        int dishid = sc.nextInt();
                        //返回上一级菜单
                        if (dishid == 0) {
                            break;
                        }
                        //获取菜品
                        Dish dish = Menu.get(dishid);
                        //向顾客菜品中删除菜品
                        customers.getDishs().remove(dish);
                        System.out.println("已删除-" + dish.getDishName());
                    }
                    break;
                case 3: //结账
                    Double discount = 1.;
                    if (customers.totleSpendMoney() > 100) {

                    }
                    System.out.println("---请输入会员号---");
                    int vipNumber = sc.nextInt();
                    HashMap<Integer, Double> vipMessage = new HashMap<>();
                    vipMessage.put(10010, 0.7);
                    vipMessage.put(10086, 0.8);
                    vipMessage.put(20010, 0.9);
                    if (vipMessage.get(vipNumber) != null) {
                        discount = vipMessage.get(vipNumber);
                    }
                    double total = customers.totleSpendMoney() * discount;
                    System.out.println("顾客总共消费" + total + "元");
                    System.out.println("欢迎下次光临！");
                    break;
                case 4: //会员充值
                    return;
                case 5: //管理员设置
                    while (true) {
                        //showMenu(); //验证密码
                        showMangerMenu(); //显示菜单
                        int chooseForManger = sc.nextInt();
                        switch (chooseForManger) {
                            case 1:
                                System.out.println("选择特价菜品编号");
                                int modifyID = sc.nextInt();
                                System.out.println(Menu.get(modifyID).getDishName() + "菜品今日几折？");
                                double discountSet = sc.nextDouble();
                                Double newPrice = Menu.get(modifyID).getPrice() * discountSet;
                                Menu.get(modifyID).setPrice(newPrice);
                                System.out.println("价格修改成功，今日" + Menu.get(modifyID).getDishName() + "特价" + newPrice + "元");
                                break;
                            case 2://根据排队序号查看订单详情
                                System.out.println("请输入排队号");
                                int putQueNum = sc.nextInt();
                                viewIndentForQueue(putQueNum, mangerIndent);
                                break;
                            case 3://查看菜品的剩余供应量
                                break;
                        }
                    }

                default: //验证合理性
                    System.out.println("请输入正确的选项");
                    break;
            }
        }
    }

    //打印订单
    public static void showCustomersDishes(Customers customers) {
        System.out.println("+----------------------------+");
        System.out.println("菜单如下：");
        List<Dish> dishs = customers.getDishs();
        for (Dish dish : dishs) {
            System.out.println(dish.getDishID() + "\t\t" + dish.getDishName() + "\t\t" + dish.getPrice());
        }
        //记录起始时间
        LocalDateTime orderingStartTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY.MM.dd HH:mm:ss");
        String startTime = dateTimeFormatter.format(orderingStartTime);

        //记录订单编号和排队序号
        int orderingNumber = 0;
        int QueueNumber = 0;
        orderingNumber++;
        QueueNumber++;

        //判断订单状态
        boolean indentState = false;
        if (QueueNumber == 0) {
            indentState = true;
        }

        //一个订单
        ArrayList arrayList = new ArrayList();
        arrayList.add("订单编号" + orderingNumber);
        arrayList.add("订单生成时间" + startTime);
        arrayList.add("订单状态" + indentState);
        arrayList.add("菜品详情" + dishs);

        //保存所有订单
        //HashMap<Integer, ArrayList> mangerIndent = new HashMap<>();

        mangerIndent.put(QueueNumber, arrayList);

        System.out.println("订单编号\t排队序号\t\t订单生成时间\t\t订单状态");
        System.out.println(orderingNumber + "\t\t" + QueueNumber + "\t\t" + startTime + "\t" + indentState);
        System.out.println("+----------------------------+");
        System.out.println("删除菜品请输入菜品编号,返回上一级菜单请输入 0");
    }

    //显示菜单，供顾客点菜
    private static void showDishMenu() {
        System.out.println("+----------------------------+");
        for (int i = 1; i <= Menu.size(); i++) {
            Dish dish = Menu.get(i);
            System.out.println("订单编号\t菜品名\t菜品价格");
            System.out.println(dish.getDishID() + "\t\t" + dish.getDishName() + "\t\t" + dish.getPrice());
        }
        System.out.println("+----------------------------+");
        System.out.println("请输入您要点的菜品序号,返回上一级菜单请输入 0");
    }

    //显示主菜单
    private static void showMangerMenu() {
        System.out.println("+-----------管理员界面-----------+");
        System.out.println("|选择特价菜品编号     \t\t\t 1\t|");
        System.out.println("|订单查询           \t\t\t 2\t|");
        System.out.println("|查看菜品剩余量     \t\t\t 3\t|");
        System.out.println("|订单总金额       \t\t\t 4\t|");
        System.out.println("|帮助          \t\t\t\t 5\t|");
        System.out.println("+---------------------------+");
    }

    private static void showMenu() {
        System.out.println("+-----------主菜单-----------+");
        System.out.println("|点菜     \t\t\t 1\t|");
        System.out.println("|查看已点     \t\t 2\t|");
        System.out.println("|结账     \t\t\t 3\t|");
        System.out.println("|会员充值  \t\t\t 4\t|");
        System.out.println("|管理员设置\t\t\t 5\t|");
        System.out.println("+---------------------------+");
    }
}
