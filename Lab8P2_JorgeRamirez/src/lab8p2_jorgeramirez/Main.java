/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8p2_jorgeramirez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Ramirez
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        Activacion();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombrePais = new javax.swing.JTextField();
        BotonCrearPais = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        MedallasCrearPais = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NombreNadador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboNacionalidadNA = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        EdadNadador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EstaturaNadador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboEstiloNadador = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        DistanciaNadador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        SpinnerTiempoN = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        SpinnerMedallas = new javax.swing.JSpinner();
        BotonCrearNadador = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        BotonCrearPais.setText("Crear");
        BotonCrearPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearPaisActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Medallas del Pais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(MedallasCrearPais)
                            .addComponent(NombrePais)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(BotonCrearPais, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(NombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MedallasCrearPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(BotonCrearPais)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Pais", jPanel1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nacionalidad");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Edad");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Estatura");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Estilo de Nado");

        ComboEstiloNadador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Mariposa", "Dorso", "Pecho" }));
        ComboEstiloNadador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEstiloNadadorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Distancia");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tiempo");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Numero de Medallas");

        BotonCrearNadador.setText("CREAR NADADOR");
        BotonCrearNadador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearNadadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(NombreNadador)
                    .addComponent(ComboNacionalidadNA, 0, 90, Short.MAX_VALUE)
                    .addComponent(EdadNadador)
                    .addComponent(EstaturaNadador))
                .addGap(173, 173, 173)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpinnerMedallas)
                    .addComponent(SpinnerTiempoN)
                    .addComponent(DistanciaNadador)
                    .addComponent(ComboEstiloNadador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCrearNadador)
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboEstiloNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboNacionalidadNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DistanciaNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdadNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerTiempoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstaturaNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerMedallas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCrearNadador)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nadador", jPanel2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ESTILO");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("DISTANCIA");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "400", "800" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("RECORD");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pecho", "Libre", "Dorso", "Mariposa", " " }));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("CREAR UN EVENTO");

        jToggleButton1.setText("CREAR EVENTO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1))
                        .addGap(64, 64, 64)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(171, 171, 171))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel14)
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(117, 117, 117))
        );

        jTabbedPane1.addTab("Crear un Evento", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearPaisActionPerformed
        // TODO add your handling code here:

        String name = NombrePais.getText();
        int medallas = Integer.parseInt(MedallasCrearPais.getText());
        paises.add(new Pais(name, medallas));
        DefaultComboBoxModel x = (DefaultComboBoxModel) ComboNacionalidadNA.getModel();

        for (int i = 0; i < paises.size(); i++) {
            Pais p = paises.get(i);
            x.addElement(p);

        }

        ComboNacionalidadNA.setModel(x);
        AgregarArchivo(paises.get(paises.size() - 1));
        JOptionPane.showMessageDialog(this, "Pais creado con exito");
    }//GEN-LAST:event_BotonCrearPaisActionPerformed

    private void BotonCrearNadadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearNadadorActionPerformed
        // TODO add your handling code here:
        String name = NombreNadador.getText();
        String nacionalidad = (String) ComboNacionalidadNA.toString();
        int age = Integer.parseInt(EdadNadador.getText());
        double estatura = Double.parseDouble(EstaturaNadador.getText());

        String[] estilos = {"LIBRE", "PECHO", "MARIPOSA", "DORSO"};
        String estilo = "";
        String selectedEstilo = (String) ComboEstiloNadador.getSelectedItem();

        for (String posibleEstilo : estilos) {
            if (selectedEstilo.equals(posibleEstilo)) {
                estilo = posibleEstilo;
                break;
            }
        }
        int distancia = Integer.parseInt(DistanciaNadador.getText());
        int tiempo = ((Integer)SpinnerTiempoN.getValue());
        int nummeda= ((Integer)SpinnerMedallas.getValue());
        nadadores.add(new Nadador(name, nacionalidad, age, estatura, estilo, distancia, estatura) );
        AgregarArchivo(nadadores.get(nadadores.size()));
        JOptionPane.showMessageDialog(this, "Nadador Creado");
    }//GEN-LAST:event_BotonCrearNadadorActionPerformed

    private void ComboEstiloNadadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEstiloNadadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboEstiloNadadorActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonCrearNadador;
    private javax.swing.JToggleButton BotonCrearPais;
    private javax.swing.JComboBox<String> ComboEstiloNadador;
    private javax.swing.JComboBox<String> ComboNacionalidadNA;
    private javax.swing.JTextField DistanciaNadador;
    private javax.swing.JTextField EdadNadador;
    private javax.swing.JTextField EstaturaNadador;
    private javax.swing.JTextField MedallasCrearPais;
    private javax.swing.JTextField NombreNadador;
    private javax.swing.JTextField NombrePais;
    private javax.swing.JSpinner SpinnerMedallas;
    private javax.swing.JSpinner SpinnerTiempoN;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
    ArrayList<Pais> paises = new ArrayList();
    ArrayList<Nadador> nadadores = new ArrayList();

    public void AgregarArchivo(Pais country) {
        try {
            File Archivo = new File("./PaisParticipantes.sof");
            FileOutputStream fw = new FileOutputStream(Archivo);
            ObjectOutputStream bw = new ObjectOutputStream(fw);
            bw.writeObject(country);
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public ArrayList<Pais> Leer() {
        ArrayList<Pais> paises = new ArrayList();
        try {
            File Archivo = new File("./PaisParticipantes.sof");
            FileInputStream fw = new FileInputStream(Archivo);
            ObjectInputStream bw = new ObjectInputStream(fw);
            Pais country = new Pais();
            while ((country = (Pais) bw.readObject()) != null) {
                paises.add(country);

            }
        } catch (Exception e) {
        }

        return paises;
    }

    public void Activacion() {
        Pais country = new Pais();
        ArrayList<Pais> paises = country.Leer();
        DefaultComboBoxModel x = (DefaultComboBoxModel) ComboNacionalidadNA.getModel();

        for (int i = 0; i < paises.size(); i++) {
            Pais cty = paises.get(i);
            x.addElement(cty);
        }
        ComboNacionalidadNA.setModel(x);
    }
    
    public void AgregarArchivo(Nadador nadadores) {
        try {
            File Archivo = new File("./Nadador.sof");
            FileOutputStream fw = new FileOutputStream(Archivo);
            ObjectOutputStream bw = new ObjectOutputStream(fw);
            bw.writeObject(nadadores);
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public ArrayList<Nadador> Leer2() {
        ArrayList<Nadador> nadadores = new ArrayList();
        try {
            File Archivo = new File("./Nadador.sof");
            FileInputStream fw = new FileInputStream(Archivo);
            ObjectInputStream bw = new ObjectInputStream(fw);
            Nadador nadador = new Nadador();
            while ((nadador = (Nadador) bw.readObject()) != null) {
                nadadores.add(nadador);

            }
        } catch (Exception e) {
        }

        return nadadores;
    }

}
