package ru.stqa.pft.sandbox;

/**
 * Created by marina.peunkova on 16/04/2016.
 */
public class Square {
    public int w;
    Square(int w){
        this.w=w;
    }
    public int area(){
        return this.w*this.w;
    }
}
