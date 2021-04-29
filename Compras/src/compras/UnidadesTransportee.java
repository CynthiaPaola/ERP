/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

/**
 *
 * @author HP
 */
import Modelo.UnidadesTransporte;
import Modelo.UnidadesTransporteDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UnidadesTransportee extends javax.swing.JFrame {

    UnidadesTransporte ta = new UnidadesTransporte();
    UnidadesTransporteDao tat = new UnidadesTransporteDao();
    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form UnidadesTransporte
     */
    public UnidadesTransportee() {
        initComponents();
    }

    public void ListarTr() {
        List<UnidadesTransporte> ListarTr = tat.ListarTransporte();
        modelo = (DefaultTableModel) TableTransporte.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < ListarTr.size(); i++) {
            ob[0] = ListarTr.get(i).getId();
            ob[1] = ListarTr.get(i).getPlacas();
            ob[2] = ListarTr.get(i).getMarca();
            ob[3] = ListarTr.get(i).getModelo();
            ob[4] = ListarTr.get(i).getAnio();
            ob[5] = ListarTr.get(i).getCapacidad();
            ob[6] = ListarTr.get(i).getTipo();

            modelo.addRow(ob);
        }
        TableTransporte.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtplacas = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        txtanio = new javax.swing.JTextField();
        txtcapacidad = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTransporte = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel1.setText("IdUnidadTransporte");

        jLabel2.setText("Placas");

        jLabel3.setText("Marca");

        jLabel4.setText("Modelo");

        jLabel5.setText("Año");

        jLabel6.setText("Capacidad");

        jLabel7.setText("Tipo");

        TableTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdUnidadTransporte", "Placas", "Marca", "Modelo", "Año", "Capacidad", "Tipo"
            }
        ));
        TableTransporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTransporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTransporte);

        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel8.setText("UNIDADES TRANSPORTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtanio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtplacas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtplacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnguardar)
                            .addComponent(btnEditar))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!"".equals(txtid.getText())) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminarlo");
            if (pregunta == 0) {
                int id = Integer.parseInt(txtid.getText());
                tat.EliminarUnidadesTransporte(id);
                LimpiarTable();
                LimpiarTR();
                ListarTr();

            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (!"".equals(txtplacas.getText()) && !"".equals(txtmarca.getText()) && !"".equals(txtmodelo.getText()) && !"".equals(txtanio.getText())
                && !"".equals(txtcapacidad.getText()) && !"".equals(txttipo.getText())) {
            ta.setPlacas(txtplacas.getText());
            ta.setMarca(txtmarca.getText());
            ta.setModelo(txtmodelo.getText());
            ta.setAnio(Integer.parseInt(txtanio.getText()));
            ta.setCapacidad(Integer.parseInt(txtcapacidad.getText()));
            ta.setTipo(txttipo.getText());
            tat.RegistrarUnidadesTransporte(ta);
            LimpiarTable();
            LimpiarTR();
            ListarTr();
            JOptionPane.showMessageDialog(null, "Registrado");
        } else {
            JOptionPane.showMessageDialog(null, "los campos estan vacios");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void TableTransporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTransporteMouseClicked
        int fila = TableTransporte.rowAtPoint(evt.getPoint());
        txtid.setText(TableTransporte.getValueAt(fila, 0).toString());
        txtplacas.setText(TableTransporte.getValueAt(fila, 1).toString());
        txtmarca.setText(TableTransporte.getValueAt(fila, 2).toString());
        txtmodelo.setText(TableTransporte.getValueAt(fila, 3).toString());
        txtanio.setText(TableTransporte.getValueAt(fila, 4).toString());
        txtcapacidad.setText(TableTransporte.getValueAt(fila, 5).toString());
        txttipo.setText(TableTransporte.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_TableTransporteMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if ("".equals(txtid.getText())) {
            JOptionPane.showMessageDialog(null, "seleccione una fila");
        }
        int pregunta = JOptionPane.showConfirmDialog(null, "Estas seguro de modificar sus datos");
        if (pregunta == 0) {
            if (!"".equals(txtplacas.getText()) || !"".equals(txtmarca.getText())
                    || !"".equals(txtmodelo.getText()) || !"".equals(txtanio.getText())
                    || !"".equals(txtcapacidad.getText()) || !"".equals(txttipo.getText())) {
                ta.setPlacas(txtplacas.getText());
                ta.setMarca(txtmarca.getText());
                ta.setModelo(txtmodelo.getText());
                ta.setAnio(Integer.parseInt(txtanio.getText()));
                ta.setCapacidad(Integer.parseInt(txtcapacidad.getText()));
                ta.setTipo(txttipo.getText());

                tat.ModificarUnidadesTransporte(ta);
                LimpiarTable();
                LimpiarTR();
                ListarTr();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void LimpiarTR() {
        txtid.setText("");
        txtplacas.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        txtanio.setText("");
        txtcapacidad.setText("");
        txttipo.setText("");
    }

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
            java.util.logging.Logger.getLogger(UnidadesTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnidadesTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnidadesTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnidadesTransporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnidadesTransportee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableTransporte;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtanio;
    private javax.swing.JTextField txtcapacidad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtplacas;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}