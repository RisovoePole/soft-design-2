package org.example;

public class Account {

    private String ip;
    private Long id;
    private String accountName;

    public Account(String ip, Long id, String name) {
        this.ip = ip;
        this.id = id;
        this.accountName = name;
    }

    public void ChangeIP(String ip) {
        this.ip = ip;
    }

    public static void ChangeIP(Context context, String newIP) {
        context.account.ChangeIP(newIP);
    }

    public void ChangeName(String name) {
        this.accountName = name;
    }

    public static void ChangeName(Context context, String newName) {
        context.account.ChangeName(newName);
    }

    public void Inspect() {
        StringBuilder builder = new StringBuilder("Account");
        builder.append(
            "[%d] {name: %s, ip: %s}".formatted(
                this.id,
                this.accountName,
                this.ip
            )
        );

        System.out.println(builder.toString());
    }

    public static void Inspect(Context context) {
        context.account.Inspect();
    }
}
