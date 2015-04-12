package GUIView;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

import Controller.MatchCont;

/**Group Names: Tyler Glass, Michael House, Holly Ruyle, Phu Hoang    
 * Project Part: GUI Display - Matchmaking View
 * Program Title: Tic-tac-toe Game 
 * Course: CSCE 320 - Software Engineering
 * Date: February 23, 2015
 * Language and Compiler: Java written in eclipse and Netbeans
 * Sources: CSCE 320 references - Trivial Java Example
*/

public class MatchMaking extends javax.swing.JFrame {

	 /**
     * Creates new form MatchMaking
     */
    public MatchMaking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
    	ArrayList<String> list = new ArrayList<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        onlineList = new javax.swing.JList(list.toArray());
        inviteButton = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatBoxTA = new javax.swing.JTextArea();
        msgTF = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        backMenu = new javax.swing.JMenu();
        logOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lobby");
        setResizable(false);

        onlineList.setBackground(new java.awt.Color(51, 51, 51));
        onlineList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Online Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        onlineList.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        onlineList.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(onlineList);

        inviteButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inviteButton.setText("Invite ");
        inviteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inviteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviteButtonActionPerformed(evt);
            }
        });

        randomButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        randomButton.setText("Match Making");
        randomButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });

        chatBoxTA.setEditable(false);
        chatBoxTA.setBackground(new java.awt.Color(51, 51, 51));
        chatBoxTA.setColumns(20);
        chatBoxTA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        chatBoxTA.setForeground(new java.awt.Color(255, 255, 255));
        chatBoxTA.setRows(5);
        chatBoxTA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "System Chat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        jScrollPane2.setViewportView(chatBoxTA);

        msgTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        msgTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgTFActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic-tac-toe-free1.jpg"))); // NOI18N

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Abstract-Green-Background-Wallpaper-Vector-Graphic2.jpg"))); // NOI18N

        backMenu.setText("Menu");

        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        backMenu.add(logOut);

        jMenuBar1.add(backMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inviteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(randomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(msgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(inviteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(randomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(image))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(msgTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
   //DefaultListModel list = new DefaultListModel();
    private void msgTFActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    	
    	//list.addElement(msgTF.getText()+"\n");
    	//msgTF.setText("");
    	//onlineList.setModel(list);
    	
    	controller.updateUserInfo("chat_" + msgTF.getText());
    	controller.listen("chat");
    	msgTF.setText("");
    }                                     

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        controller.listen("logOut");
    }                                            

    private void inviteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                     

    /**
     * Set the controller to the matchmaking view
     * @param controller
     */
    public void setController(MatchCont controller){
    	this.controller = controller;
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
            java.util.logging.Logger.getLogger(MatchMaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchMaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchMaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchMaking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchMaking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify          
    private javax.swing.JLabel background;
    private javax.swing.JTextArea chatBoxTA;
    private javax.swing.JLabel image;
    private javax.swing.JButton inviteButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu backMenu;
    private javax.swing.JTextField msgTF;
    private javax.swing.JList onlineList;
    private javax.swing.JButton randomButton;
    private javax.swing.JMenuItem logOut;
    private MatchCont controller;
    // End of variables declaration//GEN-END:variables
}
