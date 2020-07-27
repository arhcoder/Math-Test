package Clases;

// Desarrollador: Alejandro Ramos Herrera (@arhcoder).
// Licencia: GNU GPLv3.
// Desarrollado en febrero de 2019.
// Tiempo de desarrollo: 8 días.
// Propósito: Práctica y Entretenimiento.

public class Multiplicaciones extends javax.swing.JFrame {
    
    public Multiplicaciones(){
        initComponents();
        setTitle("Tablas de Multiplicar");
        setLocationRelativeTo(null);
        setResizable(false);
        Dlg_Guardar.setLocationRelativeTo(null);
        Dlg_Puntajes.setLocationRelativeTo(null);
    }
    
    int Tabla = 1;
    int Preguntas = 10;
    int Respuesta = 0;
    int Aciertos = 0;
    int Errores = 0;
    int Número = 0;
    double Calificación = 0;
    
    double PreguntasD = 10;
    double AciertosD = 0; 
    double CalificaciónD = 0;
    String CalificaciónS = "";
    
    boolean Aleatoriedad;
    boolean Coloreado;
    String RespuestaS;
    
    String Tiempo;
    int M, S, CS;
    int Limite = 10;
    
    /*
    CS++;
    if(CS==100)
    {
    CS = 0;
    S++;
    }
    if(S==60)
    {
    S = 0;
    M++;
    }
    if(M==60)
    {
    M = 0;
    }
    moverCronómetro();
    */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.setLocationRelativeTo(null);
        Dlg_Puntajes = new javax.swing.JDialog();
        Pnl_Dialog1 = new javax.swing.JPanel();
        Lbl_Puntajes = new javax.swing.JLabel();
        Btn_Cerrar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        this.setLocationRelativeTo(null);
        Dlg_Guardar = new javax.swing.JDialog();
        Pnl_Dialog = new javax.swing.JPanel();
        Lbl_Felicidades = new javax.swing.JLabel();
        Lbl_T_Aciertos = new javax.swing.JLabel();
        Lbl_N_Aciertos = new javax.swing.JLabel();
        Lbl_T_Errores = new javax.swing.JLabel();
        Lbl_N_Errores = new javax.swing.JLabel();
        Lbl_T_Tiempo = new javax.swing.JLabel();
        Lbl_N_Tiempo = new javax.swing.JLabel();
        Lbl_T_Calificación = new javax.swing.JLabel();
        Lbl_N_Calificación = new javax.swing.JLabel();
        Pnl_Botones = new javax.swing.JPanel();
        Txt_Nombre = new javax.swing.JTextField();
        Btn_Guardar_Puntaje = new javax.swing.JButton();
        Btn_Cerrar = new javax.swing.JButton();
        Lbl_N_Tabla = new javax.swing.JLabel();
        Lbl_T_Preguntas = new javax.swing.JLabel();
        Lbl_T_Tabla = new javax.swing.JLabel();
        Lbl_N_Preguntas = new javax.swing.JLabel();
        Pnl_Panel = new javax.swing.JPanel();
        Lbl_Titulo = new javax.swing.JLabel();
        Pnl_Preguntas = new javax.swing.JPanel();
        Cbx_Preguntas = new javax.swing.JComboBox<>();
        Pnl_Tabla = new javax.swing.JPanel();
        Cbx_Tabla = new javax.swing.JComboBox<>();
        Pnl_Comenzar = new javax.swing.JPanel();
        Btn_Comenzar = new javax.swing.JButton();
        Pnl_Operaciones = new javax.swing.JPanel();
        Lbl_Operación = new javax.swing.JLabel();
        Pnl_Controles = new javax.swing.JPanel();
        Btn_Siguiente = new javax.swing.JButton();
        Lbl_Tiempo = new javax.swing.JLabel();
        Lbl_Número = new javax.swing.JLabel();
        Pnl_Respuestas = new javax.swing.JPanel();
        Btn_Respuesta_1 = new javax.swing.JButton();
        Btn_Respuesta_2 = new javax.swing.JButton();
        Btn_Respuesta_3 = new javax.swing.JButton();
        Btn_Respuesta_4 = new javax.swing.JButton();
        Lbl_Aciertos = new javax.swing.JLabel();
        Lbl_Errores = new javax.swing.JLabel();
        Lbl_Simbolo_Aciertos = new javax.swing.JLabel();
        Lbl_Simbolo_Errores = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Btn_Puntajes = new javax.swing.JButton();

        Dlg_Puntajes.setTitle("Guardar Puntaje");
        Dlg_Puntajes.setResizable(false);
        Dlg_Puntajes.setSize(new java.awt.Dimension(600, 500));
        Dlg_Puntajes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Dialog1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Puntajes.setFont(new java.awt.Font("Stencil", 0, 35)); // NOI18N
        Lbl_Puntajes.setForeground(new java.awt.Color(82, 0, 97));
        Lbl_Puntajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Puntajes.setText("Puntajes");
        Pnl_Dialog1.add(Lbl_Puntajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 90));

        Btn_Cerrar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Cerrar1.setText("Cerrar");
        Btn_Cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cerrar1ActionPerformed(evt);
            }
        });
        Pnl_Dialog1.add(Btn_Cerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 110, 30));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Todas", "Alejandro Ramos",  new Double(10.0), "00:00:00"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Top", "Tabla", "Nombre", "Calificación", "Tiempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        Pnl_Dialog1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 560, 380));

        Dlg_Puntajes.getContentPane().add(Pnl_Dialog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        Dlg_Guardar.setTitle("Guardar Puntaje");
        Dlg_Guardar.setResizable(false);
        Dlg_Guardar.setSize(new java.awt.Dimension(400, 510));
        Dlg_Guardar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Dialog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Felicidades.setFont(new java.awt.Font("Stencil", 0, 35)); // NOI18N
        Lbl_Felicidades.setForeground(new java.awt.Color(82, 0, 97));
        Lbl_Felicidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Felicidades.setText("Felicidades!!!");
        Pnl_Dialog.add(Lbl_Felicidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        Lbl_T_Aciertos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_T_Aciertos.setForeground(new java.awt.Color(0, 153, 51));
        Lbl_T_Aciertos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_T_Aciertos.setText("√ Aciertos:");
        Pnl_Dialog.add(Lbl_T_Aciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 180, 20));

        Lbl_N_Aciertos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_N_Aciertos.setForeground(new java.awt.Color(0, 153, 51));
        Lbl_N_Aciertos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_N_Aciertos.setText("00");
        Pnl_Dialog.add(Lbl_N_Aciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 90, 20));

        Lbl_T_Errores.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_T_Errores.setForeground(new java.awt.Color(204, 0, 0));
        Lbl_T_Errores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_T_Errores.setText("X Errores:");
        Pnl_Dialog.add(Lbl_T_Errores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 180, 20));

        Lbl_N_Errores.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_N_Errores.setForeground(new java.awt.Color(204, 0, 0));
        Lbl_N_Errores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_N_Errores.setText("00");
        Pnl_Dialog.add(Lbl_N_Errores, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 90, 20));

        Lbl_T_Tiempo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_T_Tiempo.setForeground(new java.awt.Color(41, 0, 126));
        Lbl_T_Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_T_Tiempo.setText("°  Tiempo:");
        Pnl_Dialog.add(Lbl_T_Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 180, 20));

        Lbl_N_Tiempo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_N_Tiempo.setForeground(new java.awt.Color(41, 0, 126));
        Lbl_N_Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_N_Tiempo.setText("00:00:00");
        Pnl_Dialog.add(Lbl_N_Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 110, 20));

        Lbl_T_Calificación.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_T_Calificación.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_T_Calificación.setText("* Calificación:");
        Pnl_Dialog.add(Lbl_T_Calificación, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 180, 20));

        Lbl_N_Calificación.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_N_Calificación.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_N_Calificación.setText("8.0");
        Pnl_Dialog.add(Lbl_N_Calificación, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 90, 20));

        Pnl_Botones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escribe tu nombre:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        Pnl_Botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txt_Nombre.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Nombre.setText("Alejandro Ramos");
        Txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyReleased(evt);
            }
        });
        Pnl_Botones.add(Txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 50));

        Btn_Guardar_Puntaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Guardar_Puntaje.setText("Guardar Puntaje");
        Btn_Guardar_Puntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar_PuntajeActionPerformed(evt);
            }
        });
        Pnl_Botones.add(Btn_Guardar_Puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, 30));

        Btn_Cerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_Cerrar.setText("Cerrar");
        Btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CerrarActionPerformed(evt);
            }
        });
        Pnl_Botones.add(Btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, 30));

        Pnl_Dialog.add(Pnl_Botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, 130));

        Lbl_N_Tabla.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_N_Tabla.setForeground(new java.awt.Color(102, 0, 102));
        Lbl_N_Tabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_N_Tabla.setText("00");
        Pnl_Dialog.add(Lbl_N_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 90, 20));

        Lbl_T_Preguntas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_T_Preguntas.setForeground(new java.awt.Color(255, 163, 0));
        Lbl_T_Preguntas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_T_Preguntas.setText("# Preguntas");
        Pnl_Dialog.add(Lbl_T_Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, 20));

        Lbl_T_Tabla.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_T_Tabla.setForeground(new java.awt.Color(102, 0, 102));
        Lbl_T_Tabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_T_Tabla.setText("+ Tabla:");
        Pnl_Dialog.add(Lbl_T_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 180, 20));

        Lbl_N_Preguntas.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_N_Preguntas.setForeground(new java.awt.Color(255, 163, 0));
        Lbl_N_Preguntas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lbl_N_Preguntas.setText("00");
        Pnl_Dialog.add(Lbl_N_Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 90, 20));

        Dlg_Guardar.getContentPane().add(Pnl_Dialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Titulo.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        Lbl_Titulo.setForeground(new java.awt.Color(41, 0, 126));
        Lbl_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Titulo.setText("Multiplicaciones");
        Pnl_Panel.add(Lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 70));

        Pnl_Preguntas.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione Cantidad:"));
        Pnl_Preguntas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cbx_Preguntas.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Cbx_Preguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 Preguntas", "15 Preguntas", "20 Preguntas", "25 Preguntas", "30 Preguntas", "35 Preguntas", "40 Preguntas", "45 Preguntas", "50 Preguntas", "60 Preguntas", "70 Preguntas", "80 Preguntas" }));
        Pnl_Preguntas.add(Cbx_Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 40));

        Pnl_Panel.add(Pnl_Preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 180, 90));

        Pnl_Tabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione Tabla:"));
        Pnl_Tabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cbx_Tabla.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Cbx_Tabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablas del 1-10", "Tablas del 1-12", "Tabla del 1", "Tabla del 2", "Tabla del 3", "Tabla del 4", "Tabla del 5", "Tabla del 6", "Tabla del 7", "Tabla del 8", "Tabla del 9", "Tabla del 10", "Tabla del 11", "Tabla del 12" }));
        Pnl_Tabla.add(Cbx_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, 40));

        Pnl_Panel.add(Pnl_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 90));

        Pnl_Comenzar.setBorder(javax.swing.BorderFactory.createTitledBorder("Comenzar Trivia:"));
        Pnl_Comenzar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Comenzar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Comenzar.setText("Comenzar!");
        Btn_Comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ComenzarActionPerformed(evt);
            }
        });
        Pnl_Comenzar.add(Btn_Comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 40));

        Pnl_Panel.add(Pnl_Comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, 90));

        Pnl_Operaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pnl_Operaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lbl_Operación.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        Lbl_Operación.setForeground(new java.awt.Color(102, 0, 102));
        Lbl_Operación.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pnl_Operaciones.add(Lbl_Operación, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 60));

        Pnl_Panel.add(Pnl_Operaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 470, 80));

        Pnl_Controles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pnl_Controles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Siguiente.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Siguiente.setText("Siguiente");
        Btn_Siguiente.setEnabled(false);
        Btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SiguienteActionPerformed(evt);
            }
        });
        Pnl_Controles.add(Btn_Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 110, 50));

        Lbl_Tiempo.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Lbl_Tiempo.setForeground(new java.awt.Color(41, 0, 126));
        Lbl_Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Tiempo.setText("00:00:00");
        Pnl_Controles.add(Lbl_Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 190, 90));

        Lbl_Número.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Lbl_Número.setForeground(new java.awt.Color(255, 163, 0));
        Lbl_Número.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Número.setText("00");
        Pnl_Controles.add(Lbl_Número, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 90));

        Pnl_Panel.add(Pnl_Controles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 490, 90));

        Pnl_Respuestas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Pnl_Respuestas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Respuesta_1.setBackground(new java.awt.Color(204, 188, 188));
        Btn_Respuesta_1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Respuesta_1.setText("...");
        Btn_Respuesta_1.setEnabled(false);
        Btn_Respuesta_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Respuesta_1ActionPerformed(evt);
            }
        });
        Pnl_Respuestas.add(Btn_Respuesta_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 190, 40));

        Btn_Respuesta_2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Respuesta_2.setText("...");
        Btn_Respuesta_2.setEnabled(false);
        Btn_Respuesta_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Respuesta_2ActionPerformed(evt);
            }
        });
        Pnl_Respuestas.add(Btn_Respuesta_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, 190, 40));

        Btn_Respuesta_3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Respuesta_3.setText("...");
        Btn_Respuesta_3.setEnabled(false);
        Btn_Respuesta_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Respuesta_3ActionPerformed(evt);
            }
        });
        Pnl_Respuestas.add(Btn_Respuesta_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 95, 190, 40));

        Btn_Respuesta_4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Respuesta_4.setText("...");
        Btn_Respuesta_4.setEnabled(false);
        Btn_Respuesta_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Respuesta_4ActionPerformed(evt);
            }
        });
        Pnl_Respuestas.add(Btn_Respuesta_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 135, 190, 40));

        Pnl_Panel.add(Pnl_Respuestas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 270, 190));

        Lbl_Aciertos.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Lbl_Aciertos.setForeground(new java.awt.Color(0, 153, 51));
        Lbl_Aciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Aciertos.setText("0");
        Pnl_Panel.add(Lbl_Aciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, 50));
        Lbl_Aciertos.getAccessibleContext().setAccessibleDescription("");

        Lbl_Errores.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Lbl_Errores.setForeground(new java.awt.Color(204, 0, 0));
        Lbl_Errores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Errores.setText("0");
        Pnl_Panel.add(Lbl_Errores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 70, 70));

        Lbl_Simbolo_Aciertos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_Simbolo_Aciertos.setForeground(new java.awt.Color(0, 153, 51));
        Lbl_Simbolo_Aciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Simbolo_Aciertos.setText("Aciertos:");
        Pnl_Panel.add(Lbl_Simbolo_Aciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 110, 40));

        Lbl_Simbolo_Errores.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Lbl_Simbolo_Errores.setForeground(new java.awt.Color(204, 0, 0));
        Lbl_Simbolo_Errores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Simbolo_Errores.setText("Errores:");
        Pnl_Panel.add(Lbl_Simbolo_Errores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 90, 40));

        Btn_Guardar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.setEnabled(false);
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        Pnl_Panel.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 110, 50));

        Btn_Salir.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Salir.setText("Salir");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        Pnl_Panel.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 110, 50));

        Btn_Puntajes.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Btn_Puntajes.setText("Puntajes");
        Btn_Puntajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PuntajesActionPerformed(evt);
            }
        });
        Pnl_Panel.add(Btn_Puntajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 110, 50));

        getContentPane().add(Pnl_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    public void moverCronómetro(){
        //Tiempo = (M<=9?"0":"")+M+":"+(S<=9?"0":"")+S+":"+(CS<=9?"0":"")+CS;
        //Lbl_Tiempo.setText(Tiempo);
    }
    
    public void comenzarCronómetro(){
        //Cronómetro.start();
    }
    
    public void detenerCronómetro(){
        //Cronómetro.stop();
    }
    */
    
    private void Btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SiguienteActionPerformed
    Btn_Guardar.setEnabled(false);
    Btn_Puntajes.setEnabled(false);
    
    if(Número<Preguntas)
    {
    //Correr Cronómetro //
        // AQUÍ SE HACE PARA INICIAR EL CRONÓMETRO DESDE CERO //
        //comenzarCronómetro();
        Coloreado = false;
        Número++;
        Btn_Siguiente.setText("Siguiente");
        Btn_Respuesta_1.setBackground(new java.awt.Color(204, 188, 188));
        Btn_Respuesta_2.setBackground(new java.awt.Color(204, 188, 188));
        Btn_Respuesta_3.setBackground(new java.awt.Color(204, 188, 188));
        Btn_Respuesta_4.setBackground(new java.awt.Color(204, 188, 188));
        String[] Pregunta = new String[6];
        int A = 0;
        int B = 0;
        int C = 0;
        int RB;
        int RC;
        int RD;
        if(Número<10)
        {
            Lbl_Número.setText("0"+Número);
        }
        else
        {
            Lbl_Número.setText(""+Número);
        }

        // GENERA PREGÚNTA //
            if(Aleatoriedad == true)
            {
                A = (int) (Math.random() * Limite) + 1;
            }
            else
            {
                A = Tabla;
                Limite = 10;
            }
            B = (int) (Math.random() * Limite) + 1;
            
            Btn_Siguiente.setEnabled(false);
            Btn_Respuesta_1.setEnabled(true);
            Btn_Respuesta_2.setEnabled(true);
            Btn_Respuesta_3.setEnabled(true);
            Btn_Respuesta_4.setEnabled(true);

        // GENERA RESPUESTAS //
            Respuesta = A * B;
            RespuestaS = Integer.toString(Respuesta);
            Pregunta[0] = A+" x "+B;
            Lbl_Operación.setText(Pregunta[0]);
            Pregunta[1] = Integer.toString(Respuesta);
            do
            {
                C = (int) (Math.random() * 12) + 1;
                RB = A * C;
                Pregunta[2] = Integer.toString(RB);
            }
            while(C == B);
            do
            {
                C = (int) (Math.random() * 12) + 1;
                RC = A * C;
                Pregunta[3] = Integer.toString(RC);
            }
            while(C == B || RC == RB);
            do
            {
                C = (int) (Math.random() * 12) + 1;
                RD = A * C;
                Pregunta[4] = Integer.toString(RD);
            }
            while(C == B || RC == RB || RD == RC || RD == RB);

        // ORDENAR RESPUESTAS //
            int Correcta = (int) (Math.random() * 4) + 1;
            switch(Correcta)
            {
                case 1:
                    Btn_Respuesta_1.setText(Pregunta[1]);
                    Btn_Respuesta_2.setText(Pregunta[2]);
                    Btn_Respuesta_3.setText(Pregunta[3]);
                    Btn_Respuesta_4.setText(Pregunta[4]);
                break;
                case 2:
                    Btn_Respuesta_2.setText(Pregunta[1]);
                    Btn_Respuesta_1.setText(Pregunta[4]);
                    Btn_Respuesta_3.setText(Pregunta[2]);
                    Btn_Respuesta_4.setText(Pregunta[3]);
                break;
                case 3:
                    Btn_Respuesta_3.setText(Pregunta[1]);
                    Btn_Respuesta_1.setText(Pregunta[2]);
                    Btn_Respuesta_2.setText(Pregunta[4]);
                    Btn_Respuesta_4.setText(Pregunta[3]);
                break;
                case 4:
                    Btn_Respuesta_4.setText(Pregunta[1]);
                    Btn_Respuesta_1.setText(Pregunta[3]);
                    Btn_Respuesta_3.setText(Pregunta[4]);
                    Btn_Respuesta_2.setText(Pregunta[2]);
                break;
            }
        }
    else
    {
    // DETENER CRONÓMETRO //
        //AQUÍ SE DETIENE EL CRONÓMETRO //
        //detenerCronómetro();
        Lbl_Operación.setText("¡¡¡TERMINASTE!!!");
        Cbx_Tabla.setEnabled(true);
        Btn_Comenzar.setEnabled(true);
        Cbx_Preguntas.setEnabled(true);
        Btn_Respuesta_1.setBackground(new java.awt.Color(0, 153, 51));
        Btn_Respuesta_2.setBackground(new java.awt.Color(0, 153, 51));
        Btn_Respuesta_3.setBackground(new java.awt.Color(0, 153, 51));
        Btn_Respuesta_4.setBackground(new java.awt.Color(0, 153, 51));
        Btn_Respuesta_1.setEnabled(false);
        Btn_Respuesta_2.setEnabled(false);
        Btn_Respuesta_3.setEnabled(false);
        Btn_Respuesta_4.setEnabled(false);
        Btn_Siguiente.setEnabled(false);
        
    //ABRIR VENTANA DE PUNTUACIÓN //
        Dlg_Guardar.setVisible(true);
        PreguntasD = Preguntas;
        AciertosD = Aciertos;
        CalificaciónD = ((AciertosD * 10) / PreguntasD);
        CalificaciónS = String.format("%.2f", CalificaciónD);
        System.out.println("Calificación: "+CalificaciónD+",  Aciertos: "+Aciertos);
        if(Cbx_Tabla.getSelectedItem().equals("Tablas del 1-10"))
        {
            Lbl_N_Tabla.setText("1-10");
        }
        else if(Cbx_Tabla.getSelectedItem().equals("Tablas del 1-12"))
        {
            Lbl_N_Tabla.setText("Todas");
        }
        else
        {
            String SelecciónT = (String) Cbx_Tabla.getSelectedItem();
            String SubstringT = SelecciónT.substring(10);
            Tabla = Integer.parseInt(SubstringT);
            Lbl_N_Tabla.setText(""+Tabla);
        }
        Lbl_N_Preguntas.setText(""+Preguntas);
        Lbl_N_Aciertos.setText(""+Aciertos);
        Lbl_N_Errores.setText(""+Errores);
        Lbl_N_Tiempo.setText(Lbl_Tiempo.getText());
        Lbl_N_Calificación.setText(""+CalificaciónS);
        Btn_Guardar.setEnabled(true);
        Btn_Puntajes.setEnabled(true);
    }
    }//GEN-LAST:event_Btn_SiguienteActionPerformed

    private void Btn_ComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ComenzarActionPerformed
    Btn_Comenzar.setEnabled(false);
    Btn_Guardar.setEnabled(false);
    Btn_Puntajes.setEnabled(false);
    Aciertos = 0;
    Errores = 0;
    Número = 0;
    Lbl_Aciertos.setText(""+Aciertos);
    Lbl_Errores.setText(""+Errores);
    Lbl_Número.setText("00");
    Lbl_Tiempo.setText("00:00:00");
    Coloreado = false;
    Btn_Respuesta_1.setBackground(new java.awt.Color(204, 188, 188));
    Btn_Respuesta_2.setBackground(new java.awt.Color(204, 188, 188));
    Btn_Respuesta_3.setBackground(new java.awt.Color(204, 188, 188));
    Btn_Respuesta_4.setBackground(new java.awt.Color(204, 188, 188));
    Btn_Respuesta_1.setEnabled(false);
    Btn_Respuesta_2.setEnabled(false);
    Btn_Respuesta_3.setEnabled(false);
    Btn_Respuesta_4.setEnabled(false);
    Lbl_Operación.setText("¡¿LISTO?!");
    Btn_Respuesta_1.setText("...");
    Btn_Respuesta_2.setText("...");
    Btn_Respuesta_3.setText("...");
    Btn_Respuesta_4.setText("...");
    Btn_Siguiente.setText("Listo!");
    
    if(Cbx_Tabla.getSelectedItem().equals("Tablas del 1-10"))
    {
        Aleatoriedad = true;
        Limite = 10;
    }
    else if(Cbx_Tabla.getSelectedItem().equals("Tablas del 1-12"))
    {
        Aleatoriedad = true;
        Limite = 12;
    }
    else
    {
        Aleatoriedad = false;
        String SelecciónT = (String) Cbx_Tabla.getSelectedItem();
        String SubstringT = SelecciónT.substring(10);
        Tabla = Integer.parseInt(SubstringT);
    }
    
    String SelecciónP = (String) Cbx_Preguntas.getSelectedItem();
    String SubstringP = SelecciónP.substring(0, 2);
    Preguntas = Integer.parseInt(SubstringP);
    Lbl_Aciertos.setText(""+Aciertos);
    Lbl_Errores.setText(""+Errores);
    
    Cbx_Tabla.setEnabled(false);
    Cbx_Preguntas.setEnabled(false);
    Btn_Siguiente.setEnabled(true);
    }//GEN-LAST:event_Btn_ComenzarActionPerformed

    private void Btn_Respuesta_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Respuesta_2ActionPerformed
    Btn_Siguiente.setEnabled(true);
    if(Coloreado == true)
    {
        // No hace nada //
    }
    else
    {
        if(Btn_Respuesta_2.getText().equals(RespuestaS))
            {
                Btn_Respuesta_2.setBackground(new java.awt.Color(0, 153, 51));
                Aciertos++;
                Lbl_Aciertos.setText(""+Aciertos);
                Coloreado = true;
            }
            else
            {
                Btn_Respuesta_2.setBackground(new java.awt.Color(204, 0, 0));
                Errores++;
                Lbl_Errores.setText(""+Errores);

                if(Btn_Respuesta_1.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_1.setBackground(new java.awt.Color(0, 153, 51));
                }
                else if(Btn_Respuesta_3.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_3.setBackground(new java.awt.Color(0, 153, 51));
                }
                if(Btn_Respuesta_4.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_4.setBackground(new java.awt.Color(0, 153, 51));
                }
                Coloreado = true;
            }
        }
    }//GEN-LAST:event_Btn_Respuesta_2ActionPerformed

    private void Btn_Respuesta_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Respuesta_3ActionPerformed
    Btn_Siguiente.setEnabled(true);
    if(Coloreado == true)
    {
        // No hace nada //
    }
    else
    {
        if(Btn_Respuesta_3.getText().equals(RespuestaS))
            {
                Btn_Respuesta_3.setBackground(new java.awt.Color(0, 153, 51));
                Aciertos++;
                Lbl_Aciertos.setText(""+Aciertos);
                Coloreado = true;
            }
            else
            {
                Btn_Respuesta_3.setBackground(new java.awt.Color(204, 0, 0));
                Errores++;
                Lbl_Errores.setText(""+Errores);

                if(Btn_Respuesta_1.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_1.setBackground(new java.awt.Color(0, 153, 51));
                }
                else if(Btn_Respuesta_2.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_2.setBackground(new java.awt.Color(0, 153, 51));
                }
                if(Btn_Respuesta_4.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_4.setBackground(new java.awt.Color(0, 153, 51));
                }
                Coloreado = true;
            }
        }
    }//GEN-LAST:event_Btn_Respuesta_3ActionPerformed

    private void Btn_Respuesta_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Respuesta_4ActionPerformed
    Btn_Siguiente.setEnabled(true);
    if(Coloreado == true)
    {
        // No hace nada //
    }
    else
    {
        if(Btn_Respuesta_4.getText().equals(RespuestaS))
            {
                Btn_Respuesta_4.setBackground(new java.awt.Color(0, 153, 51));
                Aciertos++;
                Lbl_Aciertos.setText(""+Aciertos);
                Coloreado = true;
            }
            else
            {
                Btn_Respuesta_4.setBackground(new java.awt.Color(204, 0, 0));
                Errores++;
                Lbl_Errores.setText(""+Errores);

                if(Btn_Respuesta_1.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_1.setBackground(new java.awt.Color(0, 153, 51));
                }
                else if(Btn_Respuesta_3.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_3.setBackground(new java.awt.Color(0, 153, 51));
                }
                if(Btn_Respuesta_2.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_2.setBackground(new java.awt.Color(0, 153, 51));
                }
                Coloreado = true;
            }
        }
    }//GEN-LAST:event_Btn_Respuesta_4ActionPerformed

    private void Btn_Respuesta_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Respuesta_1ActionPerformed
    Btn_Siguiente.setEnabled(true);
        if(Coloreado == true)
        {
            // No hace nada //
        }
        else
        {
            if(Btn_Respuesta_1.getText().equals(RespuestaS))
            {
                Btn_Respuesta_1.setBackground(new java.awt.Color(0, 153, 51));
                Aciertos++;
                Lbl_Aciertos.setText(""+Aciertos);
                Coloreado = true;
            }
            else
            {
                Btn_Respuesta_1.setBackground(new java.awt.Color(204, 0, 0));
                Errores++;
                Lbl_Errores.setText(""+Errores);

                if(Btn_Respuesta_1.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_1.setBackground(new java.awt.Color(0, 153, 51));
                }
                else if(Btn_Respuesta_3.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_3.setBackground(new java.awt.Color(0, 153, 51));
                }
                if(Btn_Respuesta_4.getText().equals(RespuestaS))
                {
                    Btn_Respuesta_4.setBackground(new java.awt.Color(0, 153, 51));
                }
                Coloreado = true;
            }
        }
    }//GEN-LAST:event_Btn_Respuesta_1ActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
    Dlg_Guardar.setVisible(true);
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Txt_NombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyReleased

    if(Txt_Nombre.getText().length()<=1)
    {
        Btn_Guardar_Puntaje.setEnabled(false);
        Pnl_Botones.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
        "Escribe tu nombre: (Al menos 2 Caractéres)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
        javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)));
    }
    else
    {
        Btn_Guardar_Puntaje.setEnabled(true);
    }
    }//GEN-LAST:event_Txt_NombreKeyReleased

    private void Btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CerrarActionPerformed
    Dlg_Guardar.dispose();
    }//GEN-LAST:event_Btn_CerrarActionPerformed

    private void Btn_Guardar_PuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar_PuntajeActionPerformed
    // Guardar Puntaje //
    Btn_Guardar.setEnabled(false);
    Dlg_Guardar.dispose();
    }//GEN-LAST:event_Btn_Guardar_PuntajeActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_PuntajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PuntajesActionPerformed
    // Mostrar Puntajes //
    Dlg_Puntajes.setVisible(true);
    }//GEN-LAST:event_Btn_PuntajesActionPerformed

    private void Btn_Cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cerrar1ActionPerformed
        Dlg_Puntajes.dispose();
    }//GEN-LAST:event_Btn_Cerrar1ActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Multiplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multiplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multiplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multiplicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multiplicaciones().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cerrar;
    private javax.swing.JButton Btn_Cerrar1;
    private javax.swing.JButton Btn_Comenzar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Guardar_Puntaje;
    private javax.swing.JButton Btn_Puntajes;
    private javax.swing.JButton Btn_Respuesta_1;
    private javax.swing.JButton Btn_Respuesta_2;
    private javax.swing.JButton Btn_Respuesta_3;
    private javax.swing.JButton Btn_Respuesta_4;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JButton Btn_Siguiente;
    private javax.swing.JComboBox<String> Cbx_Preguntas;
    private javax.swing.JComboBox<String> Cbx_Tabla;
    private javax.swing.JDialog Dlg_Guardar;
    private javax.swing.JDialog Dlg_Puntajes;
    private javax.swing.JLabel Lbl_Aciertos;
    private javax.swing.JLabel Lbl_Errores;
    private javax.swing.JLabel Lbl_Felicidades;
    private javax.swing.JLabel Lbl_N_Aciertos;
    private javax.swing.JLabel Lbl_N_Calificación;
    private javax.swing.JLabel Lbl_N_Errores;
    private javax.swing.JLabel Lbl_N_Preguntas;
    private javax.swing.JLabel Lbl_N_Tabla;
    private javax.swing.JLabel Lbl_N_Tiempo;
    private javax.swing.JLabel Lbl_Número;
    private javax.swing.JLabel Lbl_Operación;
    private javax.swing.JLabel Lbl_Puntajes;
    private javax.swing.JLabel Lbl_Simbolo_Aciertos;
    private javax.swing.JLabel Lbl_Simbolo_Errores;
    private javax.swing.JLabel Lbl_T_Aciertos;
    private javax.swing.JLabel Lbl_T_Calificación;
    private javax.swing.JLabel Lbl_T_Errores;
    private javax.swing.JLabel Lbl_T_Preguntas;
    private javax.swing.JLabel Lbl_T_Tabla;
    private javax.swing.JLabel Lbl_T_Tiempo;
    private javax.swing.JLabel Lbl_Tiempo;
    private javax.swing.JLabel Lbl_Titulo;
    private javax.swing.JPanel Pnl_Botones;
    private javax.swing.JPanel Pnl_Comenzar;
    private javax.swing.JPanel Pnl_Controles;
    private javax.swing.JPanel Pnl_Dialog;
    private javax.swing.JPanel Pnl_Dialog1;
    private javax.swing.JPanel Pnl_Operaciones;
    private javax.swing.JPanel Pnl_Panel;
    private javax.swing.JPanel Pnl_Preguntas;
    private javax.swing.JPanel Pnl_Respuestas;
    private javax.swing.JPanel Pnl_Tabla;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}