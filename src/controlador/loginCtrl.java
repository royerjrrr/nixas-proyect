package controlador;

import java.awt.Color;
import java.awt.FontFormatException;
import vista.*;
import modelo.*;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class loginCtrl implements ActionListener {

    regEmpleado reG = new regEmpleado() {};
    regEmpleadoDAO emD = new regEmpleadoDAO();
    ventanaLogin ventana;
    MenuAdmin admin = new MenuAdmin();
    DefaultTableModel modelo = new DefaultTableModel();
    clienteDAO cli = new clienteDAO();
    proCatDAO proDAO = new proCatDAO();
    mesasDAO mDAO = new mesasDAO();

    public loginCtrl(ventanaLogin ventana) throws FontFormatException, IOException {
        this.ventana = new ventanaLogin();
        this.ventana = ventana;
        this.ventana.BtnLogin.addActionListener(this);
    }

    public loginCtrl(MenuAdmin admin) throws FontFormatException, IOException, SQLException {
        this.ventana = new ventanaLogin();
        this.admin = admin;
        this.admin.btnAgregarC.addActionListener(this);
        this.admin.btnAgregarEm.addActionListener(this);
        this.admin.cmbEmpleado.addActionListener(this);
        this.admin.jmiOrdenes.addActionListener(this);
        this.admin.jmiClientes.addActionListener(this);
        this.admin.jmiProductos.addActionListener(this);
        this.admin.jmiEmpleado.addActionListener(this);
        this.admin.jmiClienteConsu.addActionListener(this);
        this.admin.jmiEmpleadoConsu.addActionListener(this);
        this.admin.cerrar.addActionListener(this);
        this.admin.btnPorcion.addActionListener(this);
        this.admin.btnConsultarEm.addActionListener(this);
        this.admin.btnEliminarEmp.addActionListener(this);
        this.admin.btnConsultaCL.addActionListener(this);
        this.admin.btnEliminarClie.addActionListener(this);
        this.admin.btnActblE.addActionListener(this);
        this.admin.btnActbCli.addActionListener(this);
        this.admin.btnModificarEmpl.addActionListener(this);
        this.proDAO.categoria(admin.cmbPorcion);
        this.admin.btnActuaMesa.addActionListener(this);

    }

     public void listarMesas(JTable tblEleccionMesa) throws SQLException{
        System.out.println("aa");
        modelo = (DefaultTableModel) tblEleccionMesa.getModel();
        modelo.setRowCount(0); // Limpiar modelo de la tabla antes de agregar nuevos datos
        
        try{
            List<mesas> estadoMes = mDAO.estadoMesas();
             Object[] object = new Object[2];
             
             for (int i =0; i <estadoMes.size(); i++ ){
                  object[0] = estadoMes.get(i).getIdMesas();
                  object[1] = estadoMes.get(i).getEstadoMesa();
                  
                  modelo.addRow(object);
             }     
         modelo.fireTableDataChanged(); // Notificar a la vista que los datos han cambiado
        } catch (SQLException ex) {
            Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //CAMBIAR PANELES
    public void pedidosAggPaneles() {
        admin.jTabbedPane.setSelectedIndex(1);
    }

    public void clienteAggPaneles() {
        admin.jTabbedPane.setSelectedIndex(2);
    }

    public void empleadosAggPaneles() {
        admin.jTabbedPane.setSelectedIndex(3);
    }

    public void productosAggPaneles() {
        admin.jTabbedPane.setSelectedIndex(4);
    }

    public void clienteConsuPaneles() {
        admin.jTabbedPane.setSelectedIndex(5);
    }

    public void empleadoConsuPaneles() {
        admin.jTabbedPane.setSelectedIndex(6);
    }

    public void cerrarSesion() throws FontFormatException, IOException {
        int a = JOptionPane.showConfirmDialog(admin.cerrar, "¿Desea cerrar sesion?");
        if (a == JOptionPane.YES_OPTION) {
            admin.dispose();
            ventanaLogin login = new ventanaLogin();
            loginCtrl lox = new loginCtrl(login);
            login.setVisible(true);
        }
    }

    //Metodo del login
    public void btnIngresar() throws FontFormatException, IOException, SQLException {
        String user = ventana.CampoUsuario.getText();
        String clave = new String(ventana.CampoContraseña.getText());
        reG.setUserEmpl(user);
        reG.setClaveEmpl(hash.sha1(clave));
        int rol = emD.autenticacionRol(reG);
        admin.jmiProductos.setEnabled(false);
        admin.jmiClienteConsu.setVisible(true);
        switch (rol) {
            case 111:
                MenuAdmin m = new MenuAdmin();
                loginCtrl lx = new loginCtrl(m);
                m.iniciar();
                System.out.println(rol);
                m.lblRoles.setText(Integer.toString(rol));
                admin.jmiProductos.setEnabled(true);
                ventana.setVisible(false);
                break;
            case 222:
                MenuAdmin cajero = new MenuAdmin();
                loginCtrl lgx = new loginCtrl(cajero);
                cajero.iniciar();
                admin.jmiClienteConsu.setVisible(false);
                cajero.lblRoles.setText(Integer.toString(rol));
                ventana.setVisible(false);
                break;
            default:
                System.out.println("Rol no encontrado");
                break;
        }
    }

    public void listarClientes(JTable tblClientes) {
        modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setRowCount(0); // Limpiar modelo de la tabla antes de agregar nuevos datos

        try {
            List<regEmpleado> listarClientes = cli.listarCliente();
            Object[] object = new Object[6];

            for (int i = 0; i < listarClientes.size(); i++) {
                object[0] = listarClientes.get(i).getIdEmpl();
                object[1] = listarClientes.get(i).getNombreEmpl();
                object[2] = listarClientes.get(i).getApellidoEmpl();
                object[3] = listarClientes.get(i).getCedulaEmpl();
                object[4] = listarClientes.get(i).getDireccion();
                object[5] = listarClientes.get(i).getCelEmpl();
                
                modelo.addRow(object);
            }

            modelo.fireTableDataChanged(); // Notificar a la vista que los datos han cambiado
        } catch (SQLException ex) {
            Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void btnAgregarCliente() {
        regEmpleado cliente = new regEmpleado() {
        };
        clienteDAO cliD = new clienteDAO();

        String nombreCliente = admin.txtNombreC.getText();
        String apellidoCliente = admin.txtApellidoC.getText();
        Integer cedulaCliente = 0;
        Integer celularCliente = 0;

        try {
            if (!admin.txtCedulaC.getText().isEmpty()) {
                cedulaCliente = Integer.parseInt(admin.txtCedulaC.getText());
            }
            if (!admin.txtTelefonoC.getText().isEmpty()) {
                celularCliente = Integer.parseInt(admin.txtTelefonoC.getText());
            }

            String direccionCliente = admin.txtDireccionC.getText();
            System.out.println(direccionCliente);
            cliente.setNombreEmpl(nombreCliente);
            cliente.setApellidoEmpl(apellidoCliente);
            cliente.setCedulaEmpl(cedulaCliente);
            cliente.setDireccion(direccionCliente);
            cliente.setCelEmpl(celularCliente);
            

            int r = cliD.agregarCliente(cliente);
            if (r == 1) {
                JOptionPane.showMessageDialog(admin, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(admin, "Error al registrar cliente");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(admin, "Error en el formato de datos. Verifica los campos numéricos.");
        }

        limpiartabla();
        listarClientes(admin.tblClientes); // Actualizar tabla de clientes
    }

    public void btnConsultarCliente(JTable tblClientes) {
        regEmpleado cliente = new regEmpleado() {
        };
        Integer cedula = 0;
        String nombre = admin.txtConsulatCL.getText();

        if (!admin.txtConsulatCL.getText().isEmpty()) {
            try {
                cedula = Integer.parseInt(admin.txtConsulatCL.getText());
                cliente.setCedulaEmpl(cedula);
            } catch (NumberFormatException e) {
                // No es un número de cédula válido
                cliente.setNombreEmpl(nombre);
            }
        }
        try {
            List<regEmpleado> empleadosEncontrados;
            if (cedula != 0) {
                // Buscar por cédula
                empleadosEncontrados = cli.buscarCedCliente(cliente);
                admin.txtConsulatCL.setText("");
            } else if (!nombre.isEmpty()) {
                // Buscar por nombre si no se ingresó una cédula válida
                cliente.setNombreEmpl(nombre);
                empleadosEncontrados = cli.buscarNomCliente(cliente);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cédula o un nombre válido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            actualizarTablaCliente(empleadosEncontrados, tblClientes);
            admin.txtConsultarEm.setText(""); // Limpiar el campo de consulta después de la búsqueda
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void btnEliminarCliente() {
        regEmpleado cliente = new regEmpleado() {
        };
        Integer cedula = 0;
        if (!admin.txtConsulatCL.getText().isEmpty()) {
            try {
                cedula = Integer.parseInt(admin.txtConsulatCL.getText());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número de cédula válido", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si la cédula no es válida
            }
            cliente.setCedulaEmpl(cedula);
        }
        if (cedula != 0) {
            try {
                cli.eliminarCliente(cliente);
                JOptionPane.showMessageDialog(null, "Cliente eliminado ");
                admin.txtConsulatCL.setText(""); // Limpiar el campo de consulta después de la búsqueda
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al buscar Cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar una cédula válida", "Error", JOptionPane.ERROR_MESSAGE);
        }
        listarClientes(admin.tblClientes);
    }

    public void actualizarTablaCliente(List<regEmpleado> cliente, JTable tblClientes) {
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setRowCount(0); // Limpiar modelo de la tabla antes de agregar nuevos datos

        for (regEmpleado clien : cliente) {
            Object[] fila = {
                clien.getIdEmpl(),
                clien.getNombreEmpl(),
                clien.getApellidoEmpl(),
                clien.getCedulaEmpl(),
                clien.getCelEmpl(),
                clien.getDireccion(),};
            modelo.addRow(fila);
        }

        modelo.fireTableDataChanged(); // Notificar a la vista que los datos han cambiado
    }

    public void limpiarcajasCliente() {
        admin.txtNombreC.setText(null);
        admin.txtApellidoC.setText(null);
        admin.txtCedulaC.setText(null);
        admin.txtTelefonoC.setText(null);
        admin.txtDireccionC.setText(null);
        // admin.txtCedulaC.requestFocus();
    }

    public void btnAgregarEmple() throws SQLException {
        regEmpleado empleado = new regEmpleado(){};
        regEmpleadoDAO dao = new regEmpleadoDAO();

        String nombreEm = admin.txtNombreE.getText();
        String apellidoEm = admin.txtApellidoE.getText();
        String usuarioEm = admin.txtUserE.getText();
        String claveEm = new String(admin.txtClaveE.getText());
        int id_rol = 0;
        Integer docEmp = 0;
        Integer celEm = 0;

        try {
            if (!admin.txtDocE.getText().isEmpty()) {
                docEmp = Integer.parseInt(admin.txtDocE.getText());
            }
            if (!admin.txtCelE.getText().isEmpty()) {
                celEm = Integer.parseInt(admin.txtCelE.getText());
            }
            if (admin.cmbEmpleado.getSelectedItem().equals("Admin")) {
                id_rol = 111;
            } else if (admin.cmbEmpleado.getSelectedItem().equals("Cajero")) {
                id_rol = 222;
            }

            empleado.setNombreEmpl(nombreEm);
            empleado.setApellidoEmpl(apellidoEm);
            empleado.setCedulaEmpl(docEmp);
            empleado.setCelEmpl(celEm);
            empleado.setUserEmpl(usuarioEm);
            empleado.setClaveEmpl(hash.sha1(claveEm));
            empleado.setIdRol(id_rol);

            int r = dao.agregarEmpleado(empleado);

            if (r == 1) {
                JOptionPane.showMessageDialog(admin, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(admin, "Error al registrar empleado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(admin, "Error en el formato de datos. Verifica los campos numéricos.");
        }
        listarEmpleado(admin.tblEmpleados);
      limpiartabla();
    }

    public void btnModificarEmple() throws SQLException {
        regEmpleado em = new regEmpleado() {
        };
        regEmpleadoDAO dao = new regEmpleadoDAO();
        int id_rol = 0;
        if ("".equals(admin.txtIdConsuEmpl.getText())) {
            JOptionPane.showMessageDialog(admin, "Selecciona la ");
        } else {
            em.setIdEmpl(Integer.parseInt(admin.txtIdConsuEmpl.getText()));
            em.setNombreEmpl(admin.txtNombreConsuEmpl.getText());
            em.setApellidoEmpl(admin.txtIdConsuEmpl.getText());
            em.setCedulaEmpl(Integer.parseInt(admin.txtCedulaConseEmpl.getText()));
            em.setCelEmpl(Integer.parseInt(admin.txtTelefonoConsuEmpl.getText()));
            em.setUserEmpl(admin.txtIdConsuEmpl.getText());
            em.setClaveEmpl(admin.txtCedulaConseEmpl.getText());
            if (admin.cmbEmpleado.getSelectedItem().equals("Admin")) {
                id_rol = 111;
            } else if (admin.cmbEmpleado.getSelectedItem().equals("Cajero")) {
                id_rol = 222;
            }
            em.setIdRol(id_rol);
        }
        dao.actualizarEmpleado(em);
        listarEmpleado(admin.tblEmpleados);
        JOptionPane.showMessageDialog(admin, "Correcto");
    }

    public void btnConsultarEmpleado(JTable tblEmpleado) throws SQLException {
        regEmpleado empleado = new regEmpleado() {
        };
        Integer cedula = 0;
        String nombre = admin.txtConsultarEm.getText();

        if (!admin.txtConsultarEm.getText().isEmpty()) {
            try {
                cedula = Integer.parseInt(admin.txtConsultarEm.getText());
                empleado.setCedulaEmpl(cedula);
            } catch (NumberFormatException e) {
                // No es un número de cédula válido
                empleado.setNombreEmpl(nombre);
            }
        }
        try {
            List<regEmpleado> empleadosEncontrados;
            if (cedula != 0) {
                // Buscar por cédula
                empleadosEncontrados = emD.buscarCedEmpleado(empleado);
            } else if (!nombre.isEmpty()) {
                // Buscar por nombre si no se ingresó una cédula válida
                empleado.setNombreEmpl(nombre);
                empleadosEncontrados = emD.buscarNomEmpleado(empleado);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cédula o un nombre válido", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            actualizarTablaEmpleados(empleadosEncontrados, tblEmpleado);
            admin.txtConsultarEm.setText(""); // Limpiar el campo de consulta después de la búsqueda
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void btnEliminarEmpleado() {
        regEmpleado empleado = new regEmpleado() {
        };
        Integer cedula = 0;
        if (!admin.txtConsultarEm.getText().isEmpty()) {
            try {
                cedula = Integer.parseInt(admin.txtConsultarEm.getText());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número de cédula válido", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si la cédula no es válida
            }
            empleado.setCedulaEmpl(cedula);
        }
        if (cedula != 0) {
            try {
                emD.eliminarEmpleado(empleado);
                JOptionPane.showMessageDialog(null, "Empleado eliminado ");
                admin.txtConsultarEm.setText(""); // Limpiar el campo de consulta después de la búsqueda
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al buscar empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar una cédula válida", "Error", JOptionPane.ERROR_MESSAGE);
        }
        listarEmpleado(admin.tblEmpleados);
    }

    public void listarEmpleado(JTable tblEmpleado) {
        modelo = (DefaultTableModel) tblEmpleado.getModel();
        modelo.setRowCount(0);

        try {
            List<regEmpleado> listarEmpleado = emD.listarEmpleado();
            Object[] object = new Object[9];

            for (int i = 0; i < listarEmpleado.size(); i++) {
                object[0] = listarEmpleado.get(i).getIdEmpl();
                object[1] = listarEmpleado.get(i).getNombreEmpl();
                object[2] = listarEmpleado.get(i).getApellidoEmpl();
                object[3] = listarEmpleado.get(i).getCedulaEmpl();
                object[4] = listarEmpleado.get(i).getCelEmpl();
                object[5] = listarEmpleado.get(i).getIdRol();
                object[6] = listarEmpleado.get(i).getUserEmpl();
                object[7] = listarEmpleado.get(i).getClaveEmpl();
                modelo.addRow(object);
            }
            modelo.fireTableDataChanged();
        } catch (SQLException e) {
            Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public void limpiarcajasEmpleado() {
        admin.txtNombreE.setText(null);
        admin.txtApellidoE.setText(null);
        admin.txtUserE.setText(null);
        admin.txtClaveE.setText(null);
        admin.txtDocE.setText(null);
        admin.txtCelE.setText(null);
        admin.txtDocE.requestFocus();
    }

    public void actualizarTablaEmpleados(List<regEmpleado> empleados, JTable tblEmpleado) {
        DefaultTableModel modelo = (DefaultTableModel) tblEmpleado.getModel();
        modelo.setRowCount(0); // Limpiar modelo de la tabla antes de agregar nuevos datos

        for (regEmpleado empleado : empleados) {
            Object[] fila = {
                empleado.getIdEmpl(),
                empleado.getNombreEmpl(),
                empleado.getApellidoEmpl(),
                empleado.getCedulaEmpl(),
                empleado.getCelEmpl(),
                empleado.getIdRol(),
                empleado.getUserEmpl(),
                empleado.getClaveEmpl()
            };
            modelo.addRow(fila);
        }

        modelo.fireTableDataChanged(); // Notificar a la vista que los datos han cambiado
    }

    //Metodos de prociones
    public void btnAgregarPorcion() {
        producto prod = new producto() {
        };
        porcionesDAO porDAO = new porcionesDAO();
        bebidasDAO be = new bebidasDAO();
        String nombreB, nombreC;
        int cantidadB = 0;
        float precioB = 0;
        int cantidadC = 0;
        float precioC = 0;
        int id = 0;
        int r = 0;
        System.out.println("g");
        try {
            if (admin.cmbPorcion.getSelectedItem().equals("Bebidas")) {
                id = 1;
                nombreB = admin.txtNombreP.getText();

                if (!admin.txtCantidadP.getText().isEmpty()) {
                    cantidadB = Integer.parseInt(admin.txtCantidadP.getText());
                }
                if (!admin.txtPrecioP.getText().isEmpty()) {
                    precioB = Float.parseFloat(admin.txtPrecioP.getText());
                }

                prod.setNombreProd(nombreB);
                prod.setCantidad(cantidadB);
                prod.setPrecio(precioB);
                r = be.agregarBebidas(prod);
                if (r == 1) {
                    JOptionPane.showMessageDialog(admin, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(admin, "Error al registrar empleado");
                }
            } //METODO DE AGG COMIDA
            else if (admin.cmbPorcion.getSelectedItem().equals("Comida")) {
                id = 1;
                nombreC = admin.txtNombreP.getText();

                if (!admin.txtCantidadP.getText().isEmpty()) {
                    cantidadC = Integer.parseInt(admin.txtCantidadP.getText());
                }
                if (!admin.txtPrecioP.getText().isEmpty()) {
                    precioC = Float.parseFloat(admin.txtPrecioP.getText());
                }
                prod.setNombreProd(nombreC);
                prod.setCantidad(cantidadC);
                prod.setPrecio(precioC);
                r = porDAO.agregarPorciones(prod);
                if (r == 1) {
                    JOptionPane.showMessageDialog(admin, "Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(admin, "Error al registrar empleado");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(admin, "Error en el formato de datos. Verifica los campos numéricos.");
        }
        //Guardar datos de BEBIDAS

    }

    public void limpiartabla() {
        int rowCount = modelo.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Cambios de paneles
        if (e.getSource() == admin.jmiOrdenes) {
            pedidosAggPaneles();
        }
        if (e.getSource() == admin.jmiClientes) {

            clienteAggPaneles();
        }
        if (e.getSource() == admin.jmiEmpleado) {
            empleadosAggPaneles();
        }
        if (e.getSource() == admin.jmiProductos) {
            productosAggPaneles();
        }
        if (e.getSource() == admin.jmiClienteConsu) {
            clienteConsuPaneles();
            listarClientes(admin.tblClientes);

        }
        if (e.getSource() == admin.jmiEmpleadoConsu) {
            empleadoConsuPaneles();
            listarEmpleado(admin.tblEmpleados);

        }
        if (e.getSource() == admin.cerrar) {
            try {
                cerrarSesion();
            } catch (FontFormatException ex) {
                Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Ingreso al login
        if (e.getSource() == ventana.BtnLogin) {
            if (ventana.CampoUsuario.getText().isEmpty() || ventana.CampoContraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
                ventana.CampoContraseña.requestFocus();
            } else {
                try {
                    try {
                        btnIngresar();
                    } catch (SQLException ex) {
                        Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (FontFormatException ex) {
                    Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (e.getSource() == admin.btnAgregarC) {
            if (admin.txtNombreC.getText().isEmpty() || admin.txtApellidoC.getText().isEmpty()
                    || admin.txtCedulaC.getText().isEmpty() || admin.txtTelefonoC.getText().isEmpty()
                    || admin.txtDireccionC.getText().isEmpty() || admin.txtCedulaC.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Debes llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
                admin.txtCedulaC.requestFocus();
            } else {
                btnAgregarCliente();
                limpiarcajasCliente();
                limpiartabla();
                listarClientes(admin.tblClientes);
            }
        }

        if (e.getSource() == admin.btnAgregarEm) {
            if (admin.txtNombreE.getText().isEmpty() || admin.txtApellidoE.getText().isEmpty()
                    || admin.txtDocE.getText().isEmpty() || admin.txtCelE.getText().isEmpty()
                    || admin.txtUserE.getText().isEmpty() || admin.txtClaveE.getText().isEmpty()
                    || admin.cmbEmpleado.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Debes llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
                admin.txtDocE.requestFocus();
            } else {
                try {
                    btnAgregarEmple();
                    limpiarcajasEmpleado();
                    limpiartabla();
                    listarEmpleado(admin.tblEmpleados);
                } catch (SQLException ex) {
                    Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        if (e.getSource() == admin.btnModificarEmpl) {
            if (admin.txtNombreConsuEmpl.getText().isEmpty() || admin.txtIdConsuEmpl.getText().isEmpty()
                    || admin.txtCedulaConseEmpl.getText().isEmpty() || admin.txtTelefonoConsuEmpl.getText().isEmpty()
                    || admin.txtUserConsuEmpl.getText().isEmpty() || admin.txtClaveConsuEmpl.getText().isEmpty()
                    || admin.jcmRConsuEmpl.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Debes llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
                admin.txtDocE.requestFocus();
            } else {
                try {
                    btnModificarEmple();
                    limpiarcajasEmpleado();
                    limpiartabla();
                    listarEmpleado(admin.tblEmpleados);
                } catch (SQLException ex) {
                    Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        if (e.getSource() == admin.btnPorcion) {
            btnAgregarPorcion();
        }
        if (e.getSource() == admin.btnConsultarEm) {
            try {
                btnConsultarEmpleado(admin.tblEmpleados);
            } catch (SQLException ex) {
                Logger.getLogger(loginCtrl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == admin.btnEliminarEmp) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                btnEliminarEmpleado();
                listarEmpleado(admin.tblEmpleados);
            }
        }
        if (e.getSource() == admin.btnConsultaCL) {
            btnConsultarCliente(admin.tblClientes);
        }
        if (e.getSource() == admin.btnEliminarClie) {
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar");
            if (pregunta == 0) {
                btnEliminarCliente();
                listarClientes(admin.tblClientes);
            }
        }
        if (e.getSource() == admin.btnActbCli) {
            listarClientes(admin.tblClientes);

        }
        if (e.getSource() == admin.btnActblE) {
            listarEmpleado(admin.tblEmpleados);
        }
        if(e.getSource()== admin.btnActuaMesa){
            try {
                listarMesas(admin.tblEleccionMesa);
            } catch (SQLException ex) {
                System.out.println(ex);       
            }
        }
    }
    
}
