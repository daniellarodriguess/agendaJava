import java.util.Scanner;

public class MatrizCinco {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        // Matrizes - meses, dias, tarefas, horario e minutos

        int diaMatriz[][][] = new int[12][30][24]; 
        int mesMatriz[][][] = new int[12][30][24]; 
        String tarefaMatriz[][][] = new String[12][30][24]; 
        int horarioMatriz[][][] = new int[12][30][24]; 
        int minutosMatriz[][][] = new int[12][30][24]; 

        while (opcao != 3) {

            // Menu

            System.out.println("---------------------------------------------------------------------------");
            System.out.println("|                                                                         |");
            System.out.println("|                               AGENDA ANUAL                              |");
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

                for (int mes = 0; mes < 12 && continuar; mes++) {
                    
                    for (int dia = 0; dia < 30 && continuar; dia++) {

                        for (int hora = 0; hora < 8 && continuar; hora++) {

                            System.out.print("Informe um mês (1-12) para continuar inserindo uma agenda na tarefa. Caso deseje volta digite 0: ");
                            int escolhaMes = sc.nextInt();

                            if (escolhaMes == 0) {

                                System.out.println();
                                System.out.println("Obrigado. Voltando ao menu...");
                                System.out.println();

                                continuar = false;
                                break;


                            }

                            while (escolhaMes < 1 || escolhaMes > 12) {

                                System.out.print("Mês inválido, digite, novamente, um mês entre 1 e 12. Caso deseje voltar para o menu, digite 0: ");
                                escolhaMes = sc.nextInt();

                                if (escolhaMes == 0) {

                                    System.out.println();
                                    System.out.println("Obrigado. Voltando ao menu...");
                                    System.out.println();

                                    continuar = false;
                                    break;

                                }

                            }

                            if (!continuar) break;

                            mesMatriz [mes][dia][hora] = escolhaMes;

                            System.out.println();
                            System.out.print("Agora, informe a data da tarefa, entre o dia 1 e 30: ");
                            int escolhaDia = sc.nextInt();

                            while (escolhaDia < 1 || escolhaDia > 30) {

                                System.out.print("Data inválida. Digite, novamente, uma data entre 1 e 30: ");
                                escolhaDia = sc.nextInt();

                            }

                            diaMatriz [mes][dia][hora] = escolhaDia;

                            System.out.println();
                            System.out.print("Agora, informe o horário da tarefa, entre 8h-16h: ");
                            int escolhaHora = sc.nextInt();

                            while (escolhaHora < 8 || escolhaHora > 16) {

                                System.out.print("Horário inválido. Digite, novamente, entre 8h-16h: ");
                                escolhaHora = sc.nextInt();

                            }

                            horarioMatriz [mes][dia][hora] = escolhaHora;

                            System.out.println();
                            System.out.print("Informe os minutos, caso tenha: ");
                            minutosMatriz [mes][dia][hora] = sc.nextInt();

                            sc.nextLine();

                            System.out.println();
                            System.out.print("Informe a tarefa desta data: ");
                            tarefaMatriz [mes][dia][hora] = sc.nextLine();

                            System.out.println();
                            System.out.println("Tarefa cadastrada com sucesso!");
                            System.out.println();
                            System.out.println("Deseja adicionar outro compromisso na agenda? 1- Sim, 0- Não");
                            int resposta = sc.nextInt();

                            if (resposta == 0) {

                                continuar = false;

                            }

                            System.out.println();

                        }

                    }


                }

            // Visualização de dados

            } else if (opcao == 2) {

                for (int mes = 0; mes < 12; mes++) {

                    for (int dia = 0; dia < 30; dia++) {

                        for (int hora = 0; hora < 8; hora++) {

                            if (mesMatriz [mes][dia][hora] != 0) {

                                System.out.println("Mês: " + mesMatriz[mes][dia][hora]);
                                System.out.println("Dia: " + diaMatriz[mes][dia][hora]);
                                System.out.println("Hora: " + horarioMatriz[mes][dia][hora] + ":" + minutosMatriz[mes][dia][hora]);
                                System.out.println("Tarefa: " + tarefaMatriz[mes][dia][hora]);
                                System.out.println();

                            }

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
