package com.grawgo.gra_w_go.board;

public class Board {

    private int size;
    private Stone board[][];

    public Board(int size){
        this.size =size;
        this.board = new Stone[size][size];
    }
    public int getsize(){
        return this.size;
    }
    public void addStone(int x, int y, StoneType stoneType){
        board[y][x] = new Stone(x,y,stoneType);
    }
    public Stone getStone(int x, int y){
        if(x<0 || y<0 || x>=size || y>=size){
            return null;
        }
        return board[y][x];
    }
}
