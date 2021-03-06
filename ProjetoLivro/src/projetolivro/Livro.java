/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolivro;

/**
 *
 * @author Sérgio
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public void detalhes(){
        System.out.println("titulo:"+this.getTitulo());
        System.out.println("autor:"+this.getAutor());
        System.out.println("Total Paginas:"+this.getTotPaginas());
        System.out.println("pagina atual:"+this.getPagAtual());
        System.out.println("aberto:"+this.isAberto());
        System.out.println("Leitor:"+this.getLeitor().getNome());
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p <= this.totPaginas && p >=0)
            this.pagAtual = p;
        else
            System.out.println("essa pagina nao existe!");
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual()==this.getTotPaginas())
            System.out.println("Já está na ultima pagina!");
        else
            this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual()==0)
            System.out.println("Já está na primeira pagina!");
        else
            this.setPagAtual(this.getPagAtual()-1);
    }
    
}
