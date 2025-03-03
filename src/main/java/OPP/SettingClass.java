/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

/**
 *
 * @author Soknan Poch
 */
public class SettingClass {
    public static Color backgroundColor = Color.red;
    public static Color textColor = Color.black;
    public static int titleTextSize = 18;
    public static int fontStyle = Font.PLAIN;
    
    public static void changeTextColor(Color color, Component... components) {
        for (Component component : components) {
            component.setForeground(color);
        }
    } 
    public static void changeTextSize(int fontSize, Component... components) {
    for (Component component : components) {
        component.setFont(new Font(component.getFont().getName(), Font.PLAIN, fontSize));
    }
}
    public static void changeTextStyle(int fontStyle, Component... components) {
        for (Component component : components) {
            Font currentFont = component.getFont(); // Get current font
            int currentSize = currentFont.getSize(); // Keep the current size
            component.setFont(new Font(currentFont.getName(), fontStyle, currentSize));
        }
    }
}
