/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bd;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n5-CadastrarPlacas\n6-ListarPlacas\n7-ApagarPlacas\n0-Sair";
        int op;
        int op2;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1: {
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("Email?");
                    Pessoa p = new Pessoa();
                    p.setNome(nome);
                    p.setFone(fone);
                    p.setEmail(email);
                    p.inserir();

                    break;
                }
                case 2: {
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("Email?");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                    Pessoa p = new Pessoa();
                    p.setNome(nome);
                    p.setFone(fone);
                    p.setEmail(email);
                    p.setCodigo(codigo);
                    p.atualizar();
                    break;
                }
                case 3: {
                    int codigo
                            = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                    Pessoa p = new Pessoa();
                    p.setCodigo(codigo);
                    p.apagar();
                    break;
                }
                case 4: {
                    Pessoa p = new Pessoa();
                    p.listar();
                    break;
                }
                case 5: {
                    String tipoPlaca = JOptionPane.showInputDialog("Tipo Placa?");
                    int potencia = Integer.parseInt(JOptionPane.showInputDialog("Potencia?"));
                    int eficiencia = Integer.parseInt(JOptionPane.showInputDialog("Eficiencia?"));
                    int celulas = Integer.parseInt(JOptionPane.showInputDialog("Celulas?"));
                    String material = JOptionPane.showInputDialog("Material?");
                    Placa pl = new Placa();
                    pl.setTipoPlaca(tipoPlaca);
                    pl.setEficiencia(eficiencia);
                    pl.setMaterial(material);
                    pl.setPotencia(potencia);
                    pl.setCelulas(celulas);
                    pl.inserir();
                    break;
                }
                case 6: {
                    Placa pl = new Placa();
                    pl.listar();
                    break;
                }
                case 7: {
                    int codigo
                            = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
                    Placa pl = new Placa();
                    pl.setCodigo(codigo);
                    pl.apagar();
                    break;
                }
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 0);
    }
}



    

