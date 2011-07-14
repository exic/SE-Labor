

public class ObserverGUI extends javax.swing.JFrame implements IObserver {
	
	private ModelSubject ms;
	private Controller ct;
	

	private static final long serialVersionUID = 1L;
	
	public ObserverGUI(ModelSubject m) {
		this.initComponents();
		this.ms = m;
		this.ms.attach(this);
		this.ct = new Controller(m, this);
	}



	public void update(Subject o) 
	{  
		System.out.println("Update received from Subject, state changed to : " + o.getState());
        if (o.getState() == ModelSubject.State_Wuerfeln) {
        	jLabel1.setText("Wuerfeln");
        	jLabel3.setText(Integer.toString(ms.getGewuerfelteZahl()));
        }
        if (o.getState() == ModelSubject.State_Ziehen) {
        	jLabel1.setText("Ziehen");
        	jLabel3.setText(Integer.toString(ms.getGewuerfelteZahl()));
        }
        if (o.getState() == ModelSubject.State_Fertig) {
        	jLabel1.setText("Fertig");
        }
	
	}

	
	
	
	
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("wuerfeln");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ziehen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("fertig");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Wuerfeln");

        jLabel2.setText("gewuerfelt:");

        jLabel3.setText(" ");

        jLabel4.setText("Status:");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Button1 " + evt.toString());
        ct.controlActionStates(evt.getActionCommand());
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Button2");
        ct.controlActionStates(evt.getActionCommand());
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
           System.out.println("Button3 ");
           ct.controlActionStates(evt.getActionCommand());
    }

	
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;


}

		


