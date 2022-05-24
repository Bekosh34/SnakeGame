package com.bekoshh.snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

    public class Score {
        Font font;
        private int points;
        private int timesIncremented;

        public Score () {
            points = 0;
            timesIncremented = 1;
            font = new Font("Arial", Font.PLAIN, 25);
        }

        public void draw(Graphics g){
            g.setColor(Color.RED);
            g.setFont(font);
            g.drawString("Score: " + points, 250, 50);
            g.setColor(Color.BLACK);
        }
        public void incrementScore(){
            points += timesIncremented*1;
            timesIncremented++;
        }
        public int getPoints(){
            return points;
        }
    }

