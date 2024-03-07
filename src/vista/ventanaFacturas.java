/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Aprendiz
 */
public class ventanaFacturas extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public ventanaFacturas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Factura_PanelFondo = new javax.swing.JPanel();
        Factura_PanelRegistro = new javax.swing.JPanel();
        Factura_ConPaneles = new javax.swing.JPanel();
        Factura_ScrollTabla = new javax.swing.JScrollPane();
        Factura_Tabla = new javax.swing.JTable();
        Factura_BotonActualizar = new javax.swing.JButton();
        Factura_BotonEliminar = new javax.swing.JButton();
        Factura_PanelDatosClientes = new javax.swing.JPanel();
        Factura_TituloDatosClientes = new javax.swing.JLabel();
        Factura_CampoDocumento = new javax.swing.JTextField();
        Factura_CampoTelefono = new javax.swing.JTextField();
        Factura_CampoNombre = new javax.swing.JTextField();
        Factura_CampoEmail = new javax.swing.JTextField();
        Factura_TituloDocumento = new javax.swing.JLabel();
        Factura_TituloTelefono = new javax.swing.JLabel();
        Factura_TituloEmail = new javax.swing.JLabel();
        Factura_TituloNombre = new javax.swing.JLabel();
        Factura_PanelDatosProductos = new javax.swing.JPanel();
        Factura_TituloDatosProductos = new javax.swing.JLabel();
        Factura_BotonAgregar = new javax.swing.JButton();
        Factura_BotonCancelar = new javax.swing.JButton();
        Factura_CampoCodigo = new javax.swing.JTextField();
        Factura_CampoStock = new javax.swing.JTextField();
        Factura_CampoDescripcion = new javax.swing.JTextField();
        Factura_CampoCantidad = new javax.swing.JTextField();
        Factura_CampoPrecio = new javax.swing.JTextField();
        Factura_TituloCodigo = new javax.swing.JLabel();
        Factura_TituloStock = new javax.swing.JLabel();
        Factura_TituloDescripcion = new javax.swing.JLabel();
        Factura_TituloCantidad = new javax.swing.JLabel();
        Factura_TituloPrecio = new javax.swing.JLabel();
        Factura_BotonGenerar = new javax.swing.JButton();
        Factura_Titulo = new javax.swing.JLabel();
        Factura_Buscador = new javax.swing.JTextField();
        Factura_IconoBuscador = new javax.swing.JLabel();
        Menu_PanelMenu = new javax.swing.JPanel();
        Menu_Foto = new javax.swing.JLabel();
        Menu_Inicio = new javax.swing.JLabel();
        Menu_Clientes = new javax.swing.JLabel();
        Menu_Proveedor = new javax.swing.JLabel();
        Menu_Facturas = new javax.swing.JLabel();
        Menu_Separador2 = new javax.swing.JSeparator();
        Menu_Salir = new javax.swing.JLabel();
        Menu_Roles = new javax.swing.JLabel();
        Menu_Separador3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Factura_PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Factura_PanelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        Factura_PanelRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Factura_ConPaneles.setBackground(new java.awt.Color(204, 204, 204));
        Factura_ConPaneles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Factura_ConPaneles.setMinimumSize(new java.awt.Dimension(130, 430));
        Factura_ConPaneles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Factura_ScrollTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Factura_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Cedula", "Cantidad", "Precio", "Subtotal", "Total"
            }
        ));
        Factura_ScrollTabla.setViewportView(Factura_Tabla);

        Factura_ConPaneles.add(Factura_ScrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 640, 170));

        Factura_BotonActualizar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Factura_BotonActualizar.setText("Actualizar");
        Factura_ConPaneles.add(Factura_BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 130, -1));

        Factura_BotonEliminar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Factura_BotonEliminar.setText("Eliminar");
        Factura_ConPaneles.add(Factura_BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 130, -1));

        Factura_PanelDatosClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Factura_TituloDatosClientes.setText("Datos Clientes");

        Factura_CampoDocumento.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_CampoTelefono.setMinimumSize(new java.awt.Dimension(64, 30));
        Factura_CampoTelefono.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_CampoNombre.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_CampoEmail.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_TituloDocumento.setText("Documento");

        Factura_TituloTelefono.setText("Telefono");

        Factura_TituloEmail.setText("E-mail");

        Factura_TituloNombre.setText("Nombre");

        javax.swing.GroupLayout Factura_PanelDatosClientesLayout = new javax.swing.GroupLayout(Factura_PanelDatosClientes);
        Factura_PanelDatosClientes.setLayout(Factura_PanelDatosClientesLayout);
        Factura_PanelDatosClientesLayout.setHorizontalGroup(
            Factura_PanelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Factura_PanelDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Factura_PanelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Factura_PanelDatosClientesLayout.createSequentialGroup()
                        .addComponent(Factura_TituloDatosClientes)
                        .addContainerGap(227, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_PanelDatosClientesLayout.createSequentialGroup()
                        .addGroup(Factura_PanelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Factura_CampoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Factura_CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Factura_TituloNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Factura_PanelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Factura_CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Factura_CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Factura_TituloEmail))
                        .addGap(46, 46, 46))
                    .addGroup(Factura_PanelDatosClientesLayout.createSequentialGroup()
                        .addComponent(Factura_TituloDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Factura_TituloTelefono)
                        .addGap(103, 103, 103))))
        );
        Factura_PanelDatosClientesLayout.setVerticalGroup(
            Factura_PanelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Factura_PanelDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Factura_TituloDatosClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Factura_PanelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Factura_TituloTelefono)
                    .addComponent(Factura_TituloDocumento))
                .addGap(4, 4, 4)
                .addGroup(Factura_PanelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Factura_CampoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Factura_CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Factura_PanelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Factura_PanelDatosClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(Factura_TituloEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Factura_CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(Factura_PanelDatosClientesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Factura_TituloNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Factura_CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Factura_ConPaneles.add(Factura_PanelDatosClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 200));

        Factura_PanelDatosProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Factura_TituloDatosProductos.setText("Datos del Producto");

        Factura_BotonAgregar.setBackground(new java.awt.Color(204, 204, 204));
        Factura_BotonAgregar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Factura_BotonAgregar.setText("Agregar");

        Factura_BotonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        Factura_BotonCancelar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Factura_BotonCancelar.setText("Cancelar");

        Factura_CampoCodigo.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_CampoStock.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_CampoDescripcion.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_CampoCantidad.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_CampoPrecio.setPreferredSize(new java.awt.Dimension(100, 22));

        Factura_TituloCodigo.setText("Codigo");

        Factura_TituloStock.setText("Stock Disponible");

        Factura_TituloDescripcion.setText("Descripcion");

        Factura_TituloCantidad.setText("Cantidad");

        Factura_TituloPrecio.setText("Precio");

        javax.swing.GroupLayout Factura_PanelDatosProductosLayout = new javax.swing.GroupLayout(Factura_PanelDatosProductos);
        Factura_PanelDatosProductos.setLayout(Factura_PanelDatosProductosLayout);
        Factura_PanelDatosProductosLayout.setHorizontalGroup(
            Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                        .addGroup(Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                                .addComponent(Factura_CampoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Factura_CampoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Factura_TituloDatosProductos)
                            .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                                .addGroup(Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Factura_CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Factura_TituloCodigo))
                                .addGap(61, 61, 61)
                                .addGroup(Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Factura_CampoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Factura_TituloStock))))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                        .addComponent(Factura_CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(Factura_BotonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Factura_BotonCancelar)
                        .addGap(12, 12, 12))
                    .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                        .addComponent(Factura_TituloPrecio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                        .addComponent(Factura_TituloDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Factura_TituloCantidad)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Factura_PanelDatosProductosLayout.setVerticalGroup(
            Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Factura_TituloDatosProductos)
                .addGroup(Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                        .addGroup(Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                                .addComponent(Factura_TituloStock)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Factura_CampoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                                .addComponent(Factura_TituloCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Factura_CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Factura_TituloDescripcion))
                    .addGroup(Factura_PanelDatosProductosLayout.createSequentialGroup()
                        .addGap(0, 66, Short.MAX_VALUE)
                        .addComponent(Factura_TituloCantidad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Factura_CampoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Factura_CampoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Factura_TituloPrecio)
                .addGap(4, 4, 4)
                .addGroup(Factura_PanelDatosProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Factura_BotonAgregar)
                    .addComponent(Factura_BotonCancelar)
                    .addComponent(Factura_CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        Factura_ConPaneles.add(Factura_PanelDatosProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 310, 200));

        Factura_BotonGenerar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Factura_BotonGenerar.setText("Generar");
        Factura_ConPaneles.add(Factura_BotonGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 115, -1));

        Factura_Titulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Factura_Titulo.setText("Registro Inventario");

        Factura_Buscador.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Factura_Buscador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Factura_IconoBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/img/buscadorIcon.png"))); // NOI18N

        javax.swing.GroupLayout Factura_PanelRegistroLayout = new javax.swing.GroupLayout(Factura_PanelRegistro);
        Factura_PanelRegistro.setLayout(Factura_PanelRegistroLayout);
        Factura_PanelRegistroLayout.setHorizontalGroup(
            Factura_PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_PanelRegistroLayout.createSequentialGroup()
                .addGroup(Factura_PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Factura_PanelRegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Factura_ConPaneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Factura_PanelRegistroLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(Factura_Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 893, Short.MAX_VALUE)
                        .addComponent(Factura_IconoBuscador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Factura_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Factura_PanelRegistroLayout.setVerticalGroup(
            Factura_PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Factura_PanelRegistroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Factura_PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Factura_Titulo)
                    .addGroup(Factura_PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Factura_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Factura_IconoBuscador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Factura_ConPaneles, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        Factura_PanelFondo.add(Factura_PanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1360, 850));

        Menu_PanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        Menu_PanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Menu_Foto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Menu_Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu_Foto.setText("Foto");
        Menu_Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Menu_Inicio.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        Menu_Inicio.setText("Mesa");

        Menu_Clientes.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        Menu_Clientes.setText("Clientes");

        Menu_Proveedor.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        Menu_Proveedor.setText("Pedidos");

        Menu_Facturas.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        Menu_Facturas.setText("Crear Factura");

        Menu_Salir.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        Menu_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/img/salirIcon.png"))); // NOI18N
        Menu_Salir.setText("Salir");
        Menu_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_SalirMouseClicked(evt);
            }
        });

        Menu_Roles.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Menu_Roles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu_Roles.setText("ROLES");

        javax.swing.GroupLayout Menu_PanelMenuLayout = new javax.swing.GroupLayout(Menu_PanelMenu);
        Menu_PanelMenu.setLayout(Menu_PanelMenuLayout);
        Menu_PanelMenuLayout.setHorizontalGroup(
            Menu_PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_Roles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Menu_PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu_Foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Separador2)
                    .addComponent(Menu_Facturas, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(Menu_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Separador3))
                .addContainerGap())
        );
        Menu_PanelMenuLayout.setVerticalGroup(
            Menu_PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Menu_Roles)
                .addGap(27, 27, 27)
                .addComponent(Menu_Separador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(Menu_Inicio)
                .addGap(91, 91, 91)
                .addComponent(Menu_Proveedor)
                .addGap(96, 96, 96)
                .addComponent(Menu_Clientes)
                .addGap(97, 97, 97)
                .addComponent(Menu_Facturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(Menu_Separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Menu_Salir)
                .addGap(24, 24, 24))
        );

        Factura_PanelFondo.add(Menu_PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 850));

        getContentPane().add(Factura_PanelFondo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputs5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputs5ActionPerformed

    private void Menu_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_SalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_SalirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Factura_BotonActualizar;
    private javax.swing.JButton Factura_BotonAgregar;
    private javax.swing.JButton Factura_BotonCancelar;
    private javax.swing.JButton Factura_BotonEliminar;
    private javax.swing.JButton Factura_BotonGenerar;
    private javax.swing.JTextField Factura_Buscador;
    private javax.swing.JTextField Factura_CampoCantidad;
    private javax.swing.JTextField Factura_CampoCodigo;
    private javax.swing.JTextField Factura_CampoDescripcion;
    private javax.swing.JTextField Factura_CampoDocumento;
    private javax.swing.JTextField Factura_CampoEmail;
    private javax.swing.JTextField Factura_CampoNombre;
    private javax.swing.JTextField Factura_CampoPrecio;
    private javax.swing.JTextField Factura_CampoStock;
    private javax.swing.JTextField Factura_CampoTelefono;
    private javax.swing.JPanel Factura_ConPaneles;
    private javax.swing.JLabel Factura_IconoBuscador;
    private javax.swing.JPanel Factura_PanelDatosClientes;
    private javax.swing.JPanel Factura_PanelDatosProductos;
    private javax.swing.JPanel Factura_PanelFondo;
    private javax.swing.JPanel Factura_PanelRegistro;
    private javax.swing.JScrollPane Factura_ScrollTabla;
    private javax.swing.JTable Factura_Tabla;
    private javax.swing.JLabel Factura_Titulo;
    private javax.swing.JLabel Factura_TituloCantidad;
    private javax.swing.JLabel Factura_TituloCodigo;
    private javax.swing.JLabel Factura_TituloDatosClientes;
    private javax.swing.JLabel Factura_TituloDatosProductos;
    private javax.swing.JLabel Factura_TituloDescripcion;
    private javax.swing.JLabel Factura_TituloDocumento;
    private javax.swing.JLabel Factura_TituloEmail;
    private javax.swing.JLabel Factura_TituloNombre;
    private javax.swing.JLabel Factura_TituloPrecio;
    private javax.swing.JLabel Factura_TituloStock;
    private javax.swing.JLabel Factura_TituloTelefono;
    private javax.swing.JLabel Menu_Clientes;
    private javax.swing.JLabel Menu_Facturas;
    private javax.swing.JLabel Menu_Foto;
    private javax.swing.JLabel Menu_Inicio;
    private javax.swing.JPanel Menu_PanelMenu;
    private javax.swing.JLabel Menu_Proveedor;
    private javax.swing.JLabel Menu_Roles;
    private javax.swing.JLabel Menu_Salir;
    private javax.swing.JSeparator Menu_Separador2;
    private javax.swing.JSeparator Menu_Separador3;
    // End of variables declaration//GEN-END:variables
}
