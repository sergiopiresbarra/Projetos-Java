import java.util.ArrayList;
/*
public class Main {
    public static void main(String[] args) {
        //tipos primitivos
        //var name = "sergio";
        //byte age = 22;
        //boolean b = true;
        //char letra = 'o';
        //String nome = "sergio";
        float idade = 22.50f;

        //condicionais
        if(idade > 22.60f){
            System.out.println("maior");
        } else if (idade == 22.60f) {
            System.out.println("igual");
        } else {
            System.out.println("menor");
        }

        //vetores
        //int[] idades = {2,3,4};
        int[] idades = new int[10];
        //idades.length
        String[] nomes = new String[10];
        boolean[] saoBrasileiros = new boolean[10];
        idades[0] = 4;

        //ArrayList (lita de tamanho dinamico)
        //nao esquecer de importar: import java.util.ArrayList;
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(22);
        ages.add(50);
        ages.add(30);
        ages.remove(0);
        System.out.println(ages.get(1));
        System.out.println(ages.size());

        //loops
        for(var i = 0; i < 2; i++){
            System.out.println("for");
        }

        int i = 0;
        while(i < 2){
            System.out.println("while");
            i++;
        }

        //Casting
        int i1 = 22;
        double i2 = i1;
        i1 = (int)i2;

        char letra = 'a';
        String n = String.valueOf(letra);
        letra = n.charAt(0);
        String n2 = String.valueOf(i1);
        int i3 = Integer.parseInt(n2);


    }
}
*/

/*
public class Main {
    String nome;

    static String nome2;

    public static void main(String[] args){
        System.out.println(nome2);
    }

    static void teste(){

    }

    void declaraNome(){
        System.out.println(nome2);
        Main.teste();
        nome = "Sergio";

        Main meuMain = new Main();
        System.out.println(meuMain.nome);
    }

    String getNome(){
        return nome;
    }
}

*/

/*
public class Main {
    String nome;
    int idade;
    public static void main(){

    }

    //construtor
    public Main(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Main(String nome){
        this.nome = nome;
    }
}

class Pessoa{
    void criaMain(){
        Main meuMain = new Main("sergio");

    }
}
*/

public class Main {
    public String name;
    protected int salary;

    public static void main(String[] args){
        Ser meuSerAnimal = new Cachorro("bob", 22, "kipper");
        Ser meuSerHumano = new Pessoa("Sergio", 28, "barra");
        meuSerAnimal.setNome("Rex");
        System.out.println(meuSerAnimal.saudacao());
        System.out.println(meuSerHumano.saudacao());
    }
    private void atualizaSalario(){
        this.salary = 4000;
    }
    public int getSalary(){
        return this.salary;
    }
}

