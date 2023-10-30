package semana11;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class FrmMatrizOperaciones extends javax.swing.JFrame {

    public FrmMatrizOperaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOption = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDimensionMatriz = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResult = new javax.swing.JTextArea();
        rdbSumarxFila = new javax.swing.JRadioButton();
        rdbSumarxColumna = new javax.swing.JRadioButton();
        rdbSumDiagonalDerecha = new javax.swing.JRadioButton();
        rdbSumDiagonalIzquierda = new javax.swing.JRadioButton();
        rdbOrdenarxFila = new javax.swing.JRadioButton();
        rdbOrdenarxColumna = new javax.swing.JRadioButton();
        btnMostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Operaciones :");

        jLabel2.setText("Ingrese el numero para la matriz cuadrada:");

        txtDimensionMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDimensionMatrizActionPerformed(evt);
            }
        });

        taResult.setColumns(20);
        taResult.setRows(5);
        jScrollPane1.setViewportView(taResult);

        bgOption.add(rdbSumarxFila);
        rdbSumarxFila.setText("Sumar por Fila");
        rdbSumarxFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSumarxFilaActionPerformed(evt);
            }
        });

        bgOption.add(rdbSumarxColumna);
        rdbSumarxColumna.setText("Sumar por Columna");

        bgOption.add(rdbSumDiagonalDerecha);
        rdbSumDiagonalDerecha.setText("Sumar Diagonal Derecha");

        bgOption.add(rdbSumDiagonalIzquierda);
        rdbSumDiagonalIzquierda.setText("Sumar Diagonal Izquierda");

        bgOption.add(rdbOrdenarxFila);
        rdbOrdenarxFila.setText("Ordenar por Fila");

        bgOption.add(rdbOrdenarxColumna);
        rdbOrdenarxColumna.setText("Ordenar por Columna");
        rdbOrdenarxColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOrdenarxColumnaActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Operaciones con Matriz Cuadrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbSumDiagonalIzquierda)
                                    .addComponent(rdbSumarxFila))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(btnMostrar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rdbSumarxColumna)
                                                .addComponent(rdbOrdenarxFila)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbOrdenarxColumna)
                                            .addComponent(rdbSumDiagonalDerecha)))))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDimensionMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDimensionMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSumarxFila)
                    .addComponent(rdbSumarxColumna)
                    .addComponent(rdbSumDiagonalDerecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSumDiagonalIzquierda)
                    .addComponent(rdbOrdenarxFila)
                    .addComponent(rdbOrdenarxColumna))
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        taResult.setText("");
        byte numero = Byte.parseByte(txtDimensionMatriz.getText());
        txtDimensionMatriz.setText("");
        txtDimensionMatriz.requestFocus();
        if(numero <= 0){
            txtDimensionMatriz.setText("");
            txtDimensionMatriz.requestFocus();
            return;
        }
        byte[][] matrizCuadrada = new byte [numero][numero];
        for(int i = 0; i < matrizCuadrada.length; i++){ 
            for (int j = 0; j < matrizCuadrada[i].length; j++) {
                matrizCuadrada[i][j] = (byte) (Math.random()*(99-10+1)+10);
            }
        }
        taResult.append("     Matriz \n");
            for(int i = 0; i < matrizCuadrada.length; i++){ 
                for (int j = 0; j < matrizCuadrada[i].length; j++) {
                    taResult.append(" "+matrizCuadrada[i][j]+" ");
                }
                taResult.append("\n"); 
            }
        short[] suma = new short[matrizCuadrada.length];
        int sumaDiagonal = 0, tamanio=matrizCuadrada.length-1, recorrido = 0;
        short[] ordenarMatriz = new short[numero*numero];        
        if(rdbSumarxFila.isSelected()){            
            for (int i=0; i < matrizCuadrada.length; i++){ 
                for (int j = 0; j < matrizCuadrada.length; j++) { 
                    suma[i] += matrizCuadrada[i][j]; 
                } 
                taResult.append("La suma de la Fila "+(i+1)+" = "+suma[i]+"\n");
            } 
        } else if (rdbSumarxColumna.isSelected()){
            for (int i=0; i < matrizCuadrada.length; i++){ 
                for (int j = 0; j < matrizCuadrada.length; j++) { 
                    suma[i] += matrizCuadrada[j][i]; 
                } 
                taResult.append("La suma de la Columna "+(i+1)+" = "+suma[i]+"\n");
            }
        } else if (rdbSumDiagonalDerecha.isSelected()){
            for (int i=0; i<matrizCuadrada.length; i++){
                for (int j = 0; j < matrizCuadrada.length; j++) {
                    if (matrizCuadrada[i] == matrizCuadrada[j]){
                        sumaDiagonal += matrizCuadrada[i][j];
                    }
                }
            }
            taResult.append("La suma de la diagonal derecha es "+sumaDiagonal+"\n");            
        } else if (rdbSumDiagonalIzquierda.isSelected()){
            for (int i = 0; i < matrizCuadrada.length; i++) {
                sumaDiagonal += matrizCuadrada[i][tamanio--];
            }
            taResult.append("La suma de la diagonal izquierda es "+sumaDiagonal+"\n");            
        } else if (rdbOrdenarxFila.isSelected()){
            for (int i = 0; i < matrizCuadrada.length; i++) {
                for (int j = 0; j < matrizCuadrada.length; j++) {
                    ordenarMatriz[recorrido++] = matrizCuadrada[i][j];
                }
            }
            Arrays.sort(ordenarMatriz);
            recorrido = 0;
            for (int i = 0; i < matrizCuadrada.length; i++) {
                for (int j = 0; j < matrizCuadrada.length; j++) {
                    matrizCuadrada[i][j] = (byte) ordenarMatriz[recorrido++]; 
                }
            }
            taResult.append("     Matriz Ordenada \n");
            for(int i = 0; i < matrizCuadrada.length; i++){ 
                for (int j = 0; j < matrizCuadrada[i].length; j++) {
                    taResult.append(" "+matrizCuadrada[i][j]+" ");
                }
                taResult.append("\n"); 
            }
            
        } else if (rdbOrdenarxColumna.isSelected()){
            for (int i = 0; i < matrizCuadrada.length; i++) {
                for (int j = 0; j < matrizCuadrada.length; j++) {
                    ordenarMatriz[recorrido++] = matrizCuadrada[i][j];
                }
            }
            Arrays.sort(ordenarMatriz);
            recorrido = 0;
            for (int i = 0; i < matrizCuadrada.length; i++) {
                for (int j = 0; j < matrizCuadrada.length; j++) {
                    matrizCuadrada[j][i] = (byte) ordenarMatriz[recorrido++]; 
                }
            }
            taResult.append("     Matriz Ordenada \n");
            for(int i = 0; i < matrizCuadrada.length; i++){ 
                for (int j = 0; j < matrizCuadrada[i].length; j++) {
                    taResult.append(" "+matrizCuadrada[i][j]+" ");
                }
                taResult.append("\n"); 
            }
        } else {
            taResult.setText("");
            JOptionPane.showMessageDialog(null, "Error, debe selecionar una opción.","Error",JOptionPane.ERROR_MESSAGE);
        }
        bgOption.clearSelection();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void rdbSumarxFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSumarxFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbSumarxFilaActionPerformed

    private void rdbOrdenarxColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOrdenarxColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbOrdenarxColumnaActionPerformed

    private void txtDimensionMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDimensionMatrizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDimensionMatrizActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMatrizOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOption;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbOrdenarxColumna;
    private javax.swing.JRadioButton rdbOrdenarxFila;
    private javax.swing.JRadioButton rdbSumDiagonalDerecha;
    private javax.swing.JRadioButton rdbSumDiagonalIzquierda;
    private javax.swing.JRadioButton rdbSumarxColumna;
    private javax.swing.JRadioButton rdbSumarxFila;
    private javax.swing.JTextArea taResult;
    private javax.swing.JTextField txtDimensionMatriz;
    // End of variables declaration//GEN-END:variables
}
