/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Administrador;
import Model.Validacao;
import DAO.AdministradorDAO;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Pedro Maschio
 */
public class F_CadastroAdministrador extends javax.swing.JFrame {
    AdministradorDAO administradorDAO;
    
    public void mascaraCampos(){
        try {
            MaskFormatter mascaraNascimento = new MaskFormatter("##/##/####");
            MaskFormatter mascaraCNPJ = new MaskFormatter("##.###.###/####-##");
            mascaraNascimento.install(f_nascimento);
            mascaraCNPJ.install(f_CNPJ);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
    /**
     * Creates new form CadastroLocatario
     */
    public F_CadastroAdministrador() {
        initComponents();
        mascaraCampos();
        administradorDAO = new AdministradorDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        f_nome = new javax.swing.JTextField();
        f_nomeCompanhia = new javax.swing.JTextField();
        f_endereco = new javax.swing.JTextField();
        f_email = new javax.swing.JTextField();
        f_senha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        f_nascimento = new javax.swing.JFormattedTextField();
        f_CNPJ = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Administrador");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Administrador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Rent Car");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Proprietário (a):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CNPJ:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Data de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nome Fantasia da Companhia:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Endereço da Companhia");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("E-mail:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Senha:");

        f_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f_nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_nomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_nomeFocusLost(evt);
            }
        });

        f_nomeCompanhia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f_nomeCompanhia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_nomeCompanhiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_nomeCompanhiaFocusLost(evt);
            }
        });

        f_endereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f_endereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_enderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_enderecoFocusLost(evt);
            }
        });

        f_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_emailFocusLost(evt);
            }
        });

        f_senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f_senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_senhaFocusLost(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(21, 190, 4));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("CADASTRAR ADMINISTRADOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        f_nascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f_nascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_nascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_nascimentoFocusLost(evt);
            }
        });

        f_CNPJ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f_CNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                f_CNPJFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                f_CNPJFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(f_nomeCompanhia)
                    .addComponent(f_endereco)
                    .addComponent(f_email)
                    .addComponent(f_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_CNPJ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(309, 309, 309))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(222, 222, 222))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(f_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(f_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(f_nomeCompanhia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(f_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(f_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(f_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        if(Validacao.validarCNPJ(f_CNPJ.getText())){
            if(!administradorDAO.buscaCNPJ(f_CNPJ.getText())){
                if(Validacao.validarEmail(f_email.getText().trim())){
                    Administrador a = new Administrador();
                    a.setNome(f_nome.getText().trim());
                    a.setNascimento(f_nascimento.getText().trim());
                    a.setCNPJ(f_CNPJ.getText().trim());
                    a.setNomeCompanhia(f_nomeCompanhia.getText().trim());
                    a.setEnderecoCompanhia(f_endereco.getText().trim());
                    a.setEmail(f_email.getText().trim());
                    String senha = new String(f_senha.getPassword());
                    a.setSenha(senha);
        
                    administradorDAO.cadastro(a);
                    JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Informe um e-mail válido!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Um administrador já se encontra cadastrado no sistema sob esse mesmo CNPJ!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informe um CNPJ válido!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void f_nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_nomeFocusLost
        if(f_nome.getText().trim().equals("")){
            f_nome.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }         // TODO add your handling code here:
    }//GEN-LAST:event_f_nomeFocusLost

    private void f_CNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_CNPJFocusLost
        if(f_CNPJ.getText().equals("  .   .   /    -  ")){
            f_CNPJ.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }         // TODO add your handling code here:
    }//GEN-LAST:event_f_CNPJFocusLost

    private void f_nascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_nascimentoFocusLost
        if(f_nascimento.getText().equals("  /  /    ")){
            f_nascimento.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }         // TODO add your handling code here:
    }//GEN-LAST:event_f_nascimentoFocusLost

    private void f_nomeCompanhiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_nomeCompanhiaFocusLost
        if(f_nomeCompanhia.getText().trim().equals("")){
            f_nomeCompanhia.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_f_nomeCompanhiaFocusLost

    private void f_enderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_enderecoFocusLost
        if(f_endereco.getText().trim().equals("")){
            f_endereco.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }          // TODO add your handling code here:
    }//GEN-LAST:event_f_enderecoFocusLost

    private void f_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_emailFocusLost
        if(f_email.getText().trim().equals("")){
            f_email.setBackground(java.awt.Color.getHSBColor(0, 79, 66));
        }          // TODO add your handling code here:
    }//GEN-LAST:event_f_emailFocusLost

    private void f_senhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_senhaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_f_senhaFocusLost

    private void f_nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_nomeFocusGained
        f_nome.setBackground(java.awt.Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_f_nomeFocusGained

    private void f_CNPJFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_CNPJFocusGained
        f_CNPJ.setBackground(java.awt.Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_f_CNPJFocusGained

    private void f_nascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_nascimentoFocusGained
        f_nascimento.setBackground(java.awt.Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_f_nascimentoFocusGained

    private void f_nomeCompanhiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_nomeCompanhiaFocusGained
        f_nomeCompanhia.setBackground(java.awt.Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_f_nomeCompanhiaFocusGained

    private void f_enderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_enderecoFocusGained
        f_endereco.setBackground(java.awt.Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_f_enderecoFocusGained

    private void f_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f_emailFocusGained
        f_email.setBackground(java.awt.Color.WHITE);        // TODO add your handling code here:
    }//GEN-LAST:event_f_emailFocusGained

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
            java.util.logging.Logger.getLogger(F_CadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_CadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_CadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_CadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_CadastroAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField f_CNPJ;
    private javax.swing.JTextField f_email;
    private javax.swing.JTextField f_endereco;
    private javax.swing.JFormattedTextField f_nascimento;
    private javax.swing.JTextField f_nome;
    private javax.swing.JTextField f_nomeCompanhia;
    private javax.swing.JPasswordField f_senha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
