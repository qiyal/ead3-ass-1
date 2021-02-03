package models;

public class Card {
    private String cardNumber;
    private String pinCode;
    private Account account;


    public Card() {}

    public Card(String cardNumber, String pinCode, Account account) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.account = account;
    }

    // Setters
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    // Getters
    public String getCardNumber() {
        return cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Card [ " +
                "cardNumber='" + cardNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", account=" + account +
                " ]";
    }
}
