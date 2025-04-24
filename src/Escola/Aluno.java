/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola;

/**
 *
 * @author vinicius_4820
 */
public class Aluno {
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    private String nome;
    private int idade;
    
    public void enviarDados(){
    
            System.out.println("O nome do Aluno e: " + getNome());
            System.out.println("A idade: " + getIdade() + " Anos");
    }
}
