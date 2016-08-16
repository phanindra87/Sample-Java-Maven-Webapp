/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author phteluku
 */
public class Calculator {
    private int first, second;
    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;

    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }
      public Calculator() {
    }


    public int add(){
        return first+second;
    }

    public int prod(){
        return first*second;
    }
    
}
