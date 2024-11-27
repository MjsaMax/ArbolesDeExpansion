/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.arbolesdeexpansion;
import java.util.*;

/**
 *
 * @author Max--
 */
public interface Graph {
    void addEdge(int src, int dest, int weight);
    List<Edge> getEdges();
    int getVertexCount();
}
