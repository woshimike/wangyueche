package com.example.ft2.test;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class SnakeGame extends JPanel implements ActionListener {
    
    private final int WIDTH = 300;
    private final int HEIGHT = 300;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private int DELAY = 140;
    
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    
    private int dots;
    private int apple_x;
    private int apple_y;
    
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = true;
    
    private Timer timer;
    private Graphics g;

    public SnakeGame() {
        //addKeyListener(new TAdapter());
        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        initGame();
    }
    
    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 50 - i * DOT_SIZE;
            y[i] = 50;
        }
        locateApple();

    }
    
    /*public void paintComponent(Graphics g) {
        this.g = g;
        super.paintComponent(g);
        doDrawing(g);
    }*/
    
    public void doDrawing(Graphics g) {
        if (inGame) {
            g.setColor(Color.red);
            g.fillOval(apple_x, apple_y, DOT_SIZE, DOT_SIZE);
            for (int i = 0; i < dots; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], DOT_SIZE, DOT_SIZE);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x[i], y[i], DOT_SIZE, DOT_SIZE);
                }
            }
            Toolkit.getDefaultToolkit().sync();
        } else {
            gameOver(g);
        }
    }
    
    public void gameOver(Graphics g) {
        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = getFontMetrics(small);
        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (WIDTH - metr.stringWidth(msg)) / 2, HEIGHT / 2);
    }
    
    public void checkApple() {
        if ((x[0] == apple_x) && (y[0] == apple_y)) {
            dots++;
            locateApple();
        }
    }
    
    public void move() {
        for (int i = dots; i > 0; i--) {
            x[i] = x[(i - 1)];
            y[i] = y[(i - 1)];
        }
        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }
        if (rightDirection) {
            x[0] += DOT_SIZE;
        }
        if (upDirection) {
            y[0] -= DOT_SIZE;
        }
        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }
    
    public void checkCollision() {
        for (int i = dots; i > 0; i--) {
            if ((i > 4) && (x[0] == x[i]) && (y[i] == y[0])) {
            inGame = false;
        }
    }
    if (y[0] >= HEIGHT) {
        inGame = false;
    }
    if (y[0] < 0) {
        inGame = false;
    }
    if (x[0] >= WIDTH) {
        inGame = false;
    }
    if (x[0] < 0) {
        inGame = false;
    }
    if (!inGame) {

    }
}

public void locateApple() {
    int r = (int) (Math.random() * RAND_POS);
    apple_x = ((r * DOT_SIZE));
    
    r = (int) (Math.random() * RAND_POS);
    apple_y = ((r * DOT_SIZE));
}

/*public void actionPerformed(ActionEvent e) {
    if (inGame) {
        checkApple();
        checkCollision();
        move();
    }
    repaint();
}*/

/*private class TAdapter extends KeyAdapter {

    private KeyEvent e;

    public void keyPressed(KeyEvent e) {
        this.e = e;
        int key = e.getKeyCode();
        if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
            leftDirection = true;
            upDirection = false;
            downDirection = false;
        }
        if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
            rightDirection = true;
            upDirection = false;
            downDirection = false;
        }
        if ((key == KeyEvent.VK_UP) && (!downDirection)) {
            upDirection = true;
            rightDirection = false;
            leftDirection = false;
        }
        if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
            downDirection = true;
            rightDirection = false;
            leftDirection = false;
        }
    }
}*/

public static void main(String[] args) {
    JFrame frame = new JFrame("Snake");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new SnakeGame());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
