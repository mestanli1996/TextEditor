/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreader;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
public class TextReaderGUI extends javax.swing.JFrame {

    
    private final static String newline = "\n";
    Font font = null;
     String []List={"Verdana","Arial Black","Comic Sans MS"};
     JComboBox combo=new JComboBox(List);
    String []size={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
        JComboBox comboSize=new JComboBox(size);
    Color []color={Color.BLACK,Color.BLUE,Color.GREEN};
        JComboBox colorBox=new JComboBox(color);
        
        
    byte[] encryptionKey = "MZygpewJsCpRrfOr".getBytes(StandardCharsets.UTF_8);
       
   AdvancedEncryptionStandard advancedEncryptionStandard = new AdvancedEncryptionStandard(encryptionKey);
     
    public TextReaderGUI() {
        initComponents();
    }
 
    class MyHighlightPainter extends DefaultHighlighter.DefaultHighlightPainter{
       public MyHighlightPainter(Color color){
           super(color);
           
       }
       
      
    }
      Highlighter.HighlightPainter myHighlightPainter=new MyHighlightPainter(Color.red);
        public void highligh(JTextComponent textComp,String pattern){
            
            try{
            
               Highlighter hilite=textComp.getHighlighter();
               Document doc=textComp.getDocument();
               String text=doc.getText(0,doc.getLength()); 
               int pos=0;
           while((pos=text.toUpperCase().indexOf(pattern.toUpperCase(),pos) )>=0 ){
           hilite.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
           
           pos+=pattern.length();
           }
           }catch(Exception e){
           }
            
        }
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ASCII = new javax.swing.JButton();
        Encryption = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        choose = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        ColorChooser = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Font = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter a word for changing");

        ASCII.setText("ASCII");
        ASCII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ASCIIActionPerformed(evt);
            }
        });

        Encryption.setText("Encrypt");
        Encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptionActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        choose.setText("Choose a txt file");
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });
        jMenu1.add(choose);

        Save.setText("Save as");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jMenu1.add(Save);

        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Search");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem1.setText("Clear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        ColorChooser.setText("Color");
        ColorChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorChooserActionPerformed(evt);
            }
        });
        jMenu2.add(ColorChooser);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Format");

        jMenuItem2.setText("Size");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        Font.setText("Font");
        Font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontActionPerformed(evt);
            }
        });
        jMenu3.add(Font);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Encryption, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(ASCII, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ASCII, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
       JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       chooser.setCurrentDirectory(f);
       String filename=f.getAbsolutePath();
       String inputLine="";
       try{
           FileReader reader=new FileReader(filename);
           BufferedReader br=new BufferedReader(reader);
           
           while( ( inputLine = br.readLine()) != null){
              jTextArea1.append(inputLine+"\n");
     }
                
           br.close();
           jTextArea1.requestFocus();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_chooseActionPerformed

    private void FontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontActionPerformed
       
        combo.setEditable(true);
         JOptionPane.showMessageDialog(null,combo,"Select Type of TEXT",JOptionPane.QUESTION_MESSAGE);
         String txt=jTextArea1.getText();
         font = new Font(combo.getSelectedItem().toString(),font.BOLD,12);
         jTextArea1.setFont(font);
         
            
    }//GEN-LAST:event_FontActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       jTextArea1.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        comboSize.setEditable(true);
        JOptionPane.showMessageDialog(null,comboSize,"Select size",JOptionPane.QUESTION_MESSAGE);
        int chSize=Integer.parseInt(comboSize.getSelectedItem().toString());
        font = new Font(combo.getSelectedItem().toString(),font.BOLD,chSize);
        jTextArea1.setFont(font);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ColorChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorChooserActionPerformed
        
      colorBox.setEditable(true);
        JOptionPane.showMessageDialog(null,colorBox,"Select color",JOptionPane.QUESTION_MESSAGE);
       
       jTextArea1.setForeground((Color) colorBox.getSelectedItem());
       
       
       
    }//GEN-LAST:event_ColorChooserActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String name=JOptionPane.showInputDialog("Insert a word");
        highligh(jTextArea1,name);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name=jTextArea1.getText();
        
        String newWord=JOptionPane.showInputDialog("Enter new word");
        name=name.replaceAll(jTextField1.getText(),newWord );
          jTextArea1.setText(name);      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ASCIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ASCIIActionPerformed
       int lines=jTextArea1.getLineCount();
      
       String s="";       
        StringBuilder binary=new StringBuilder();      
       for(int j=0;j<lines;j++){
       try{
        int start=jTextArea1.getLineStartOffset(j);
        int end = jTextArea1.getLineEndOffset(j);
          s=jTextArea1.getText(start,end-start);
       }
        catch(BadLocationException e){   
        }
         byte[] bytes=s.getBytes();
       
       for(byte b:bytes){
           int value=b;
           for(int i=0;i<8;i++){
               binary.append((value&128)==0?0:1);
               value<<=1;
           }
           binary.append(" ");
           
           }
      
       
       binary.append(newline);
       
       }
       
       
       jTextArea1.setText(binary.toString());
    }//GEN-LAST:event_ASCIIActionPerformed

    private void EncryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptionActionPerformed
        
        
        try {
           
            
            
           
            
            byte[] plainText = jTextArea1.getText().getBytes(StandardCharsets.UTF_8);
       
           
           byte[] cipherText = advancedEncryptionStandard.encrypt(plainText);
        
        jTextArea1.setText(new String(cipherText));
        
        } 
        
        
        
        catch (Exception ex) {
            Logger.getLogger(TextReaderGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
    }//GEN-LAST:event_EncryptionActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String filename;
        JFrame parentFrame = new JFrame();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");

        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try{
                File fileToSave = fileChooser.getSelectedFile();
                filename=fileToSave.getAbsolutePath();
                FileWriter yazici = new FileWriter(fileToSave,true);
                BufferedWriter yaz = new BufferedWriter(yazici);
                yaz.write(jTextArea1.getText());
                yaz.close();}
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(TextReaderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextReaderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextReaderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextReaderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextReaderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ASCII;
    private javax.swing.JMenuItem ColorChooser;
    private javax.swing.JButton Encryption;
    private javax.swing.JMenuItem Font;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem choose;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
