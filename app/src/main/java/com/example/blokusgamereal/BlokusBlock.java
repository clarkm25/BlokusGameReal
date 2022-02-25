package com.example.blokusgamereal;

/**
 * Class for each of the Blokus block pieces.
 *
 * @author Max Clark, Skyelar Cann, Gavin Raguindin
 * @version February 24th 2022
 */
public class BlokusBlock {
    private int color;

    /* No param ctor */
    public BlokusBlock()
    {
        this.color = -1;
    }


    /* Setters of BlokusBlock variables */
    public void setColor(int toSet)
    {
        this.color = toSet;
    }
}
