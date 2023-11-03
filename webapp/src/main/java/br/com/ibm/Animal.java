package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "Animal", urlPatterns = {"/animal"})
public class Animal extends HttpServlet {
    private String nome;
    private int idade;

    public void Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void comer(){

        System.out.printf("%s comeu \n", nome);
    }
    public void beber(){
        System.out.printf("%s bebeu\n", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        Animal animal1 = new Animal();
        animal1.setNome("Judite");
        animal1.setIdade(15);

        request.setAttribute("Nome", animal1.getNome());
        request.setAttribute("Idade", animal1.getIdade());


        RequestDispatcher dispatcher = request.getRequestDispatcher("/animal.jsp");
        dispatcher.forward(request, response);
    }
}