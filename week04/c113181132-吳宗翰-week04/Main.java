// 父類別
class MarineLife {
    protected String name;
    protected String habitat;

    public MarineLife(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String info() {
        return name + ", 棲息地：" + habitat;
    }

    public String move() {
        return name + " 在水中移動";
    }
}

// TODO 1: Fish 繼承 MarineLife
class Fish extends MarineLife {
    private String scaleColor;

    // 建構子：接收 name, habitat, scaleColor，用 super 呼叫父類別建構子
    public Fish(String name, String habitat, String scaleColor) {
        super(name, habitat);
        this.scaleColor = scaleColor;
    }

    // 覆寫 move()
    @Override
    public String move() {
        return name + " 擺動魚鰭游泳";
    }

    // 新增方法 fishInfo()
    public String fishInfo() {
        return info() + " 鱗片：" + scaleColor;
    }
}

// TODO 2: Whale 繼承 MarineLife
class Whale extends MarineLife {
    private double length;

    // 建構子：接收 name, habitat, length，用 super 呼叫父類別建構子
    public Whale(String name, String habitat, double length) {
        super(name, habitat);
        this.length = length;
    }

    // 覆寫 move()
    @Override
    public String move() {
        return name + " 擺動尾鰭前進";
    }

    // 新增方法 whaleInfo()
    public String whaleInfo() {
        return info() + " 體長：" + length + " 公尺";
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO 3: 建立 Fish 和 Whale 各一個
        Fish fish = new Fish("小丑魚", "珊瑚礁", "橘白相間");
        Whale whale = new Whale("藍鯨", "太平洋", 30.0);

        // 印出 fishInfo() / whaleInfo() 和 move()
        System.out.println(fish.fishInfo());
        System.out.println(fish.move());
        
        System.out.println(whale.whaleInfo());
        System.out.println(whale.move());
    }
}