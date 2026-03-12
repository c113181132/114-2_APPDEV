public class Q2_Fish {
    // 1. 定義屬性（物件的狀態）
    String name;
    double weight;

    // 2. 定義方法（物件的行為）
    public void displayInfo() {
        System.out.println("這隻魚的名字是：" + name + "，重量是：" + weight + "公斤。");
    }

    public static void main(String[] args) {
        // 3. 產生一個 Q2_Fish 的物件（實例化），並命名為 myFish
        Q2_Fish myFish = new Q2_Fish();
        
        // 4. 設定這條魚的屬性
        myFish.name = "黑鮪魚";
        myFish.weight = 250.5;
        
        // 5. 呼叫這隻魚的 displayInfo() 方法來印出資訊
        myFish.displayInfo();
    }
}