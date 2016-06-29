package org.josejuansanchez.nanoplayboard.model;

import java.io.Serializable;

/**
 * Created by josejuansanchez on 24/6/16.
 */
public class NanoPlayBoardMessage implements Serializable {
    private int potentiometer;
    private int ldr;
    private String error;

    public int getPotentiometer() {
        return potentiometer;
    }

    public void setPotentiometer(int potentiometer) {
        this.potentiometer = potentiometer;
    }

    public int getLdr() {
        return ldr;
    }

    public void setLdr(int ldr) {
        this.ldr = ldr;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}