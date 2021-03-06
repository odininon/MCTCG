package com.teammetallurgy.mctcg.card;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import net.minecraft.item.ItemStack;

public class Deck
{

    private final Stack<Card> cards;

    public Deck()
    {
        cards = new Stack<Card>();
        cards.push(new Card("testing", 5, 0, null));
    }

    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    public Card drawTopCard()
    {
        return cards.pop();
    }

    public List<Card> drawCards(int amount)
    {
        final List<Card> tempHand = new LinkedList<Card>();

        for (int i = 0; i < amount; i++)
        {
            tempHand.add(drawTopCard());
        }
        return tempHand;
    }

    public Card lookAtTopCard()
    {
        return cards.peek();
    }
}
