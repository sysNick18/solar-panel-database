/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Placa {
    private String tipoPlaca;
    private int potencia;
    private int eficiencia;
    private int celulas;
    private String material;
    private int codigo;

    public String getTipoPlaca() {
        return tipoPlaca;
    }

    public void setTipoPlaca(String tipoPlaca) {
        this.tipoPlaca = tipoPlaca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = (int) potencia;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = (int) eficiencia;
    }

    public int getCelulas() {
        return celulas;
    }

    public void setCelulas(int celulas) {
        this.celulas = celulas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void inserir() {
        // 1: Definir o comando SQL
        String sql = "INSERT INTO Placas (tipoPlaca, potencia, eficiencia, celulas, material) VALUES (?, ?, ?, ?, ?)";
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Preenche os dados faltantes
            ps.setString(1, tipoPlaca);
            ps.setInt(2, (int) potencia);
            ps.setInt(3, (int) eficiencia);
            ps.setInt(4, celulas);
            ps.setString(5, material);
            // 5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar() throws SQLException {
        // 1: Definir o comando SQL
        String sql = "UPDATE Placas SET tipoPlaca = ?, potencia = ?, eficiencia = ?, celulas = ?, material = ? WHERE codigo = ?";
        // 2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()) {
            // 3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            // 4: Preenche os dados faltantes
            ps.setString(1, tipoPlaca);
            ps.setDouble(2, potencia);
            ps.setDouble(3, eficiencia);
            ps.setInt(4, celulas);
            ps.setString(5, material);
            ps.setInt(6, codigo);
            // 5: Executa o comando            // 5: Executa o comando
        }
    }
    public void apagar() {
//1: Definir o comando SQL
        String sql = "DELETE FROM Placas WHERE codigo = ?";
//2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (java.sql.Connection c = (java.sql.Connection) factory.obtemConexao()) {
//3: Pré compila o comando
            java.sql.PreparedStatement ps = (java.sql.PreparedStatement) c.prepareStatement(sql);
//4: Preenche os dados faltantes
            ps.setInt(1, codigo);
//5: Executa o comando
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void listar() {
//1: Definir o comando SQL
        String sql = "SELECT * FROM Placas";
//2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (java.sql.Connection c = (java.sql.Connection) factory.obtemConexao()) {
//3: Pré compila o comando
            java.sql.PreparedStatement ps = (java.sql.PreparedStatement) c.prepareStatement(sql);
//4: Executa o comando e guarda
//o resultado em um ResultSet
            ResultSet rs = ps.executeQuery();
//5: itera sobre o resultado
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String tipoPlaca = rs.getString("tipoPlaca");
                int potencia = rs.getInt("potencia");
                int eficiencia = rs.getInt("eficiencia");
                int celulas = rs.getInt("celulas");
                String material = rs.getString("material");
                String aux = String.format(
                        "Código: %d, tipoPlaca: %s, Potencia: %s, Eficiencia: %s, Celulas: %s, Material: %s",
                        codigo,
                        tipoPlaca,
                        potencia,
                        eficiencia,
                        celulas,
                        material
                      );
            
                JOptionPane.showMessageDialog(null, aux);
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
  }
}