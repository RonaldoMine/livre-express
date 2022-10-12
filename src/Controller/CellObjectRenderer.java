/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public final class CellObjectRenderer extends DefaultTableCellRenderer {

    Component component;

    public CellObjectRenderer(JTable table) {
        table.getTableHeader().setPreferredSize(new Dimension(50, 30));
        table.getTableHeader().setBackground(new Color(102, 102, 102));
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setFont(new Font("Roboto", Font.BOLD, 12));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row % 2 == 0) {
            this.setBackground(new Color(238, 238, 238));
        } else {
            this.setBackground(Color.WHITE);
        }
        table.setShowVerticalLines(false);
        table.setRowHeight(30);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        return this;
    }

}
