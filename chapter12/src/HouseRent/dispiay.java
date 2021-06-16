package HouseRent;

public class dispiay {
    private boolean temp = true;
    private method houseService = new method(2);

    public void listHouses() {
        System.out.println("=============房屋列表============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {//大家想想，这里老韩有什么？雷,坑
            if (houses[i] == null) {//如果为null,就不用再显示了
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=============房屋列表显示完毕============");

    }

    public void displaymessage() {
        while (temp) {
            System.out.println("=====房屋出租系统=====");
            System.out.println("\t1 新增房源");
            System.out.println("\t2 查找房屋");
            System.out.println("\t3 删除房屋");
            System.out.println("\t4 修改房屋信息");
            System.out.println("\t5 房屋列表");
            System.out.println("\t6 退出");
            System.out.println("请输入1-6");

            int key = Utility.readInt();
            switch (key) {
                case 1:
                    addhouse();
                    break;
                case 2:
                    System.out.println("\t2 查找房源");
                    break;
                case 3:
                    delHouse();
                    break;
                case 4:
                    System.out.println("\t4 修改房屋信息");
                    break;
                case 5:
                    listHouses();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("重新输入1-6");
            }
        }
    }

    public void addhouse() {
        System.out.println("输入姓名");
        String name = Utility.readString(10, "");
        System.out.println("电话");
        int phone = Utility.readInt();
        System.out.println("地址");
        String address = Utility.readString(12);
        System.out.println("月租金");
        int rentMoney = Utility.readInt();
        System.out.println("出租状态");
        String state = Utility.readString(5, "未出租");
        System.out.println("添加完成");
        House newhouse = new House(0, name, phone, address, rentMoney, state);
        houseService.add(newhouse);
    }

    public void delHouse() {
        System.out.println("选择删除房屋编号");
        int i = Utility.readInt();
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            new method(3).del(i);
        } else {
            return;
        }
    }
//    public void updateHouse(){
//        System.out.println("修改的房屋编号");
//        int choice1 = Utility.readInt();
//        if (choice1==)
//

//    }
}