package day10;

public class Bank {

    String bankName; //은행명
    Account[] accounts = new Account[5]; //등록된 계좌들
    int accCount; //등록된 계좌수

    Bank(String bName) {
        bankName = bName;
    }

    //개설된 계좌 -> 등록 기능
    void registryAccount(Account account) {
        accounts[accCount++] = account;
    }

    //등록된 계좌 현황 출력
    void showAllAccounts() {
        System.out.printf("====== [%s은행] 등록계좌 ======\n", bankName);
        for (int i = 0; i < accCount; i++) {
            System.out.printf("# %d. %s님 [%d원]\n",
                    i+1, accounts[i].person.name, accounts[i].balance);
        }
    }
}
