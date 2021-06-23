package OrderingSystem;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Indent {
    //	订单类(订单编号，排队序号，订单创建时间，订单状态，订单总金额，折扣信息，购买数，实付款，客户id)
    private String indentNumber;
    private int QueueNumber;
    private Date indentSetTime;
    private boolean indentState;
    private double allPrice;
    private double DiscountInformation;
    private int buyNumber;
    private Double pay;
    private String customerId;
    private List<Dish> dishs;

//    public Indent(List<Dish> dishs) {
//        this.dishs = dishs;
//    }

    public List<Dish> getDishs() {
        return dishs;
    }
//生成订单的方法，传入dish

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        long temp;
//        temp = Double.doubleToLongBits(allPrice);
//        result = prime * result + (int) (temp ^ (temp >>> 32));
//        result = prime * result + buyNumber;
//        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
//        result = prime * result + ((greensId == null) ? 0 : greensId.hashCode());
//        result = prime * result + ((indentNumber == null) ? 0 : indentNumber.hashCode());
//        result = prime * result + ((indentSetTime == null) ? 0 : indentSetTime.hashCode());
//        result = prime * result + indentState;
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Indent other = (Indent) obj;
//        if (Double.doubleToLongBits(allPrice) != Double.doubleToLongBits(other.allPrice))
//            return false;
//        if (buyNumber != other.buyNumber)
//            return false;
//        if (customerId == null) {
//            if (other.customerId != null)
//                return false;
//        } else if (!customerId.equals(other.customerId))
//            return false;
//        if (greensId == null) {
//            if (other.greensId != null)
//                return false;
//        } else if (!greensId.equals(other.greensId))
//            return false;
//        if (indentNumber == null) {
//            if (other.indentNumber != null)
//                return false;
//        } else if (!indentNumber.equals(other.indentNumber))
//            return false;
//        if (indentSetTime == null) {
//            if (other.indentSetTime != null)
//                return false;
//        } else if (!indentSetTime.equals(other.indentSetTime))
//            return false;
//        if (indentState != other.indentState)
//            return false;
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Indent [indentNumber=" + indentNumber + ", indentSetTime=" + indentSetTime + ", greensId=" + greensId
//                + ", buyNumber=" + buyNumber + ", customerId=" + customerId + ", allPrice=" + allPrice
//                + ", indentState=" + indentState + "]";
//    }
//
//    public Indent(String indentNumber, Date indentSetTime, String greensId, int buyNumber, String customerId,
//                  double allPrice, int indentState) {
//        super();
//        this.indentNumber = indentNumber;
//        this.indentSetTime = indentSetTime;
//        this.greensId = greensId;
//        this.buyNumber = buyNumber;
//        this.customerId = customerId;
//        this.allPrice = allPrice;
//        this.indentState = indentState;
//    }
//
//    public Indent() {
//        super();
//    }

}


