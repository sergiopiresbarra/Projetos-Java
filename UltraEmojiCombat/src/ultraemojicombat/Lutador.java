/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author Sérgio
 */
public class Lutador {
    //atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    //metodos publicos
    public void apresentar(){
        System.out.println("---------------------------------------");
        System.out.println("apresentamos o lutador "+this.getNome());
        System.out.println("diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade()+ " anos e "+this.getAltura());
        System.out.println("pesando "+this.getPeso() + "kg");
        System.out.println(this.getVitorias() + "vitorias");
        System.out.println(this.getDerrotas()+"derrotas");
        System.out.println(this.getEmpates()+"empates");
    }
    public void status(){
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("ganhou "+this.getVitorias() + "vezes");
        System.out.println("perdeu "+this.getDerrotas()+"vezes");
        System.out.println("empatou "+this.getEmpates()+"vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "invalido";
        }else if (this.peso <= 70.3) {
            this.categoria = "leve";
        }else if (this.peso <=83.9) {
            this.categoria = "medio";
        }else if (this.peso <=120.2) {
            this.categoria = "pesado";
        }else{
            this.categoria = "invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
}
