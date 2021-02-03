package models;

public class Client {
    private String name;
    private Card card;

    public Client() {}

    public Client(String name, Card card) {
        this.name = name;
        this.card = card;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Client [ " +
                "name='" + name + '\'' +
                ", card=" + card +
                " ]";
    }
}
