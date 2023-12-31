/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Niegel
 */
import java.util.List;
import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap; // import the HashMap class
import java.util.Map;
import java.text.DecimalFormat;

public class tileCalculatorGUI extends javax.swing.JFrame {

    /**
     * Creates new form tileCalculatorGUI
     */
    public tileCalculatorGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBoxShapes = new javax.swing.JComboBox<>();
        txtLabelDimension1 = new javax.swing.JLabel();
        txtFieldDimension1 = new javax.swing.JTextField();
        txtLabelDimension2 = new javax.swing.JLabel();
        txtFieldDimension2 = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        txtLabelDimension3 = new javax.swing.JLabel();
        txtLabelDimension4 = new javax.swing.JLabel();
        txtFieldCostPerUnit = new javax.swing.JTextField();
        btnAddTile = new javax.swing.JButton();
        btnCalculateCost = new javax.swing.JButton();
        txtFieldErrorMsg = new javax.swing.JTextField();
        txtFieldFloorSize = new javax.swing.JTextField();
        txtLabelDimension5 = new javax.swing.JLabel();
        totalCostLabel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDisplayReceipt = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Tile Calculator");

        comboBoxShapes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangle", "Parallelogram", "Triangle", "Circle", "Donut" }));
        comboBoxShapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxShapesActionPerformed(evt);
            }
        });

        txtLabelDimension1.setText("Base");

        txtFieldDimension1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldDimension1ActionPerformed(evt);
            }
        });

        txtLabelDimension2.setText("Height");

        quantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextFieldActionPerformed(evt);
            }
        });

        txtLabelDimension3.setText("Num of tiles");

        txtLabelDimension4.setText("Cost/Unit");

        btnAddTile.setText("Add Tiles");
        btnAddTile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTileActionPerformed(evt);
            }
        });

        btnCalculateCost.setText("Calculate Cost");
        btnCalculateCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateCostActionPerformed(evt);
            }
        });

        txtFieldErrorMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldErrorMsgActionPerformed(evt);
            }
        });

        txtFieldFloorSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldFloorSizeActionPerformed(evt);
            }
        });

        txtLabelDimension5.setText("Enter square meters of floor");

        txtAreaDisplayReceipt.setColumns(20);
        txtAreaDisplayReceipt.setRows(5);
        jScrollPane1.setViewportView(txtAreaDisplayReceipt);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxShapes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLabelDimension5)
                    .addComponent(btnCalculateCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFieldFloorSize, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddTile)
                            .addComponent(txtFieldErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLabelDimension1)
                            .addComponent(txtFieldDimension1)
                            .addComponent(txtLabelDimension3)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLabelDimension4)
                            .addComponent(txtLabelDimension2)
                            .addComponent(txtFieldDimension2)
                            .addComponent(txtFieldCostPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(276, 276, 276))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxShapes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLabelDimension1)
                            .addComponent(txtLabelDimension2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldDimension1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldDimension2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLabelDimension3)
                            .addComponent(txtLabelDimension4))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldCostPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldFloorSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddTile)
                            .addComponent(txtLabelDimension5))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldErrorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculateCost))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnExit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void hideDimensions() {
        txtLabelDimension2.setVisible(false);
        txtFieldDimension2.setVisible(false);
}
    
    public void showDimensions() {
        txtLabelDimension2.setVisible(true);
        txtFieldDimension2.setVisible(true);
}
    private void comboBoxShapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxShapesActionPerformed
        String selectedShape = String.valueOf(comboBoxShapes.getSelectedItem());

        switch (selectedShape) {
            case "Rectangle":
                showDimensions();
                txtLabelDimension1.setText("Base");
                txtLabelDimension2.setText("Height");
                break;
            case "Parallelogram":
                showDimensions();
                txtLabelDimension1.setText("Base");
                txtLabelDimension2.setText("Height");
                break;
            case "Triangle":
                showDimensions();
                txtLabelDimension1.setText("Base");
                txtLabelDimension2.setText("Height");
                break;
            case "Circle":
                txtLabelDimension1.setText("Radius");
                hideDimensions();
                break;
            case "Donut":
                showDimensions();
                txtLabelDimension1.setText("Inner Diameter");
                txtLabelDimension2.setText("Outer Diameter");
                break;
            default:
                
                break;
        }

        
        
        
        
        
        
    }//GEN-LAST:event_comboBoxShapesActionPerformed

    private void txtFieldDimension1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDimension1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDimension1ActionPerformed

    private void quantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldActionPerformed
        private List<Shape> shapesList = new ArrayList<>();
        private double costPerUnit = 0.0; // Variable to store cost per unit
        
        
    private Shape createShape(String selectedShape) {
        switch (selectedShape) {
            case "Rectangle":
                return new Rectangle();
            case "Parallelogram":
                return new Parallelogram();
            case "Triangle":
                return new Triangle();
            case "Circle":
                return new Circle();
            case "Donut":
                return new Donut();
            // Add cases for other shapes
            default:
                return null;
        }
    }
    private void btnAddTileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTileActionPerformed
        // TODO add your handling code here:
            String selectedShape = comboBoxShapes.getSelectedItem().toString();
            try {
                int quantity = Integer.parseInt(quantityTextField.getText());
            } catch (NumberFormatException e) {
                txtFieldErrorMsg.setText("Enter valid quantity");
                return; // Exit the method if there's an error
            }

            try {
                double unitPrice = Double.parseDouble(txtFieldCostPerUnit.getText());
            } catch (NumberFormatException e) {
                txtFieldErrorMsg.setText("Enter valid unit price");
                return; // Exit the method if there's an error
            }

            try {
                double floorSize = Double.parseDouble(txtFieldFloorSize.getText());
            } catch (NumberFormatException e) {
                txtFieldErrorMsg.setText("Enter valid floor size");
                return; // Exit the method if there's an error
            }

            try {
                double dim1 = Double.parseDouble(txtFieldDimension1.getText());
            } catch (NumberFormatException e) {
                txtFieldErrorMsg.setText("Enter valid dimension 1");
                return; // Exit the method if there's an error
            }

            try {
                double dim2 = 0.0;
                if (txtFieldDimension2.isVisible()) {
                    dim2 = Double.parseDouble(txtFieldDimension2.getText());
                }
            } catch (NumberFormatException e) {
                txtFieldErrorMsg.setText("Enter valid dimension 2");
                return; // Exit the method if there's an error
            }
            int quantity = Integer.parseInt(quantityTextField.getText());
            double unitPrice = Double.parseDouble(txtFieldCostPerUnit.getText()); // Assuming you have a text field for unit price
            double floorSize = Double.parseDouble(txtFieldFloorSize.getText()); // Assuming you have a text field for floor size

            // Check if the dimensions are visible and gather them
            double dim1 = Double.parseDouble(txtFieldDimension1.getText());
            double dim2 = 0.0;
            if (txtFieldDimension2.isVisible()) {
                dim2 = Double.parseDouble(txtFieldDimension2.getText());
            }
            
          
            
            // Calculate the total area covered by all previously added tiles
            double totalTilesArea = 0.0;
            for (Shape existingShape : shapesList) {
                totalTilesArea += existingShape.calculateArea();
            }
            
            for (int i = 0; i < quantity; i++) {
                    Shape shape = createShape(selectedShape);
                    shape.setUnitPrice(unitPrice);

                    shape.getDimensionList().clear();
                    shape.getDimensionList().add(dim1);
                    if (txtFieldDimension2.isVisible()) {
                        shape.getDimensionList().add(dim2);
                    }

                    double shapeArea = shape.calculateArea();

                    // Check if adding the current shape would exceed the floor size
                    if (totalTilesArea + shapeArea <= floorSize) {
                        shapesList.add(shape);
                        totalTilesArea += shapeArea; // Update the total area covered by tiles
                        txtFieldErrorMsg.setText("Shape added: " + shape.getType());

                    } else {
                        // Display a message or handle the case where adding more tiles would exceed the floor size
                        txtFieldErrorMsg.setText("Max floor size reached");
                        break; // Exit the loop, as adding more tiles would exceed the floor size
                    }
                }
    }//GEN-LAST:event_btnAddTileActionPerformed

    private void btnCalculateCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateCostActionPerformed
        // TODO add your handling code here:
            // Calculate the total cost
    double totalCost = 0.0;
    StringBuilder receiptText = new StringBuilder();
    
    // Map to store the quantity and cost for each shape type
    Map<String, Integer> shapeQuantityMap = new HashMap<>();
    Map<String, Double> shapeTotalCostMap = new HashMap<>();

    for (Shape shape : shapesList) {
        // Assuming that the quantity is always 1 for each shape
        int quantity = 1;
        
        double shapeCost = shape.calculateCost();
        totalCost += shapeCost;

        // Update the quantity and total cost in the maps
        shapeQuantityMap.put(shape.getType(), shapeQuantityMap.getOrDefault(shape.getType(), 0) + quantity);
        shapeTotalCostMap.put(shape.getType(), shapeTotalCostMap.getOrDefault(shape.getType(), 0.0) + shapeCost);
    }
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    // Append condensed shape details to the receipt text
    for (Map.Entry<String, Integer> entry : shapeQuantityMap.entrySet()) {
        String shapeType = entry.getKey();
        int quantity = entry.getValue();
        double totalCostForShape = shapeTotalCostMap.get(shapeType);

        receiptText.append("Shape: ").append(shapeType)
                   .append(", Quantity: ").append(quantity)
                   .append(", Total Cost: $").append(decimalFormat.format(totalCostForShape))
                   .append("\n");
    }
    String formattedTotalCost = decimalFormat.format(totalCost);

    // Display the receipt in the text area
    txtAreaDisplayReceipt.setText(receiptText.toString());

    // Display or use the totalCost as needed (e.g., in a label)
    // For example, if you have a label named totalCostLabel, you can set its text:
    totalCostLabel.setText("Total Cost: $" + formattedTotalCost);
    }//GEN-LAST:event_btnCalculateCostActionPerformed

    private void txtFieldFloorSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldFloorSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldFloorSizeActionPerformed

    private void txtFieldErrorMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldErrorMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldErrorMsgActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tileCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tileCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tileCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tileCalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tileCalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTile;
    private javax.swing.JButton btnCalculateCost;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> comboBoxShapes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTextField totalCostLabel;
    private javax.swing.JTextArea txtAreaDisplayReceipt;
    private javax.swing.JTextField txtFieldCostPerUnit;
    private javax.swing.JTextField txtFieldDimension1;
    private javax.swing.JTextField txtFieldDimension2;
    private javax.swing.JTextField txtFieldErrorMsg;
    private javax.swing.JTextField txtFieldFloorSize;
    private javax.swing.JLabel txtLabelDimension1;
    private javax.swing.JLabel txtLabelDimension2;
    private javax.swing.JLabel txtLabelDimension3;
    private javax.swing.JLabel txtLabelDimension4;
    private javax.swing.JLabel txtLabelDimension5;
    // End of variables declaration//GEN-END:variables
}
