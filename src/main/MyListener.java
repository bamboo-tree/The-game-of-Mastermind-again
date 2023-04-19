package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyListener implements KeyListener {

    private int code;
    private boolean released;


    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        this.code = e.getKeyCode();
        this.released = false;
        System.out.println("code : " + this.code);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.released = true;
    }

    public int getCode(){
        return this.code;
    }

    public boolean getReleased(){
        return this.released;
    }
}
