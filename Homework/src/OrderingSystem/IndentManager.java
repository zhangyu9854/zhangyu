package OrderingSystem;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class IndentManager  {

    // 新建list来存储订单
    private List<Dish> dish;
//    public static HashMap<Integer, ArrayList> mangerIndent;
//
    public HashMap<Integer, ArrayList> getMangerIndent() {
        return mangerIndent;
    }
    //确定菜品的用量
    //public static ArrayList<Integer> GreenUse ;
    //保存所有订单
    static HashMap<Integer, ArrayList> mangerIndent=new HashMap<>();
    //确定菜品的用量
    public static ArrayList<Integer> GreenUse =new ArrayList<>();


    public void setMangerIndent(HashMap<Integer, ArrayList> mangerIndent) {
        this.mangerIndent = mangerIndent;
    }

    @Override
    public String toString() {
        return "IndentManager{" +
                "dish=" + dish +
                '}';
    }

    public List<Dish> getDish() {
        return dish;
    }

    public void setDish(List<Dish> dish) {
        this.dish = dish;
    }

    //根据排队序号查看订单详情
    public static void viewIndentForQueue(int QueNum, HashMap mangerIndent) {
        Set set = mangerIndent.entrySet();
        for (Object indent : set) {
            Map.Entry everyIndent = (Map.Entry) indent;
            if ((Integer) everyIndent.getKey() != QueNum){
                System.out.println("无效排队码");
            }System.out.println(everyIndent.getValue());
        }
    }

    //

}
