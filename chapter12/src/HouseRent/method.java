package HouseRent;

public class method {
    private int houseNum = 0;
    private int idCounter = 1;
    private House[] houses;//声明一个数组对象

    public method(int size) {
        houses = new House[size];
    }
    public  House[] list() {
        return houses;
    }
    //修改
//    public void update(int a) {
//        for (int j = 0; j < houses.length; j++) {
//            if (a == houses[j].getID()) {
//                houses[j];
//            }
//        }
//
//    }

//添加

        public void add (House newhouse){
            if (houseNum == houses.length) {
                System.out.println("失败，已满");
            } else {
                System.out.println("成功");

            houses[houseNum++] = newhouse;
            houses[houseNum].setID(idCounter++);}
        }
//删除
        public void del(int i){
            for (int j = 0; j < houses.length; j++) {
                if (i == houses[j].getID()) {
                    houses[i] = null;
                    do {
                        houses[i] = houses[i + 1];
                    } while (houses[houseNum - 1] == null);
                } else {
                    System.out.println("房屋不存在");
                }

            }


        }


        class FindHouse {

            public void findhouse() {
                System.out.println("==请选择1-6");
                int ID = Utility.readInt();
                //找不到房屋在哪？


            }
        }
    }

