package com.solvewithajeet;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

public class MyFrame extends JFrame {
    private FlagPanel panel = new FlagPanel();

    public MyFrame() throws HeadlessException {

        setTitle("Happy Independence Day !!");
        setSize(440,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);

    }
}

