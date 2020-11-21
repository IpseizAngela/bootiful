package com.vvcl.bootiful.service;

import com.vvcl.bootiful.StaticValues;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AdderService {

    private int num = StaticValues.NUM;

    public void baseNum(int num) {
        this.num = num;
    }

    public int currentBase() {
        return num;
    }

    public int add(int adder) {
        return this.num + adder;
    }

    public int accumulate(int adder) {
        return this.num += adder;
    }

}
