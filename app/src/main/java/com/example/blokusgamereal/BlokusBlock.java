package com.example.blokusgamereal;

public class BlokusBlock {
    private int color;
    private int blockScore;
    /* No param ctor */
    public BlokusBlock()
    {
        this.color = -1;
        this.blockScore = 5;
    }


    /* Getters of BlokusBlock variables */
    public int getColor()
    {
        return this.color;
    }

    public int getBlockScore()
    {
        return this.blockScore;
    }

    /* Setters of BlokusBlock variables */
    public void setColor(int toSet)
    {
        this.color = toSet;
    }

    public void setBlockScore(int toSet)
    {
        this.blockScore = toSet;
    }
}
