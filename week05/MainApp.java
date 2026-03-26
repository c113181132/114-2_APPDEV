// 父類別：所有海洋生物的共同特性
class MarineLife {
    protected String name;
    protected String habitat;

    public MarineLife(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String info() {
        return name + "，棲息地：" + habitat;
    }

    public String move() {
        return name + " 在水中移動";
    }
}

// 子類別：魚
class Fish extends MarineLife {
    private String scaleColor;

    public Fish(String name, String habitat, String scaleColor) {
        super(name, habitat);       // 呼叫父類別建構子
        this.scaleColor = scaleColor;
    }

    @Override // 標註這是覆寫父類別的方法 (好習慣)
    public String move() {          
        return name + " 擺動魚鰭游泳";
    }

    public String fishInfo() {      // 子類別特有方法
        return info() + " 鱗片：" + scaleColor;
    }
}

// 子類別：鯨魚
class Whale extends MarineLife {
    private double length;

    public Whale(String name, String habitat, double length) {
        super(name, habitat);
        this.length = length;
    }

    @Override // 標註這是覆寫父類別的方法
    public String move() {
        return name + " 擺動尾鰭前進";
    }

    public String whaleInfo() {
        return info() + " 體長：" + length + " 公尺";
    }
}

// 這是主程式所在的類別 (檔名必須是 MainApp.java)
public class MainApp {
    public static void main(String[] args) {
        // 建立魚與鯨魚的物件
        Fish nemo = new Fish("尼莫", "珊瑚礁", "橘白色");
        Whale blueWhale = new Whale("藍藍", "太平洋", 25.5);

        // 測試魚的方法
        System.out.println(nemo.fishInfo());
        System.out.println(nemo.move());
        
        System.out.println("-------------------------");
        
        // 測試鯨魚的方法
        System.out.println(blueWhale.whaleInfo());
        System.out.println(blueWhale.move());
    }
}