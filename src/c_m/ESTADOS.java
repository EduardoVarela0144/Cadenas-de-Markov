
package c_m;

import static c_m.Inicio.V_N;
import static c_m.Inicio.XN;
import static c_m.Inicio.p;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class ESTADOS extends javax.swing.JFrame {
//Generamos la matriz para las condiciones
Float[][] c = new Float[XN][1];
//Generamos la matriz para las matrices de transición
Float[][] m = new Float[XN][XN];
//Creamos el arraylist para guardar todas los periodos calculados
ArrayList arr2 = new ArrayList();
//Creamo el array list para guardar todas la matrices de transición generadas
ArrayList arr = new ArrayList();

    public ESTADOS() {
   
        initComponents();
        this.setLocationRelativeTo(null);
        JTableHeader header = ER.getTableHeader();
      
        //Modelo de tablas para generar diseño
        DefaultTableModel model = (DefaultTableModel) ER.getModel();
        DefaultTableModel model2 = (DefaultTableModel) Condiciones.getModel();
        DefaultTableModel model5 = (DefaultTableModel) jTable4.getModel();
        
        //Añadimos las columnas Xn mas las columnas fijas
        model.addColumn("");
        model5.addColumn("");
        for(int i = 0;i<XN;i++){
        model.addColumn(V_N[i]);model5.addColumn(V_N[i]);}
        model2.addColumn("E0");
        //Removemos las filas que genera en automatico las cuales en automatico son 4
        for(int i = 0;i<4;i++){
            model.removeRow(0);
            model5.removeRow(0);
       }
        //Creamos las filas que vamos a usar
        Object rowData[] = new Object [XN];
        Object rowData2[] = new Object [XN];
        //Añadimos filas y columnas para condiciones iniciales
        for(int i = 0;i<XN;i++){
        rowData[0]=V_N[i];
        model.addRow(rowData);
        rowData2[0]="";
        model2.addRow(rowData2);
        }
        
        //Parametros de Diseño para cada tabla
        DefaultTableCellRenderer MyCellrendar = new DefaultTableCellRenderer();
        MyCellrendar.setBackground(new Color(242, 242, 242));
        MyCellrendar.setForeground(Color.BLACK);
        ER.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar);
        
        
        DefaultTableCellRenderer MyCellrendar2 = new DefaultTableCellRenderer();
        MyCellrendar2.setBackground(Color.WHITE);
        for(int i = 1;i<XN+1;i++){
        ER.getColumnModel().getColumn(i).setCellRenderer(MyCellrendar2);
        }
        
        DefaultTableCellRenderer MyCellrendar3 = new DefaultTableCellRenderer();
        MyCellrendar3.setBackground(Color.WHITE);
        Condiciones.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar3);
        
        for(int i=1;i<XN+1;i++){
               
                MyCellrendar2.setHorizontalAlignment(SwingConstants.CENTER);
                ER.getColumnModel().getColumn(i).setCellRenderer(MyCellrendar2);}
        ((DefaultTableCellRenderer) ER.getTableHeader().getDefaultRenderer())
                       .setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) Condiciones.getTableHeader().getDefaultRenderer())
                       .setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) SOL.getTableHeader().getDefaultRenderer())
                       .setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) jTable3.getTableHeader().getDefaultRenderer())
                       .setHorizontalAlignment(SwingConstants.CENTER);
        MyCellrendar2.setHorizontalAlignment(SwingConstants.CENTER);
                Condiciones.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar2);
        
        MyCellrendar2.setHorizontalAlignment(SwingConstants.CENTER);
                jTable3.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar2);
        ((DefaultTableCellRenderer) jTable4.getTableHeader().getDefaultRenderer())
                       .setHorizontalAlignment(SwingConstants.CENTER);       
               
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        T2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ER = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Condiciones = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        SOL = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        T2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        T2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T2.setText("INGRESA LA MATRIZ DE TRASICIÓN Y EL ESTADO INICIAL");

        ER = new javax.swing.JTable(){

            public boolean isCellEditable(int row,int column){
                if(column == 0) return false;
                return true;
            }

        };
        ER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ER.setFocusable(false);
        ER.getTableHeader().setResizingAllowed(false);
        ER.getTableHeader().setReorderingAllowed(false);
        ER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ERMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ER);
        ER.getAccessibleContext().setAccessibleName("");

        Condiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Condiciones.setFocusable(false);
        jScrollPane3.setViewportView(Condiciones);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        SOL = new javax.swing.JTable(){

            public boolean isCellEditable(int row,int column){
                if(column == 0) return false;
                return true;

            }

        };
        SOL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ESTADO EST"
            }
        ));
        SOL.setFocusable(false);
        jScrollPane5.setViewportView(SOL);

        jTable3 = new javax.swing.JTable(){

            public boolean isCellEditable(int row,int column){
                if(column == 0) return false;
                return true;

            }

        };
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ESTADO N"
            }
        ));
        jTable3.setFocusable(false);
        jScrollPane6.setViewportView(jTable3);

        jTable4 = new javax.swing.JTable(){

            public boolean isCellEditable(int row,int column){
                return false;

            }

        };
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable4.setFocusable(false);
        jTable4.getTableHeader().setResizingAllowed(false);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable4);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T2)
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ERMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ERMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Establecemos diseño a la tabla
        DefaultTableCellRenderer MyCellrendar4 = new DefaultTableCellRenderer();
        MyCellrendar4.setBackground(Color.YELLOW);
        SOL.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar4);
        MyCellrendar4.setHorizontalAlignment(SwingConstants.CENTER);
                SOL.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar4);
        
//EL SIGUEINTE MODULO REALIZA TODOS LOS CALCULOS


    //Guardamos los datos ingresados en la tabla de estado incial
    try{for(int i =0;i<XN;i++){
            c[i][0]=Float.parseFloat(Condiciones.getValueAt(i, 0).toString());
    }
    //Agregamos al arraylist que guarda cada uno de los estados iniciales
    arr2.add(c);
    
    //Guardamos los datos ingresados en la tabla de matriz de transición
    for(int i =0;i<XN;i++){
        for(int j =0;j<XN;j++){
            m[i][j]=Float.parseFloat(ER.getValueAt(i, j+1).toString());
        }
    }
    //Añadimos al arraylist que guarda las amtrices de transición
    arr.add(m);
  
     
    
    //Calculo de los distintos estados para cada uno de los periodos
    
    Float[][] Matrizi;
    Float[][] Matriz;
    for(int z=1;z<p+1;z++){
    Matriz = (Float[][]) arr.get(0);
    Matrizi = (Float[][]) arr2.get(z-1);
       Float[][] c2 = new Float[XN][1]; 
        //Ciclo for para cada columna de la matriz B
        for (int a = 0; a < Matrizi[0].length; a++) {
            //Ciclo for para la cada fila de la matriz A
            for (int i = 0; i < Matriz.length; i++) {
                float suma = 0;
                // Ciclo for para cada columna de la matriz A
                for (int j = 0; j < Matriz[0].length; j++) {
                    //Multiplicación y suma para el nuevo valor generado
                    suma += Matriz[i][j] * Matrizi[j][a];
                }
                //Pasamos el valor generado en su psoción
                c2[i][a] = suma;
            }
        }
       //Añadimos al arraylist
       arr2.add(c2);
    }
    
    //Calculo de las distintas matrices de transición
    
    for(int z=1;z<p+1;z++){
    Matriz = (Float[][]) arr.get(z-1);
       Float[][] c2 = new Float[XN][XN]; 
       //Ciclo for para cada columna de la matriz B
        for (int a = 0; a < Matriz[0].length; a++) {
        //Ciclo for para la cada fila de la matriz A
            for (int i = 0; i < Matriz.length; i++) {
                float suma = 0;
                // Ciclo for para cada columna de la matriz A
                for (int j = 0; j < Matriz[0].length; j++) {
                    //Multiplicación y suma para el nuevo valor generado
                    suma += Matriz[i][j] * Matriz[j][a];
                }
                //Pasamos el valor generado en su psoción
                c2[i][a] = suma;
            }
        }
        //Añadimos al arraylist
       arr.add(c2);
    }
    
    //En esta sección se pasan todos los valores generaados a las tablas para su visualización
       Matrizi = (Float[][]) arr2.get(p);
  
      DefaultTableModel model3 = (DefaultTableModel) SOL.getModel();
      Object rowData3[] = new Object [XN];
      for(int i =0;i<XN;i++){
      rowData3[0]=Matrizi[i][0];
      model3.addRow(rowData3); 
    }
      for(int i=0;i<p+1;i++){
       jComboBox1.addItem("Estado "+String.valueOf(i));
       jComboBox2.addItem("Matriz "+String.valueOf(i));
      }}catch(Exception e){
    JOptionPane.showMessageDialog(null, "Recuerda : \n"+"1. Todos los campos deben estar llenos \n"+
            "2. Debes presionar enter sobre la tabla al finalizar tu captura \n"
            +
            "3. Solo puedes ingresar números "
            );
    
    }
    }//GEN-LAST:event_jButton1ActionPerformed
public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) jTable3.getModel();
        int a = jTable3.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        
    }
public void eliminar2(){
        DefaultTableModel tb = (DefaultTableModel) jTable4.getModel();
        int a = jTable4.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        
    }
 

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        DefaultTableCellRenderer MyCellrendar4 = new DefaultTableCellRenderer();
        MyCellrendar4.setBackground(Color.YELLOW);
        jTable3.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar4);       
        eliminar();
         
         
         Float[][] Matrizi;
        
         DefaultTableModel model3 = (DefaultTableModel) jTable3.getModel();
         Object rowData3[] = new Object [XN];   
         try{
         Matrizi = (Float[][]) arr2.get(jComboBox1.getSelectedIndex()-1);
      for(int i =0;i<XN;i++){
      rowData3[0]=Matrizi[i][0];
      model3.addRow(rowData3); 
    }}catch(Exception e){
     JOptionPane.showMessageDialog(null,"Esa opción no es valida");
    }
         MyCellrendar4.setHorizontalAlignment(SwingConstants.CENTER);
                jTable3.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar4);
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
 DefaultTableCellRenderer MyCellrendar = new DefaultTableCellRenderer();
        MyCellrendar.setBackground(new Color(242, 242, 242));
        MyCellrendar.setForeground(Color.BLACK);
        
        jTable4.getColumnModel().getColumn(0).setCellRenderer(MyCellrendar);
        
        
        DefaultTableCellRenderer MyCellrendar2 = new DefaultTableCellRenderer();
        MyCellrendar2.setBackground(Color.WHITE);
        for(int i = 1;i<XN+1;i++){
        jTable4.getColumnModel().getColumn(i).setCellRenderer(MyCellrendar2);
        }
        
           
         eliminar2();
         Float[][] Matriz;
        
         DefaultTableModel model8 = (DefaultTableModel) jTable4.getModel();
         Object rowData8[] = new Object [XN+1];
         try{
         Matriz = (Float[][]) arr.get(jComboBox2.getSelectedIndex()-1);
        
       
      for(int i =0;i<XN;i++){
          
        for(int j =0;j<XN;j++){
           rowData8[0]=V_N[i];
            rowData8[j+1]=Matriz[i][j];
            
              
        }
       model8.addRow(rowData8); 
       
      }}catch(Exception e){
      JOptionPane.showMessageDialog(null,"Esa opción no es valida");
      }
     
      
     for(int i=1;i<XN+1;i++){
               
                MyCellrendar2.setHorizontalAlignment(SwingConstants.CENTER);
                jTable4.getColumnModel().getColumn(i).setCellRenderer(MyCellrendar2);}
   


        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(ESTADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESTADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESTADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESTADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ESTADOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Condiciones;
    private javax.swing.JTable ER;
    private javax.swing.JTable SOL;
    private javax.swing.JLabel T2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
