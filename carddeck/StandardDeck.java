package com.example.carddeck;

import java.util.List;

public class StandardDeck extends AbstractDeck {
    public StandardDeck(){
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card Deal() {
        return null;
    }

    @Override
    public void newOrder(Deck deck) {

    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Card turnOver() {
        return null;
    }
}
