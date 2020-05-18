/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02052020;

import giovynet.serial.Baud;
import giovynet.serial.Com;
import giovynet.serial.Parameters;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brito Paredes
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Com selectPuerto;
    Parameters Parametros;
    String cad_recibe="";
    int puertoEscrito;
    ServerSocket skServidor;
    Socket skCliente;
    InputStream aux;
    DataInputStream flujo;
    String cadena;
    String datosRs232;
    
    DefaultTableModel datos = new DefaultTableModel();
    
    public Home() {
        initComponents();
        status.setVisible(false);
        setModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        comSelect = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnConfig = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        puertoInput = new javax.swing.JTextField();
        enviarDato = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        inID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inEstado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        status1 = new javax.swing.JLabel();
        enviarPuerto = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        verDatosPuerto = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        estadoRS232 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Conexión con RS232");

        comSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7" }));

        jLabel2.setText("Selecciona un puerto");

        btnConfig.setText("Configura el puerto");
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        status.setText("Status del puerto");

        puertoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puertoInputActionPerformed(evt);
            }
        });

        enviarDato.setText("Enviar");
        enviarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarDatoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tabla);

        inID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inIDActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        inNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        inCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCorreoActionPerformed(evt);
            }
        });

        jLabel5.setText("Correo");

        inEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inEstadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        status1.setText("Puerto del Server");

        enviarPuerto.setText("Activar");
        enviarPuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarPuertoActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        verDatosPuerto.setColumns(20);
        verDatosPuerto.setRows(5);
        jScrollPane3.setViewportView(verDatosPuerto);

        estadoRS232.setColumns(20);
        estadoRS232.setRows(5);
        jScrollPane4.setViewportView(estadoRS232);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(comSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnConfig))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(enviarDato)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(status1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(puertoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(status))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enviarPuerto)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRegistrar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(717, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfig)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(inCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnRegistrar)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(inEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnEliminar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(enviarDato)
                                .addGap(7, 7, 7)
                                .addComponent(status))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(status1)
                            .addComponent(enviarPuerto)
                            .addComponent(puertoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setModel(){
        String[] cabecera = {"ID", "Nombre", "Correo", "Estado"};
        datos.setColumnIdentifiers(cabecera);
        tabla.setModel(datos);
    }
    void agregar(){
        datos.addRow(new Object[] {inID.getText(), inNombre.getText(), inCorreo.getText(), inEstado.getText()});
    }
    
    void eliminar(){
        int fila=tabla.getSelectedRow();
        datos.removeRow(fila);
    }
    
    void limpiar(){
        int filas=datos.getRowCount();
        for (int i=0; i<filas; i++){
            datos.removeRow(0);
        }
    }
    
    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        try {
            // TODO add your handling code here:
            Parametros = new Parameters();
            Parametros.setPort(comSelect.getSelectedItem().toString());
            Parametros.setBaudRate(Baud._9600);
            Parametros.setMinDelayWrite(10);
            
            selectPuerto=new Com(Parametros);
            Recibir rx=new Recibir() {};
            rx.start();
            
            status.setText("Puerto Concetado");
            status.setVisible(true);
            
        } catch (Exception ex) {
            status.setVisible(true);
            status.setText("No funciona, ups. Puerto Desconectado");

            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfigActionPerformed

    private void puertoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puertoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puertoInputActionPerformed

    private void enviarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarDatoActionPerformed
        send_rs232();
    }//GEN-LAST:event_enviarDatoActionPerformed

    private void inIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inIDActionPerformed

    private void inNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNombreActionPerformed

    private void inCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inCorreoActionPerformed

    private void inEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inEstadoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        agregar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void enviarPuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarPuertoActionPerformed
        puertoEscrito=Integer.parseInt(puertoInput.getText());
        recibirEthernet redLeer = new recibirEthernet() {};
        redLeer.start();
    }//GEN-LAST:event_enviarPuertoActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    public void read_rs232(){
        try{
            
            boolean detener=false;
            char datoRecibido=0;
            Thread.sleep(2000);
            while((datoRecibido = selectPuerto.receiveSingleChar())!='\0'){   
                cad_recibe+=datoRecibido;
                detener=true;
                
            }
            if(detener==true){
                detener=false;
                estadoRS232.setText(cad_recibe);
                System.out.println(cad_recibe);
                datosRs232=cad_recibe;
                cad_recibe="";
            }
        }catch (Exception ex) {            
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }
    
    public void send_rs232(){
        try{
            selectPuerto.sendString(puertoInput.getText());
            
        } catch (Exception ex) {
            
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public abstract class Recibir extends Thread{
       @Override
       public void run(){
           
           while(true){
               try{
                    cad_recibe+=selectPuerto.receiveSingleString();
                    jTextArea1.setText(cad_recibe);
                    
               } catch (Exception ex) {            
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                 }
           }
           
        }
    }
    
    public void send_rs232(String datos){
        try{
            selectPuerto.sendString(datos);
        }
        catch (Exception ex) {            
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }
    
    public abstract class recibirEthernet extends Thread{
        @Override
        public void run(){
            boolean active=true;
            
            try{
                skServidor = new ServerSocket(puertoEscrito);
                JOptionPane.showMessageDialog(null, "Todo bien, crack");
                
                while(active){
                    skCliente = skServidor.accept();
                    
                    aux = skCliente.getInputStream();
                    flujo = new DataInputStream(aux);
                    cadena = flujo.readUTF();
                    
                    System.out.println("Recibida del cliente: "+cadena);
                    estado_red(true);
                    
                    if(cadena.equals("0")){
                        verDatosPuerto.setText("Se recibe del cliente: "+cadena);
                        send_rs232(cadena);
                    }else{
                        verDatosPuerto.setText("Se recibe del cliente: "+cadena);
                        send_rs232(cadena);
                    }
                    
                    if(cadena.equals("F")){
                        active=false;
                        System.out.println("Servidor Desconectado");
                        verDatosPuerto.setText("Se recibe del cliente: "+cadena);
                        skCliente.close();
                    }
                    
                }
            }
                catch( Exception e) {
                        System.out.println( e.getMessage() );
                        }
        }

        private void estado_red(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comSelect;
    private javax.swing.JButton enviarDato;
    private javax.swing.JButton enviarPuerto;
    private javax.swing.JTextArea estadoRS232;
    private javax.swing.JTextField inCorreo;
    private javax.swing.JTextField inEstado;
    private javax.swing.JTextField inID;
    private javax.swing.JTextField inNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField puertoInput;
    private javax.swing.JLabel status;
    private javax.swing.JLabel status1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea verDatosPuerto;
    // End of variables declaration//GEN-END:variables
}
