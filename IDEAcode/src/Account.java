 public class Account {
    String name;
    int balance;
    String key;

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4){
            this.name = name;
        }else {System.out.println("==========姓名为2到4个字========");}

    }

    public void setBalance(int balance) {
        if (balance>20){
            this.balance = balance;
        }else {System.out.println("=====必须>20===="+"默认为"+25);}
    }

    public void setKey(String key) {
        if (key.length() == 6) {
            this.key = key;
        } else {
            System.out.println("系统默认密码111111");
        }
    }
}
