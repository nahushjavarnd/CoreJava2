package com.app.java8;

import java.awt.event.ActionEvent;
import java.util.EventListener;

@FunctionalInterface
public interface ActionListener extends EventListener 
{
    public void actionPerformed(ActionEvent e);  //Only One abstract method
}