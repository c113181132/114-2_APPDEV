

    
// 將 MarineLife 獨立出來成為一個類別 (不要加 public)
class MarineLife {
    String name;
    String species;
    String habitat;
    double weight;

    // 建構子
    MarineLife(String name, String species, String habitat, double weight) {
        this.name = name;
        this.species = species;
        this.habitat = habitat;
        this.weight = weight;
    }

    // 簡單建構子 (多載)
    MarineLife(String name, String species) {
        this.name = name;
        this.species = species;
        this.habitat = "未知";
        this.weight = 0;
    }

    // 方法
    String info() {
        return name + "（" + species + "），棲息地：" + habitat + "，體重：" + weight + " kg";
    }

    String move() {
        return name + " 在水中移動";
    }

    String eat(String food) {
        return name + " 正在吃 " + food;
    }
}

// 這是主程式所在的類別 (加上 public，檔名必須是 MarineDemo.java)
public class MarineDemo {
    public static void main(String[] args) {
        MarineLife nemo = new MarineLife("尼莫", "小丑魚", "珊瑚礁", 0.1);
        MarineLife whale = new MarineLife("藍藍", "藍鯨", "太平洋", 150000);
        MarineLife unknown = new MarineLife("神秘生物", "未知種");

        System.out.println(nemo.info());
        System.out.println(nemo.move());
        System.out.println(nemo.eat("海葵"));
        System.out.println();
        
        System.out.println(whale.info());
        System.out.println(whale.move());
        System.out.println(whale.eat("磷蝦"));
        System.out.println();
        
        System.out.println(unknown.info());
    }
}



