// TODO 2: Ship 類別
class Ship {
    protected String name; // 使用 protected 讓子類別可以直接使用，或者也可以設為 private

    // 建構子接收 name
    public Ship(String name) {
        this.name = name;
    }

    // final 方法 type()：回傳「船舶」
    // 加上 final 後，任何繼承 Ship 的子類別都不能修改這個方法的行為
    public final String type() {
        return "船舶";
    }

    // 一般方法 sail()：回傳 name + " 正在航行"
    public String sail() {
        return name + " 正在航行";
    }
}

// TODO 3: FishingBoat 繼承 Ship
class FishingBoat extends Ship {

    // 建構子用 super(name) 呼叫父類別建構子
    public FishingBoat(String name) {
        super(name);
    }

    // 覆寫 sail()：回傳 name + " 正在拖網捕魚"
    @Override
    public String sail() {
        return name + " 正在拖網捕魚";
    }

    // 嘗試覆寫 type()，觀察編譯錯誤，然後註解掉
    /*
    @Override
    public String type() {
        return "漁船"; 
        // ❌ 這裡會報錯：Cannot override the final method from Ship
        // 因為父類別的 type() 已經被宣告為 final 了
    }
    */
}

// 主程式所在的類別 (檔名必須是 FinalDemo.java)
public class FinalDemo {

    // TODO 1: 宣告 final 變數 (習慣上常數命名會全大寫，單字間用底線分隔)
    static final int MAX_DEPTH = 11034;  // 馬里亞納海溝最深處

    public static void main(String[] args) {
        System.out.println("馬里亞納海溝最深：" + MAX_DEPTH + " 公尺");

        // MAX_DEPTH = 12000;  
        // ❌ 如果取消註解這行，會報錯：The final field FinalDemo.MAX_DEPTH cannot be assigned

        Ship s = new Ship("遠洋號");
        FishingBoat f = new FishingBoat("海豐號");

        System.out.println(s.type() + "：" + s.sail());
        System.out.println(f.type() + "：" + f.sail());

        // 多型
        Ship s2 = new FishingBoat("福星號");
        System.out.println(s2.type() + "：" + s2.sail());
    }
}