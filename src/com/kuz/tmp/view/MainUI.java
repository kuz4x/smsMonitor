package com.kuz.tmp.view;

import com.kuz.tmp.control.MainUIEvent;
import com.kuz.tmp.control.MainUIListener;

/**
 *
 * @author Kasun Amarasena
 */
public class MainUI extends javax.swing.JFrame {
    
    private MainUIListener mainListener;
    private MainUIEvent mainEvent;

    /**
     * Creates Main UI of the SMS monitor application
     */
    public MainUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        MessageDialogBox.setParentComponent(MainUI.this);
        datePanel1.setMinDate();
        datePanel2.setCurrentDate();
    }

    /**
     *  
     * @param listener MainUIListener
     */
    public void setListener(MainUIListener listener) {
        this.mainListener = listener;
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
        jTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        datePanel1 = new com.kuz.tmp.old.view.DatePanel();
        datePanel2 = new com.kuz.tmp.old.view.DatePanel();
        jLabel1 = new javax.swing.JLabel();
        filterButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        olderButton = new javax.swing.JButton();
        newerButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        connectMenuItem = new javax.swing.JMenuItem();
        disconnectMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SMS Monitor 1.0v");
        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(748, 560));
        setResizable(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(450, 410));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " From", " Message", "         Date", "        Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setMinimumSize(new java.awt.Dimension(610, 200));
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setMinWidth(120);
            jTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable.getColumnModel().getColumn(0).setMaxWidth(150);
            jTable.getColumnModel().getColumn(2).setMinWidth(90);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable.getColumnModel().getColumn(2).setMaxWidth(90);
            jTable.getColumnModel().getColumn(3).setMinWidth(95);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(95);
            jTable.getColumnModel().getColumn(3).setMaxWidth(95);
        }

        jTextArea.setEditable(false);
        jTextArea.setColumns(20);
        jTextArea.setRows(4);
        jScrollPane2.setViewportView(jTextArea);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search/Filter messages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        jLabel1.setText("   To");

        filterButton.setText("Filter");

        resetButton.setText("Reset");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(filterButton)
                                    .addComponent(resetButton))
                                .addComponent(datePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statusLabel.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 0, 0));
        statusLabel.setText("STATUS: DISCONNECTED");

        deleteButton.setText("Delete Messages");
        deleteButton.setEnabled(false);

        olderButton.setText("Older >>");
        olderButton.setToolTipText("");
        olderButton.setEnabled(false);

        newerButton.setText("<< Newer");
        newerButton.setEnabled(false);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        connectMenuItem.setText("Connect");
        fileMenu.add(connectMenuItem);

        disconnectMenuItem.setText("Disconnect");
        fileMenu.add(disconnectMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(newerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(olderButton))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusLabel)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(olderButton)
                            .addComponent(newerButton))
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem connectMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private com.kuz.tmp.old.view.DatePanel datePanel1;
    private com.kuz.tmp.old.view.DatePanel datePanel2;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuItem disconnectMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton filterButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton newerButton;
    private javax.swing.JButton olderButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

}
