public class Q3_Turtle {
    // 已經確定好的兩個屬性
    String species;
    int age;

    // 1. 編寫建構子 (Constructor)
    // 注意：建構子的名稱必須與類別名稱完全相同，且不需要寫回傳型態 (連 void 都不用)
    public Q3_Turtle(String species, int age) {
        // 使用 this. 關鍵字來代表「這個物件本身的屬性」，以便和傳進來的「參數」做區隔
        this.species = species;
        this.age = age;
    }

    // 定義用來印出資訊的方法 (題目要求的 showDetails)
    public void showDetails() {
        System.out.println("品種：" + species + "，年紀：" + age + "歲");
    }

    public static void main(String[] args) {
        // 2. 利用建構子，直接創造一個品種為"綠蠵龜"、年紀為 50 的海龜物件
        // 在這裡直接把資料當作參數傳進去，不需要像第 2 題那樣分開賦值了！
        Q3_Turtle turtle = new Q3_Turtle("綠蠵龜", 50);
        
        // 3. 呼叫方法印出資訊
        turtle.showDetails();
    }
}