import java.util.Scanner;

public class MatrizQuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        // Matrizes - dias, tarefas, horario e minutos

        int agendaMatriz[][] = new int[30][24]; 
        String tarefaMatriz[][] = new String[30][24]; 
        int horarioMatriz[][] = new int[30][24]; 
        int minutosMatriz[][] = new int[30][24]; 

        while (opcao != 3) {

            // Menu

            System.out.println("---------------------------------------------------------------------------");
            System.out.println("|                                                                         |");
            System.out.println("|                               AGENDA MENSAL                             |");
            System.out.println("|                                                                         |");
            System.out.println("| [1] Inserir tarefas                                                     |");
            System.out.println("| [2] Visualizar tarefas                                                  |");
            System.out.println("|                                                                         |");
            System.out.println("| [3] Sair                                                                |");
            System.out.println("|                                                                         |");
            System.out.println("---------------------------------------------------------------------------");
            opcao = sc.nextInt();
            System.out.println();

            // Inserção de dados

            if (opcao == 1) {

                boolean continuar = true;

                for (int i = 0; i < 30 && continuar; i++) {

                    for (int j = 0; j < 24 && continuar; j++) {

                        System.out.print(
                                "Informe o dia da tarefa que você deseja cadastrar, entre 1 e 30. Caso digite 0, você voltará para o menu: ");
                        int dia = sc.nextInt();

                        if (dia == 0) {

                            continuar = false;
                            break;

                        }

                        while (dia > 30 || dia < 1) {

                            System.out.println();
                            System.out.print("Digite, novamente, uma data válida, entre 1 e 30: ");
                            dia = sc.nextInt();

                            if (dia == 0) {

                                continuar = false;
                                break;

                            }

                        }

                        if (!continuar)
                            break;

                        sc.nextLine();
                        agendaMatriz[i][j] = dia;

                        System.out.print("Informe a tarefa que você deseja cadastrar, deste dia, na agenda: ");
                        tarefaMatriz[i][j] = sc.nextLine();

                        System.out.print("Informe o horário desta tarefa: ");
                        horarioMatriz[i][j] = sc.nextInt();
                        System.out.print("Informe, também, os minutos: ");
                        minutosMatriz[i][j] = sc.nextInt();

                        System.out.println();
                        System.out.println("Compromisso adicionado com sucesso!");
                        System.out.println();
                        System.out.println("Deseja adicionar outro compromisso? 1- Sim e 0- Não");
                        int resposta = sc.nextInt();

                        if (resposta == 0) {
                            continuar = false;
                        }

                        System.out.println();

                    }

                }

            // Visualização de dados

            } else if (opcao == 2) {

                System.out.println("            AGENDA - Compromissos               ");
                System.out.println();

                for (int i = 0; i < 30; i++) {

                    for (int j = 0; j < 24; j++) {

                        if (agendaMatriz[i][j] != 0) {

                            System.out.println("Dia informado: " + agendaMatriz[i][j]);
                            System.out.println("Tarefa associada a este dia: " + tarefaMatriz[i][j]);
                            System.out.println("Hora desta tarefa: " + horarioMatriz[i][j] + ":" + minutosMatriz[i][j]);
                            System.out.println();

                        }

                    }

                }

            }

        }

        System.out.println("Parando a agenda...");
        System.out.println();
        System.out.println("Muito obrigada por utilizar nosso sistema de Agenda On-line!");

        sc.close();
    }

}
