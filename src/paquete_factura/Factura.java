/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_factura;


import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.gt;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.BOTTOM;
import static javax.swing.SwingConstants.TOP;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author Alejandro Peláez
 */
public class Factura extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form Factura
     */
    ListaProductos LP = new ListaProductos();
    LaminaConImagen Milamina = new LaminaConImagen();
    static int i = -1;
    ConexionBD miConex = new ConexionBD();

    public Factura() {       
        initComponents();
       
        setBounds(0, 0, 950,800);
        //insertar imagen de logotipo
        Laminita ppp = new Laminita();
        ppp.setBounds(10, 5, 195,60);
        ppp.setBorder(null);
        ppp.setBackground(Color.WHITE);
        recibo.add(ppp);
        //Insertar letra lado derecho
        Laminita2 ppp2 = new Laminita2();
        ppp2.setBounds(660, 132, 20,325);
        ppp2.setBorder(null);
        ppp2.setBackground(Color.WHITE);
        recibo.add(ppp2); 
        
        Laminita3 ppp3 = new Laminita3();
        ppp3.setBounds(5, 132, 20,325);
        ppp3.setBorder(null);
        ppp3.setBackground(Color.WHITE);
        recibo.add(ppp3); 
        
        txFactura.setText(miConex.getNF());
            
    }
    
    
    
    class Laminita extends JPanel{
        Image imagen;
        
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
               
                //File miImagen= new File("src/graficos/MontajesJJ3.png");
                try{ 
                   imagen = new ImageIcon(getClass().getResource("MontajesJJ3.png")).getImage();
                  //    imagen = ImageIO.read(miImagen);
                }       
                catch(Exception e){
                    System.out.println("La imagen no se encuentra");
                    
                }
                g.drawImage(imagen, 0, 0, null);
        }
    }
    
    class Laminita2 extends JPanel{
        private Image imagen;
   
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
                //File miImagen= new File("src/graficos/LetraDerecha.png");
                try{
                 imagen = new ImageIcon(getClass().getResource("LetraDerecha.png")).getImage();
                }       
                catch(Exception e){
                    System.out.println("La imagen no se encuentra");
                    
                }
                g.drawImage(imagen, 0, 0, null);
        }
    }
    
    class Laminita3 extends JPanel{
        private Image imagen;
   
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
                //File miImagen= new File("src/graficos/LetraIzquierda.png");
                try{
                   imagen = new ImageIcon(getClass().getResource("LetraIzquierda.PNG")).getImage();
                }       
                catch(Exception e){
                    System.out.println("La imagen no se encuentra");
                    
                }
                g.drawImage(imagen, 0, 0, null);
        }
    }
   
    
    class LabelRot extends JLabel{
        
        @Override
        public void paintComponent(Graphics gg){
             Graphics2D graficoNuevo = (Graphics2D) gg;

                graficoNuevo.setRenderingHint(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON
                );

                AffineTransform at = graficoNuevo.getTransform();
                Shape figura = graficoNuevo.getClip();

                double X = getWidth() / 2.0;
                double Y = getHeight() / 2.0;

                at.rotate(Math.toRadians(270), X, Y);

                graficoNuevo.setTransform(at);
                graficoNuevo.setClip(figura);

                super.paintComponent(gg);
        }
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        recibo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txSubtotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txIVA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txObservaciones = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jl5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txSenior = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txNit1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txTelefono = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txNit2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txNit3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        txAnio = new javax.swing.JTextField();
        txDia = new javax.swing.JTextField();
        recibo1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txTotal1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txSubtotal1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txIVA1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        txMes = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txFactura = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txValorIVA = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        ISU = new javax.swing.JTextField();
        txt_ISU = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        BottonAgregar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_fecha = new javax.swing.JButton();
        btnMostrarProductos = new javax.swing.JButton();
        btn_cambiarNF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FacturaJJ");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese código");

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        recibo.setBackground(new java.awt.Color(255, 255, 255));
        recibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        recibo.setLayout(null);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Cantidad", "Descripción", "Valor unitario", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Short.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TablaComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(55);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(315);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(85);
            Tabla.getColumnModel().getColumn(4).setPreferredWidth(130);
        }

        recibo.add(jScrollPane2);
        jScrollPane2.setBounds(20, 130, 640, 360);

        jLabel5.setText("Dg 58 Av 43 -18 in 201 -  Brr. Niquía,  Tel: 314 8824880");
        recibo.add(jLabel5);
        jLabel5.setBounds(210, 30, 310, 14);

        txTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTotalActionPerformed(evt);
            }
        });
        recibo.add(txTotal);
        txTotal.setBounds(500, 610, 160, 20);

        jLabel7.setText("TOTAL");
        recibo.add(jLabel7);
        jLabel7.setBounds(450, 610, 56, 20);

        txSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSubtotalActionPerformed(evt);
            }
        });
        recibo.add(txSubtotal);
        txSubtotal.setBounds(500, 520, 160, 20);

        jLabel3.setText("Subtotal");
        recibo.add(jLabel3);
        jLabel3.setBounds(440, 520, 54, 14);

        txIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIVAActionPerformed(evt);
            }
        });
        recibo.add(txIVA);
        txIVA.setBounds(350, 520, 35, 20);

        jLabel4.setText("IVA %");
        recibo.add(jLabel4);
        jLabel4.setBounds(310, 520, 46, 14);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txObservaciones.setColumns(20);
        txObservaciones.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txObservaciones.setRows(5);
        jScrollPane3.setViewportView(txObservaciones);

        recibo.add(jScrollPane3);
        jScrollPane3.setBounds(20, 510, 280, 80);

        jLabel8.setText("Observaciones");
        recibo.add(jLabel8);
        jLabel8.setBounds(20, 290, 89, 14);

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        jLabel13.setText("FIRMA   AUTORIZADA");
        recibo.add(jLabel13);
        jLabel13.setBounds(340, 640, 138, 10);

        jLabel16.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        jLabel16.setText("FIRMA Y SELLO DEL COMPRADOR");
        recibo.add(jLabel16);
        jLabel16.setBounds(500, 640, 196, 14);

        jl5.setText("Nit 900.832.297 -5 - Régimen Común");
        recibo.add(jl5);
        jl5.setBounds(260, 10, 211, 21);

        jLabel6.setText(" Antioquia - Colombia");
        recibo.add(jLabel6);
        jLabel6.setBounds(290, 50, 121, 14);

        jLabel9.setText("Señor(es):");
        recibo.add(jLabel9);
        jLabel9.setBounds(20, 70, 67, 14);

        txSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSeniorActionPerformed(evt);
            }
        });
        recibo.add(txSenior);
        txSenior.setBounds(80, 70, 230, 20);

        jLabel11.setText("Dirección: ");
        recibo.add(jLabel11);
        jLabel11.setBounds(20, 100, 60, 14);
        recibo.add(txDireccion);
        txDireccion.setBounds(80, 100, 190, 20);

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        jLabel10.setText("C.C./NIT: ");
        recibo.add(jLabel10);
        jLabel10.setBounds(340, 690, 50, 20);

        txNit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNit1ActionPerformed(evt);
            }
        });
        recibo.add(txNit1);
        txNit1.setBounds(360, 70, 140, 20);

        jLabel12.setText("Teléfono:");
        recibo.add(jLabel12);
        jLabel12.setBounds(290, 100, 60, 14);
        recibo.add(txTelefono);
        txTelefono.setBounds(360, 100, 140, 20);

        jLabel14.setText("NIT: ");
        recibo.add(jLabel14);
        jLabel14.setBounds(320, 70, 30, 14);

        txNit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNit2ActionPerformed(evt);
            }
        });
        recibo.add(txNit2);
        txNit2.setBounds(390, 690, 90, 20);

        jLabel15.setText("____________________________");
        recibo.add(jLabel15);
        jLabel15.setBounds(500, 660, 200, 20);

        jLabel17.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        jLabel17.setText("C.C./NIT: ");
        recibo.add(jLabel17);
        jLabel17.setBounds(510, 690, 50, 20);
        recibo.add(txNit3);
        txNit3.setBounds(560, 690, 110, 20);

        jLabel18.setText("____________________");
        recibo.add(jLabel18);
        jLabel18.setBounds(340, 660, 180, 20);

        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("\nEsta factura de venta se asimila en todos sus efectos legales a un título\nvalor según la ley 1231 de 2008 para efectos de dar cumplimiento a lo\nestipulado en el Código de comercio. Causará intereses de mora a la\ntasa máxima permitida por la Ley, según certificado de la\nsuperintendencia bancaria.");
        jScrollPane1.setViewportView(jTextArea3);

        recibo.add(jScrollPane1);
        jScrollPane1.setBounds(20, 590, 300, 80);

        jLabel19.setText("Fecha");
        recibo.add(jLabel19);
        jLabel19.setBounds(530, 70, 40, 14);
        recibo.add(txAnio);
        txAnio.setBounds(630, 70, 40, 20);
        recibo.add(txDia);
        txDia.setBounds(570, 70, 30, 20);

        recibo1.setBackground(new java.awt.Color(255, 255, 255));
        recibo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        recibo1.setLayout(null);

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Cantidad", "Descripción", "Valor unitario", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Short.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabla1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Tabla1ComponentAdded(evt);
            }
        });
        jScrollPane4.setViewportView(Tabla1);
        if (Tabla1.getColumnModel().getColumnCount() > 0) {
            Tabla1.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla1.getColumnModel().getColumn(1).setPreferredWidth(55);
            Tabla1.getColumnModel().getColumn(2).setPreferredWidth(315);
            Tabla1.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        recibo1.add(jScrollPane4);
        jScrollPane4.setBounds(20, 130, 620, 220);

        jLabel20.setText("Dg 58 Av 43 -18 in 201 -  Brr. Niquía,  Tel: 483 03 55");
        recibo1.add(jLabel20);
        jLabel20.setBounds(190, 30, 310, 14);

        txTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTotal1ActionPerformed(evt);
            }
        });
        recibo1.add(txTotal1);
        txTotal1.setBounds(500, 390, 114, 20);

        jLabel21.setText("TOTAL");
        recibo1.add(jLabel21);
        jLabel21.setBounds(450, 390, 56, 14);

        txSubtotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSubtotal1ActionPerformed(evt);
            }
        });
        recibo1.add(txSubtotal1);
        txSubtotal1.setBounds(500, 360, 114, 20);

        jLabel22.setText("Subtotal");
        recibo1.add(jLabel22);
        jLabel22.setBounds(450, 360, 54, 14);

        txIVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIVA1ActionPerformed(evt);
            }
        });
        recibo1.add(txIVA1);
        txIVA1.setBounds(410, 360, 35, 20);

        jLabel23.setText("IVA %");
        recibo1.add(jLabel23);
        jLabel23.setBounds(370, 360, 46, 14);

        jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        recibo1.add(jScrollPane5);
        jScrollPane5.setBounds(20, 370, 340, 50);

        jLabel24.setText("Observaciones");
        recibo1.add(jLabel24);
        jLabel24.setBounds(20, 290, 89, 14);

        jLabel25.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        jLabel25.setText("FIRMA AUTORIZADA");
        recibo1.add(jLabel25);
        jLabel25.setBounds(290, 430, 138, 10);

        jLabel26.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        jLabel26.setText("FIRMA Y SELLO DEL COMPRADOR");
        recibo1.add(jLabel26);
        jLabel26.setBounds(460, 430, 196, 14);

        jl6.setText("Nit 900.832.297 -5 - Régimen Común");
        recibo1.add(jl6);
        jl6.setBounds(220, 10, 211, 21);

        jLabel27.setText(" Antioquia - Colombia");
        recibo1.add(jLabel27);
        jLabel27.setBounds(260, 50, 121, 14);

        jLabel28.setText("Señor(es):");
        recibo1.add(jLabel28);
        jLabel28.setBounds(20, 70, 67, 14);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        recibo1.add(jTextField9);
        jTextField9.setBounds(80, 70, 230, 20);

        jLabel29.setText("Dirección: ");
        recibo1.add(jLabel29);
        jLabel29.setBounds(20, 100, 60, 14);
        recibo1.add(jTextField10);
        jTextField10.setBounds(80, 100, 200, 20);

        jLabel30.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        jLabel30.setText("C.C./NIT: ");
        recibo1.add(jLabel30);
        jLabel30.setBounds(290, 490, 50, 14);

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        recibo1.add(jTextField11);
        jTextField11.setBounds(360, 70, 130, 20);

        jLabel31.setText("Teléfono:");
        recibo1.add(jLabel31);
        jLabel31.setBounds(290, 100, 60, 14);
        recibo1.add(jTextField12);
        jTextField12.setBounds(360, 100, 130, 20);

        jLabel32.setText("NIT: ");
        recibo1.add(jLabel32);
        jLabel32.setBounds(320, 70, 30, 14);
        recibo1.add(jTextField13);
        jTextField13.setBounds(340, 490, 90, 20);

        jLabel33.setText("_________________________");
        recibo1.add(jLabel33);
        jLabel33.setBounds(460, 470, 180, 14);

        jLabel34.setFont(new java.awt.Font("Cambria", 0, 10)); // NOI18N
        jLabel34.setText("C.C./NIT: ");
        recibo1.add(jLabel34);
        jLabel34.setBounds(460, 490, 50, 14);
        recibo1.add(jTextField14);
        jTextField14.setBounds(510, 490, 110, 20);

        jLabel35.setText("______________________");
        recibo1.add(jLabel35);
        jLabel35.setBounds(290, 470, 160, 14);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("\nEsta factura de venta se asimila en todos sus efectos legales a un título\nvalor según la ley 1231 de 2008 para efectos de dar cumplimiento a lo\nestipulado en el Código de comercio. Causará intereses de mora a la\ntasa máxima permitida por la Ley, según certificado de la\nsuperintendencia bancaria.");
        jScrollPane6.setViewportView(jTextArea4);

        recibo1.add(jScrollPane6);
        jScrollPane6.setBounds(20, 430, 260, 80);

        jLabel36.setText("Fecha");
        recibo1.add(jLabel36);
        jLabel36.setBounds(500, 70, 29, 14);
        recibo1.add(jTextField15);
        jTextField15.setBounds(570, 70, 30, 20);
        recibo1.add(jTextField16);
        jTextField16.setBounds(540, 70, 30, 20);

        recibo.add(recibo1);
        recibo1.setBounds(0, 0, 0, 0);

        txMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMesActionPerformed(evt);
            }
        });
        recibo.add(txMes);
        txMes.setBounds(600, 70, 30, 20);

        jLabel37.setText("Mes");
        recibo.add(jLabel37);
        jLabel37.setBounds(600, 90, 30, 14);

        jLabel38.setText("Año");
        recibo.add(jLabel38);
        jLabel38.setBounds(630, 90, 30, 14);

        jLabel39.setText("Día");
        recibo.add(jLabel39);
        jLabel39.setBounds(570, 90, 30, 14);

        jLabel40.setText("FACTURA DE VENTA");
        recibo.add(jLabel40);
        jLabel40.setBounds(550, 10, 130, 20);

        jLabel41.setForeground(new java.awt.Color(255, 0, 51));
        jLabel41.setText("Nº");
        recibo.add(jLabel41);
        jLabel41.setBounds(550, 30, 40, 14);

        txFactura.setBorder(null);
        recibo.add(txFactura);
        txFactura.setBounds(580, 30, 70, 14);

        jLabel42.setForeground(new java.awt.Color(255, 0, 0));
        jLabel42.setText("CLIENTE");
        recibo.add(jLabel42);
        jLabel42.setBounds(590, 710, 52, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel1.setText("Observaciones");
        recibo.add(jLabel1);
        jLabel1.setBounds(20, 490, 70, 11);

        txValorIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txValorIVAActionPerformed(evt);
            }
        });
        recibo.add(txValorIVA);
        txValorIVA.setBounds(500, 550, 160, 20);

        jLabel43.setText("Valor IVA");
        recibo.add(jLabel43);
        jLabel43.setBounds(440, 550, 60, 20);

        jLabel44.setText("Iva sobre utilidad");
        recibo.add(jLabel44);
        jLabel44.setBounds(310, 550, 100, 20);

        jLabel45.setText("Valor iva sobre utilidad");
        recibo.add(jLabel45);
        jLabel45.setBounds(410, 580, 130, 20);
        recibo.add(ISU);
        ISU.setBounds(340, 570, 50, 20);
        recibo.add(txt_ISU);
        txt_ISU.setBounds(560, 580, 100, 20);

        jLabel46.setText("%");
        recibo.add(jLabel46);
        jLabel46.setBounds(320, 570, 20, 14);

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Factura");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        BottonAgregar.setText("+");
        BottonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonAgregarActionPerformed(evt);
            }
        });

        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_fecha.setText("Fecha");
        btn_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fechaActionPerformed(evt);
            }
        });

        btnMostrarProductos.setText("Mostrar Productos");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });

        btn_cambiarNF.setText("Modificar Numero Fac");
        btn_cambiarNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarNFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrarProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BottonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_cambiarNF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1790, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btn_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(BottonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btn_cambiarNF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addComponent(recibo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (txCodigo.getText().equals("")){// Si  no hay un valor en la caja codigo...
            JOptionPane.showMessageDialog(null, "Por favor ingrese código");
        }
        else{
            //Cuando hay un valor válido en la caja codigo
            try {
                 String cod = txCodigo.getText();
                 int cod_int = Integer.parseInt(cod);
                 String aux = JOptionPane.showInputDialog("Ingrese cantidad"); 
                 if (aux == null) {
                    
                }
                 else{
                       try {
                                 i++;
                                 int cantidad = Integer.parseInt(aux);             
                                 Tabla.setValueAt(cantidad, i, 1);   
                                 Tabla.setValueAt(cod_int, i,0);
                                 Tabla.setValueAt(LP.MostrarDescripcion(cod_int), i,2);       
                                 Tabla.setValueAt(LP.MostrarValor(cod_int), i,3);
                                 txCodigo.setText("");                              
                     } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, "Has ingresado un valor no numérico");
                         i--;
                     }
                 }
                        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"El valor ingresado no se encuentra \n en nuestra lista de productos");
            }
             
        }   

                  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int  j = 0;
        double subtotal = 0;
        String auxS ="";
        while(j<Tabla.getRowCount() && (Tabla.getValueAt(j, 0) != null && !Tabla.getValueAt(j, 0).equals("") )){
              if (Tabla.getValueAt(j, 0)!= null) { //Evalua si hay valores en columna codigo
                    if (Tabla.getValueAt(j, 1)== null) { //Evalua si columna cantidad esta vacia
                        JOptionPane.showMessageDialog(null, "Ingrese la cantidad del producto "+j+1);
                    }
                    else{
                        String strCantidad = String.valueOf(Tabla.getValueAt(j, 1)); //convierte el valor de la columna cantidad a String
                        int intCantidad  =  Integer.parseInt(strCantidad); //convierte el valor de la columna cantidad a Entero
                        String strValorUnit = String.valueOf(Tabla.getValueAt(j, 3)); //convierte el valor de la columna "valor unitario" a String
                        double intValorUnit =   Double.parseDouble(strValorUnit); //convierte el valor de la columna "valor unitario" a double
                        double valorTotal = intCantidad* intValorUnit;
                        Tabla.setValueAt(valorTotal, j, 4); 
                        subtotal = subtotal+valorTotal;
                        NumberFormat numF = NumberFormat.getInstance();
                        auxS = numF.format(subtotal);
                    }
                 }
                   j++;   
        }
        txSubtotal.setText(auxS);
        if (!txIVA.getText().equals("")) {// Si hay iva haga esto
            try {
                 double IVA = Double.parseDouble(txIVA.getText());
                 double IVASU = Double.parseDouble(ISU.getText());
                 NumberFormat auxIVASU = NumberFormat.getInstance();
                 NumberFormat auxIVA = NumberFormat.getInstance();
                 String strIVA = auxIVA.format(subtotal*IVA/100);
                 String strIVASU = auxIVASU.format(subtotal*IVASU/100);
                 txValorIVA.setText(strIVA);
                 txt_ISU.setText(strIVASU);
                 double TOTAL = subtotal+ subtotal*IVA/100+ subtotal*IVASU/100;
                 NumberFormat  auxTotal = NumberFormat.getInstance();
                 String auxT = auxTotal.format(TOTAL);
                 txTotal.setText(auxT);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error con el IVA!, \n verifica que no hayan letras o caracteres especiales");
            }
           
        }
        else{
            txTotal.setText(String.valueOf(subtotal));
        }
        
           
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (i >= 0) {
            Tabla.setValueAt(null, i, 0);
            Tabla.setValueAt(null, i, 1);
            Tabla.setValueAt(null, i, 2);
            Tabla.setValueAt(null, i, 3);
            Tabla.setValueAt(null, i, 4);
            txIVA.setText("");
            txSubtotal.setText("");
            txTotal.setText("");
            i--;
        }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String botones[] = {"Continuar", "Cancelar"};
        if (txFactura.getText().isEmpty()) {
            int election = JOptionPane.showOptionDialog(this, "El número de la factura se encuentra vacío \n ¿Desea imprimir de todas formas?", "Titulo", 0, 0, null, botones, this);
            if (election == JOptionPane.OK_OPTION) {
                 try {
                    PrinterJob gap = PrinterJob.getPrinterJob();
                    gap.setPrintable(this);
                    boolean top = gap.printDialog();
                    if (top) {
                        gap.print();
                    }
                } catch (PrinterException pex) {
                    JOptionPane.showMessageDialog(null, "Error de impresión", "Error\n"+pex, JOptionPane.INFORMATION_MESSAGE);
                }
            }
    
        }
        else{
          
            try {      
            PrinterJob gap = PrinterJob.getPrinterJob();
            gap.setPrintable(this);
            boolean top = gap.printDialog();
            if (top) {
                gap.print();
                miConex.Actualizar();
                txFactura.setText("");
                txFactura.setText(miConex.getNF());
            }
        } catch (PrinterException pex) {
            JOptionPane.showMessageDialog(null, "Error de impresión", "Error\n"+pex, JOptionPane.INFORMATION_MESSAGE);
        }
        }
     
    
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIVAActionPerformed

    private void txTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTotalActionPerformed

    private void txSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSubtotalActionPerformed

    private void TablaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TablaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaComponentAdded

    private void txSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSeniorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSeniorActionPerformed

    private void txNit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNit1ActionPerformed

    private void Tabla1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Tabla1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla1ComponentAdded

    private void txTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTotal1ActionPerformed

    private void txSubtotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSubtotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSubtotal1ActionPerformed

    private void txIVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIVA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIVA1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txSenior.setText("");
       txDireccion.setText("");
       txNit1.setText("");
       txTelefono.setText("");
       txDia.setText("");
       txMes.setText("");
       txAnio.setText("");   
       txObservaciones.setText("");
       txIVA.setText("");
       txValorIVA.setText("");
       txSubtotal.setText("");
       txTotal.setText("");
       txNit2.setText("");
       txNit3.setText("");
       txt_ISU.setText("");
       ISU.setText("");
        for (int j = 0; j < Tabla.getRowCount(); j++) {
            for (int k = 0; k < 5; k++) {
                Tabla.setValueAt(null, j,k);
            }
        }
       i= -1;
       
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txNit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNit2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNit2ActionPerformed

    private void BottonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonAgregarActionPerformed
      DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
      modelo.insertRow(modelo.getRowCount(),new Object[]{"","","",""});
    }//GEN-LAST:event_BottonAgregarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
            modelo.removeRow(modelo.getRowCount()-1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txMesActionPerformed

    private void btn_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fechaActionPerformed
       Calendar c = new GregorianCalendar();
       int mes = c.get(Calendar.MONTH)+1;
       txDia.setText(Integer.toString(c.get(Calendar.DATE)));
       txMes.setText(Integer.toString(mes));
       txAnio.setText(Integer.toString(c.get(Calendar.YEAR)));
       
    }//GEN-LAST:event_btn_fechaActionPerformed

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
         ListaDeProductos MostrarLista = new ListaDeProductos();
         MostrarLista.setVisible(true);
         
    }//GEN-LAST:event_btnMostrarProductosActionPerformed

    private void txValorIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txValorIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txValorIVAActionPerformed

    private void btn_cambiarNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarNFActionPerformed
        miConex.Modificar();
        txFactura.setText(miConex.getNF());
    }//GEN-LAST:event_btn_cambiarNFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottonAgregar;
    private javax.swing.JTextField ISU;
    private javax.swing.JTable Tabla;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrarProductos;
    private javax.swing.JButton btn_cambiarNF;
    private javax.swing.JButton btn_fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JPanel recibo;
    private javax.swing.JPanel recibo1;
    private javax.swing.JTextField txAnio;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txDia;
    private javax.swing.JTextField txDireccion;
    private javax.swing.JTextField txFactura;
    private javax.swing.JTextField txIVA;
    private javax.swing.JTextField txIVA1;
    private javax.swing.JTextField txMes;
    private javax.swing.JTextField txNit1;
    private javax.swing.JTextField txNit2;
    private javax.swing.JTextField txNit3;
    private javax.swing.JTextArea txObservaciones;
    private javax.swing.JTextField txSenior;
    private javax.swing.JTextField txSubtotal;
    private javax.swing.JTextField txSubtotal1;
    private javax.swing.JTextField txTelefono;
    private javax.swing.JTextField txTotal;
    private javax.swing.JTextField txTotal1;
    private javax.swing.JTextField txValorIVA;
    private javax.swing.JTextField txt_ISU;
    // End of variables declaration//GEN-END:variables

     
    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if(index >0){
            return NO_SUCH_PAGE;
        }
        
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX()+10, pagfor.getImageableY()+20);
        hub.scale(0.8, 0.8);
        recibo.printAll(graf);
  
    return PAGE_EXISTS;
}
    
    
}
