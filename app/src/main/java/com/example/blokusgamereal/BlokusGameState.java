package com.example.blokusgamereal;

public class BlokusGameState {

    private int[] playerTurn;
    private int[] playerScore;
    private BlokusBlock [][] blockArray;
    private int [][][] legalMoveArray;

    private static final int RED = 1;
    private static final int BLUE = 2;
    private static final int GREEN = 3;
    private static final int YELLOW = 4;

    /*Default Constructor */
    public BlokusGameState() {

        /* Array containing the expected ids for checking player turn */
        this.playerTurn = new int[] {1,2,3,4};

        /* Array for holding player scores */
        this.playerScore = new int[] {0,0,0,0};

        /*
         * Array containing the block objects within each player box
         * and each player's box will be populated with the appropriate blocks
         */
        blockArray = new BlokusBlock[4][21];
        for(int i = 0; i<4; i++)
        {
            for (int j = 0; j<21; j++)
            {
                switch (i)
                {
                    case 0:
                        this.blockArray[i][j] = new BlokusBlock();
                        this.blockArray[i][j].setColor(RED);
                        break;

                    case 1:
                        this.blockArray[i][j] = new BlokusBlock();
                        this.blockArray[i][j].setColor(BLUE);
                        break;

                    case 2:
                        this.blockArray[i][j] = new BlokusBlock();
                        this.blockArray[i][j].setColor(GREEN);
                        break;

                    case 3:
                        this.blockArray[i][j] = new BlokusBlock();
                        this.blockArray[i][j].setColor(YELLOW);
                        break;
                }
            }
        }

        /*
         *  Array representing the board and the legal moves within it
         *  and all values are initially set to 0
         */
        this.legalMoveArray = new int[4][20][20];
        for(int k = 0; k<4; k++)
        {
            for(int i = 0; i<20; i++)
            {
                for (int j = 0; j<20; j++)
                {
                    this.legalMoveArray[k][i][j] = 0;
                }
            }
        }
    }

    /* Deep copy ctor */
    public BlokusGameState(BlokusGameState toCopy) {

        /*
         * Copy process for the player turn array
         * Starts by initializing a new array then copies contents over
         */
        this.playerTurn = new int[4];
        for(int i = 0; i<4; i++)
        {
            this.playerTurn[i] = toCopy.playerTurn[i];
        }

        /*
         * Copy process for the player scores
         * Starts by initializing a new array then copies contents over
         */
        this.playerScore = new int[4];
        for (int i = 0; i<4; i++)
        {
            this.playerScore[i] = toCopy.playerScore[i];
        }

        /*
         * Copy process for the array of blocks
         * Starts by initializing a new array then copies contents over
         */
        this.blockArray = new BlokusBlock[4][21];
        for (int i = 0; i<4; i++)
        {
            for (int j = 0; j<21; j++)
            {
                this.blockArray[i][j] = toCopy.blockArray[i][j];
            }
        }

        /*
         * Copy process for the array of arrays of legal moves
         * Starts by initializing a new array then copies contents over
         */
        for(int k = 0; k<4; k++)
        {
            for(int i = 0; i<20; i++)
            {
                for (int j = 0; j<20; j++)
                {
                    this.legalMoveArray[k][i][j] = toCopy.legalMoveArray[k][i][j];
                }
            }
        }
    }

}
