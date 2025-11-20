import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao;
        List<Receita> receitas = new ArrayList<>();
        List<Ingredientes> ingredientes = new ArrayList<>();
        //Ingredientes in = new Ingredientes(null, opcao, false);

        do {
            System.out.println("###### Menu de Receitas ######");
            System.out.println("1- Cadastrar Receita");
            System.out.println("2- Cadastrar Ingredientes");
            System.out.println("3- Listar Receitas");
            System.out.println("4- Buscar Receita por Ingredientes");
            System.out.println("5- Excluir Receita");
            System.out.println("6- Alterar receita: ");
            System.out.println("7- Alterar Ingredientes: ");
            System.out.println("8- Listar por tipo: ");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: "); opcao = sc.nextInt();
            sc.nextLine();
        
      
            switch (opcao) {
            case 1:
                System.out.println("**** Cadastrar Receita ****");
                if (ingredientes.isEmpty()) {
                    System.out.println("Nenhum Ingredientes cadastrado.");
                    break;
                } else {
                    System.out.println("Nome da Receita: ");
                    String nomeReceita = sc.nextLine();
                    System.out.println("Tipo da receita: ");
                    String tipoReceita = sc.nextLine();
                    System.out.println("Modo de preparo: ");
                    String modoDepreparo = sc.nextLine();
                    System.out.println("Tempo de Receita em minutos: ");
                    int tempoPreparo = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < ingredientes.size(); i++) {
                        System.out.println(i + " - " + ingredientes.get(i));
                    }
                    int ingredienteEscolhido = sc.nextInt();
                    sc.nextLine();
                    Receita novaReceita = new Receita(nomeReceita, tempoPreparo, tipoReceita, modoDepreparo);
                    novaReceita.AdicionarIngrediente(ingredientes.get(ingredienteEscolhido));
                    receitas.add(novaReceita);
                    
                    break;
                }
            case 2:
                System.out.println("**** Cadastrar Ingredientes ****");
                System.out.println("Nome Ingredientes: ");
                String nomeIngrediente = sc.nextLine();
                System.out.println("Quantidade: ");
                int quantidadeIngredientes = sc.nextInt();
                sc.nextLine();
                System.out.println("Perecivel: ");
                try{
                    boolean perecivel = sc.nextBoolean();
                    sc.nextLine();
                    Ingredientes novoIngrediente = new Ingredientes(nomeIngrediente, quantidadeIngredientes, perecivel);
                    ingredientes.add(novoIngrediente);
                    System.out.println(ingredientes);
                    
                } catch (Exception e) {
                    
                    System.out.println("0 ou 1");
                    sc.nextLine();
                }
                break;

            case 3:
                System.out.println("*** Listar receitas ***");
                System.out.println(receitas);
                break;

            case 4:
                System.out.println("*** Buscar Receita por Ingredientes ***");
                for (int j = 0; j < ingredientes.size(); j++) {
                    System.out.println(j + " - " + ingredientes.get(j));
                }
                int ing = sc.nextInt();
                sc.nextLine();
                Ingredientes ingredienteBuscado = ingredientes.get(ing);
                
                List<Receita> receitasEncontradas = receitas.stream()
                        .filter(receita -> receita.listaIngredientes().contains(ingredienteBuscado))
                        .collect(Collectors.toList());
                System.out.println("Receitas que contêm '" + ingredienteBuscado.getNomeIngrediente() + "':");
                System.out.println("Digite o indice do Ingredientes a ser buscado: ");
                int ingredienteParaBuscar = sc.nextInt();
                sc.nextLine();
                for (Receita receita : receitas) {
                    System.out.println(receita.listaIngredientes());
                }
                break;

            case 5:
                System.out.println("Excluir Receita: ");
                System.out.println(receitas);
                System.out.println("Digite o nome da receita a ser excluída: ");
                String receitaParaExcluir = sc.nextLine();
                System.err.println(receitas.remove(receitaParaExcluir));
                break;
           
            case 6:
                System.out.println("*** Alterar Receita ***");
                for (int i = 0; i < receitas.size(); i++) {
                    System.out.println(i + " - " + receitas.get(i));
                }
                System.out.println("Digite o indice da receita a ser alterada: ");
                int receitaParaAlterar = sc.nextInt();
                sc.nextLine();
                System.out.println("Nome da Receita: ");
                String novoNome = sc.nextLine();
                System.out.println("Tipo da receita: ");
                String novoTipo = sc.nextLine();
                System.out.println("Tempo de Receita em minutos: ");
                int novoTempoReceita = sc.nextInt();
                sc.nextLine();
                System.out.println(ingredientes);
                System.out.println("Ingredientes: ");
                String novosIngrediente = sc.nextLine();
                
                receitas.get(receitaParaAlterar).setNomeReceita(novoNome);
                receitas.get(receitaParaAlterar).setTipoReceita(novoTipo);
                receitas.get(receitaParaAlterar).setTempPreparo(novoTempoReceita);
                receitas.get(receitaParaAlterar).setModoDepreparo(novosIngrediente);                                     
                break;
                                                    
                case 7:
                    System.out.println("*** Alterar Ingredientes ***");
                    for (int i = 0; i < ingredientes.size(); i++) {
                        System.out.println(i + " - " + ingredientes.get(i));
                    }
                    System.out.println("Digite o indice da receita a ser alterada: ");
                    int ingredienteParaAlterar = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nome Ingredientes: ");
                    String novoNomeIngrediente = sc.nextLine();
                    System.out.println("Quantidade: ");
                    int novaQuantidadeIngredientes = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Perecivel: ");
                    try{
                        boolean perecivel = sc.nextBoolean();
                        ingredientes.add(new Ingredientes(novoNomeIngrediente, novaQuantidadeIngredientes, perecivel));
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.println("0 ou 1");
                        sc.nextLine();
                    }
                        
                        System.out.println(ingredientes);
                    break;
    
                case 8:
                    System.out.println("*** Listar por tipo ***");
                    System.out.print("Digite o tipo da receita a ser buscada: ");
                    String tipoParaBuscar = sc.nextLine();

                    List<Receita> receitasEncontradasPorTipo = receitas.stream()
                            .filter(receita -> receita.getTipoReceita().equalsIgnoreCase(tipoParaBuscar))
                            .collect(Collectors.toList());
                            if (receitasEncontradasPorTipo.isEmpty()) {
                                System.out.println("Nenhuma receita encontrada para o tipo '" + tipoParaBuscar + "'.");
                            } else {
                                System.out.println("Receitas encontradas do tipo '" + tipoParaBuscar + "':");
                                receitasEncontradasPorTipo.forEach(System.out::println);
                            }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                
            }
            }while (opcao != 0);
            sc.close();
        }
                                        
                                            
}
                    