/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.proyectofinal;

/**
 *
 * @author Max--
 */
import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Dibujar nodos
        g2d.fillOval(100, 100, 20, 20); // Nodo 1
        g2d.fillOval(200, 200, 20, 20); // Nodo 2

        // Dibujar aristas
        g2d.drawLine(110, 110, 210, 210); // Línea entre Nodo 1 y Nodo 2
    }
}
