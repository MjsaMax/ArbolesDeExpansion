/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uni.aed.proyectofinal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Max--
 */
public class KruskalApp extends javax.swing.JFrame {
private Grafo grafo;
    private int idVertice = 1;
    private boolean modoInsertarVertice = false;
    private boolean modoInsertarArista = false;
    private Vertice verticeSeleccionado1 = null;
    private Vertice verticeSeleccionado2 = null;
    private Map<Integer, Point> posicionesVertices;

    /**
     * Creates new form KruskalApp
     */
    public KruskalApp() {
        
        
       initComponents();
        grafo = new Grafo();
        posicionesVertices = new HashMap<>();
        jPanel1.setVisible(false);
        jPanel3.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ShowTeoria = new javax.swing.JButton();
        Reiniciar2 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        InsertarArista = new javax.swing.JButton();
        BorrarVertice = new javax.swing.JButton();
        BorrarArista = new javax.swing.JButton();
        Kruskal = new javax.swing.JButton();
        Salir2 = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        ShowAplicativo = new javax.swing.JButton();
        Info = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        InsertarVertice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aplicativo"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        ShowTeoria.setText("Teoria");
        ShowTeoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTeoriaActionPerformed(evt);
            }
        });

        Reiniciar2.setText("Reiniciar");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ShowTeoria, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reiniciar2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowTeoria)
                    .addComponent(Salir)
                    .addComponent(Reiniciar2))
                .addGap(39, 39, 39))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú de Opciones"));

        InsertarArista.setText("Insertar Arista");
        InsertarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarAristaActionPerformed(evt);
            }
        });

        BorrarVertice.setText("Borrar Vertice");
        BorrarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarVerticeActionPerformed(evt);
            }
        });

        BorrarArista.setText("Borrar Arista");
        BorrarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarAristaActionPerformed(evt);
            }
        });

        Kruskal.setText("Generar Algoritmo Kruskal");
        Kruskal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KruskalActionPerformed(evt);
            }
        });

        Salir2.setText("Salir");
        Salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir2ActionPerformed(evt);
            }
        });

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        ShowAplicativo.setText("Aplicativo");
        ShowAplicativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAplicativoActionPerformed(evt);
            }
        });

        Info.setText("Texto de Sucesos");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        InsertarVertice.setText("Insertar Vertice");
        InsertarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarVerticeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Kruskal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InsertarArista, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InsertarVertice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BorrarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(BorrarArista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ShowAplicativo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Info))))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BorrarVertice)
                            .addComponent(InsertarVertice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BorrarArista)
                            .addComponent(InsertarArista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Kruskal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir2)
                    .addComponent(Reiniciar)
                    .addComponent(ShowAplicativo))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarVerticeActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Ingrese el ID del vértice a borrar:");
        try {
            int id = Integer.parseInt(input);
            if (grafo.borrarVertice(id)) {
                actualizarGrafico();
                Info.setText("Vértice " + id + " borrado con éxito.");
            } else {
                Info.setText("No se pudo borrar el vértice " + id + ".");
            }
        } catch (NumberFormatException e) {
            Info.setText("Por favor, ingrese un número válido.");
        }
    }//GEN-LAST:event_BorrarVerticeActionPerformed

    private void BorrarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarAristaActionPerformed
        // TODO add your handling code here:
         String input = JOptionPane.showInputDialog(this, "Ingrese los IDs de los vértices de la arista a borrar (separados por coma):");
        try {
            String[] ids = input.split(",");
            int id1 = Integer.parseInt(ids[0].trim());
            int id2 = Integer.parseInt(ids[1].trim());
            if (grafo.borrarArista(id1, id2)) {
                actualizarGrafico();
                Info.setText("Arista entre " + id1 + " y " + id2 + " borrada con éxito.");
            } else {
                Info.setText("No se pudo borrar la arista entre " + id1 + " y " + id2 + ".");
            }
        } catch (Exception e) {
            Info.setText("Entrada inválida. Use el formato: id1, id2");
        }
    }//GEN-LAST:event_BorrarAristaActionPerformed

    private void Salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Salir2ActionPerformed

    private void ShowAplicativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAplicativoActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(false); // Oculta jPanel3
        jPanel1.setVisible(true);  // Muestra jPanel1
        
    }//GEN-LAST:event_ShowAplicativoActionPerformed

    private void ShowTeoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTeoriaActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false); // Oculta jPanel1
        jPanel3.setVisible(true);  // Muestra jPanel3
    }//GEN-LAST:event_ShowTeoriaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        if (modoInsertarVertice) {
            agregarVerticeGraficamente(evt.getX(), evt.getY());
            modoInsertarVertice = false;
        } else if (modoInsertarArista) {
            Vertice v = obtenerVerticeCercano(evt.getX(), evt.getY());
            if (v != null) {
                if (verticeSeleccionado1 == null) {
                    verticeSeleccionado1 = v;
                    Info.setText("Seleccione el segundo vértice para la arista.");
                } else {
                    verticeSeleccionado2 = v;
                    String pesoStr = JOptionPane.showInputDialog(this, "Ingrese el peso de la arista:");
                    try {
                        int peso = Integer.parseInt(pesoStr);
                        grafo.agregarArista(verticeSeleccionado1.getId(), verticeSeleccionado2.getId(), peso);
                        actualizarGrafico();
                        Info.setText("Arista agregada con éxito.");
                    } catch (NumberFormatException e) {
                        Info.setText("Por favor, ingrese un número válido para el peso.");
                    }
                    verticeSeleccionado1 = null;
                    verticeSeleccionado2 = null;
                    modoInsertarArista = false;
                }
            }
        }
        
    }//GEN-LAST:event_jPanel4MouseClicked

    private void InsertarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarAristaActionPerformed
        // TODO add your handling code here:
        modoInsertarArista = true; // Define un modo para insertar aristas
        Info.setText("Seleccione el primer vértice para la arista.");
    }//GEN-LAST:event_InsertarAristaActionPerformed

    private void InsertarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarVerticeActionPerformed
        // TODO add your handling code here:
        modoInsertarVertice = true;
        Info.setText("Haga clic en el panel para insertar un vértice.");
    }//GEN-LAST:event_InsertarVerticeActionPerformed

    private void KruskalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KruskalActionPerformed
        // TODO add your handling code here:
        List<Arista> arbolExpansionMinima = grafo.kruskal();
        if (arbolExpansionMinima.isEmpty()) {
            Info.setText("No se pudo generar el árbol de expansión mínima.");
        } else {
            actualizarGrafico(arbolExpansionMinima);
            Info.setText("Árbol de expansión mínima generado con éxito.");
        }
    }//GEN-LAST:event_KruskalActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        // TODO add your handling code here:
        grafo = new Grafo();
        posicionesVertices.clear();
        idVertice = 1;
        actualizarGrafico();
        Info.setText("Grafo reiniciado.");
    }//GEN-LAST:event_ReiniciarActionPerformed
private void agregarVerticeGraficamente(int x, int y) {
    Graphics g = jPanel4.getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(x - 10, y - 10, 20, 20);
        g.setColor(Color.WHITE);
        String numeroVertice = String.valueOf(idVertice);
        int textoX = x - g.getFontMetrics().stringWidth(numeroVertice) / 2;
        int textoY = y + g.getFontMetrics().getAscent() / 2 - 2;
        g.drawString(numeroVertice, textoX, textoY);
        
        grafo.agregarVertice(idVertice);
        posicionesVertices.put(idVertice, new Point(x, y));
        idVertice++;
        Info.setText("Vértice " + (idVertice - 1) + " agregado.");
}
private void actualizarGrafico() {
        actualizarGrafico(null);
    }
private void actualizarGrafico(List<Arista> destacadas) {
        Graphics g = jPanel4.getGraphics();
        g.clearRect(0, 0, jPanel4.getWidth(), jPanel4.getHeight());

        for (Arista a : grafo.getAristas()) {
            Point p1 = posicionesVertices.get(a.getOrigen());
            Point p2 = posicionesVertices.get(a.getDestino());
            if (p1 != null && p2 != null) {
                if (destacadas != null && destacadas.contains(a)) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
                // Dibujar el peso de la arista
                int midX = (p1.x + p2.x) / 2;
                int midY = (p1.y + p2.y) / 2;
                g.drawString(String.valueOf(a.getPeso()), midX, midY);
            }
        }

        for (Map.Entry<Integer, Point> entry : posicionesVertices.entrySet()) {
            Point p = entry.getValue();
            g.setColor(Color.BLACK);
            g.fillOval(p.x - 10, p.y - 10, 20, 20);
            g.setColor(Color.WHITE);
            String numeroVertice = String.valueOf(entry.getKey());
            int textoX = p.x - g.getFontMetrics().stringWidth(numeroVertice) / 2;
            int textoY = p.y + g.getFontMetrics().getAscent() / 2 - 2;
            g.drawString(numeroVertice, textoX, textoY);
        }
    }
private Vertice obtenerVerticeCercano(int x, int y) {
        for (Map.Entry<Integer, Point> entry : posicionesVertices.entrySet()) {
            Point p = entry.getValue();
            if (Math.abs(p.x - x) <= 10 && Math.abs(p.y - y) <= 10) {
                return grafo.getVertice(entry.getKey());
            }
        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KruskalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new KruskalApp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarArista;
    private javax.swing.JButton BorrarVertice;
    private javax.swing.JTextField Info;
    private javax.swing.JButton InsertarArista;
    private javax.swing.JButton InsertarVertice;
    private javax.swing.JButton Kruskal;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JButton Reiniciar2;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Salir2;
    private javax.swing.JButton ShowAplicativo;
    private javax.swing.JButton ShowTeoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}