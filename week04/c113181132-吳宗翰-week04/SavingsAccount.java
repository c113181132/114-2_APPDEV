class BankAccount {
    private String owner;
    private String accountId;
    private double balance;

    public BankAccount(String owner, String accountId) {
        this.owner = owner;
        this.accountId = accountId;
        this.balance = 0;
    }

    public String getOwner() { return owner; }
    public String getAccountId() { return accountId; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void showInfo() {
        System.out.println("帳戶：" + accountId +
            " 戶名：" + owner +
            " 餘額：" + balance);
    }
}

// 實作繼承 BankAccount
public class SavingsAccount extends BankAccount {
    
    // 新增 private double interestRate (年利率)
    private double interestRate;

    // 建構子接收 owner, accountId, interestRate
    public SavingsAccount(String owner, String accountId, double interestRate) {
        // 必須放在第一行：用 super(owner, accountId) 呼叫父類別建構子
        super(owner, accountId);
        this.interestRate = interestRate;
    }

    // addInterest() 方法
    public void addInterest() {
        // 利息 = 取得餘額 * 年利率
        // 注意：balance 是 private，必須透過 getBalance() 取得
        double interest = getBalance() * interestRate;
        
        // 印出提示並呼叫父類別的 deposit 方法將利息存入
        System.out.println("利息 " + interest + " 已存入");
        deposit(interest);
    }

    public static void main(String[] args) {
        // 建立 SavingsAccount，年利率 0.02 (2%)
        SavingsAccount acc = new SavingsAccount("李小華", "S001", 0.02);
        
        // 存入 10000 元
        acc.deposit(10000);
        
        // 根據預期輸出，這裡先印出一次帳戶資訊
        acc.showInfo();
        
        // 呼叫 addInterest() 計算並存入利息
        acc.addInterest();
        
        // 再次印出帳戶資訊，確認餘額是否正確增加
        acc.showInfo();
    }
}