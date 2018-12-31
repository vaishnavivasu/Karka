package com.example.user.sample;

public class TestMark {
    int[] markArr = new int[6];

    public int[] getMarkArr() {
        return markArr;
    }

    public void setMarkArr(int[] markArr) {
        this.markArr = markArr;
    }

    public int getTotal(){
        int mark=0;
        for(int i=0;i<markArr.length;i++){
            mark += markArr[i]*(i+1);
        }
        return mark;
    }
}
