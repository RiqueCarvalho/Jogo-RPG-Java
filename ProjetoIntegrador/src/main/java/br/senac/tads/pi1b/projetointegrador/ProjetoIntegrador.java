package br.senac.tads.pi1b.projetointegrador;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class ProjetoIntegrador {

    public static void main(String[] args) {
        System.out.println("Aqui começa a nossa história.");
        System.out.println("...");
        System.out.println("Em uma era antiga onde homens usavam espadas, armaduras e cavalos, existiam 02 reinos.\n"
                + "Um desses reinos é o Reino Eterno.\n"
                + "Esse reino era bastante movimentado, porém para entrar ao reino, cada indivíduo tinha que ter pré-requisitos.\n"
                + "Um desses pré=requisitos é nunca ter se aliado a reinos conquistadores de terras, os quais valorizam a riqueza maior que a vida individual.\n"
                + "Em torno do reino tinham fortaleza feita de pedra, com altas defesas para inibir qualquer invasor.\n");

        System.out.println("O Reino Agricultor era onde os acordos não existiam eram ganancioso e rancorosos.\n"
                + "Domintantes de grandes lotes, eles se vangloriavam de cada território conquistado, terras planas e férteis eram suas preferidas.\n"
                + "Seu reino era cercado por muros de pedra com um toque de ouro nas pontas.\n"
                + "Haviam grandes negociações dentro das cidades, onde as pessoas possuíam vestimentas e características camponesas.\n");

        System.out.println("Há décadas o reino Agricultor invadiu o Reino Eterno, isso porque queriam riquezas e territórios.\n"
                + "Durante o confronto houve muito sangue derramado, incluindo o antigo rei do Reino Eterno.\n"
                + "O Reino Eterno levou anos para pensar em uma vingaça e como iriam reconstruir sua honra e glória depois de terem sidos devastados pelos ataques rivais.\n"
                + "Após anos de treinamentos e adaptação com novas tropas, apresentaram diante do novo rei uma ideia de vingaça.\n"
                + "Durante todo o tempo de planejamento, enviaram um espião ao reino rival, para procurar brechas na guarda, quantidades de soldados e armamentos.\n"
                + "Após o infiltrado voltar com a planta do castelo, descobriam que dentro do reino rival havia uma grande área comercial onde diversas pessoas entravam e saiam a todo tempo.\n"
                + "Tendo muralhas grandiosas com defesas compostas por arqueiros, um portão fortificado, soldados circulando a todo tempo e no final da rua ficava o castelo.\n"
                + "Alguns dias se passaram, após terem analisado e estudado formas de ataque, chegou o grande dia do Reino Eterno ter sua vingaça.\n"
                + "Na frente foram os exércitos mais os arqueiros e cavalaria, logo atrás muitos soldados aliados.\n"
                + "O reino Eterno levou em média 4 dias para chegar ao reino rival, durante esse percuso encontraram poções e recursos para abrigos e alimentação.\n"
                + "Se aproximando o reino inimigo, logo perceberam que o Reino Eterno se aproximavam, rapidamente mandaram um ancião para um possível acordo, oferecendo riquezas e parte da colheita.\n"
                + "Porém isso não foi o bastante para eles, pois o Reino Eterno queria vingaça, guerreiros com sede de guerra, de ouvir barulhos de espadas cortando, sons tenebrosos da batalha e então recusaram a proposta.\n"
                + "Chegando próximo ao reino inimigo, foi ordenado à um dos arqueiros que atirasse uma flexão no ancião inimigo, para msotrar que nada importava para eles, apenas queriam vingança.\n"
                + "Com isso, prosseguiram para a invasão ao reino, usamos escadas grandes para subir os muros e um grande tronco para quebrar o portão.\n"
                + "Entraram no reino e lá houve espadas cortando corpos e batendo, durante todo esse processo conquistaram grande parte do exército inimigo.\n"
                + "Saquearam as casas e queimavam algumas do reino inimigo.\n"
                + "Durante toda essa rebelião, pegaram a rainha inimiga e fizeram chantagens para o rei inimigo aparecer.\n"
                + "o rei logo apareceu, e então o rei fez uma proposta de sua vida pela a da rainha, e então o Reino Eterno aceitou, só para ir até eles.\n"
                + "No final de toda guerra, o Reino Eterno dominou o reino inimigo, baniram a rainha para terras bem distantes. E a glória reinou.\n"
                + "Que a força e a sabedoria esteja com você, qualquer dúvida pense bem antes de agir, boa sorte!");

        System.out.printf(".\n.\n.\n");
        System.out.println("Primeiramente... como deseja ser chamado?");
        System.out.println("Digite seu Nickname: ");
        String nomeJogador = entradaDadosString();
        System.out.println("Olá " + "'" + nomeJogador + "'" + ", você terá uma aventura incrível!!! ");
        System.out.println("Nesse primeiro momento do jogo você precisará escolher ");
        System.out.println("um personagem, cada um com sua classe, cada um com suas ");
        System.out.println("particularidades, entre as opções temos: ");

        System.out.println("1 - Guerreiro:");
        System.out.println("A classe guerreiro tem como arma uma grande espada, tem bastante dano ");
        System.out.println("e bastante resistência, é ruim contra inimigos que atacam de longa distância.");

        System.out.println("2 - Ladrão:");
        System.out.println("A classe ladrão tem uma faca letal, tem bastante agilidade e furtividade, é ruim");
        System.out.println("contra inimigos com muita resistência.");

        System.out.println("3 - Mago:");
        System.out.println("A classe mago tem como arma um cajado que pode ser de água, ar, fogo ou terra,");
        System.out.println("tem bastante dano em área e versáril, é ruim contra inimigos de curta distância.");

        System.out.println("4 - Atirador:");
        System.out.println("A classe atirador tem como arma uma besta, tem velocidade de ataque e bom dano, ");
        System.out.println("é ruim contra inimigos de curto alcance e inimigos assassinos.");

        System.out.println("5 - Lutador:");
        System.out.println("A classe lutador usa como arma seus punhos, tem curto alcance, porém muito dano");
        System.out.println("é ruim contra inimigos de longo alcance como mago e atirador.");

        System.out.println("6 - Paladino:");
        System.out.println("A classe paladino tem como arma uma espada protegida pelos anjos e um escudo de grande porte");
        System.out.println("tem habilidades de cura e bastante dano, é ruim contra magos.");

        System.out.println("Selecione uma opção: ");
        int opcao = entradaDadosInt();

        switch (opcao) {

            case 1:
                int vida,
                 habilidade1,
                 goblin;
                vida = 100;
                habilidade1 = 20;
                goblin = 10;

                int combate;

                System.out.println("GUERREIRO SELECIONADO ");
                System.out.println("Você nascera em um centro de treinamento para ");
                System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                System.out.println("seus equipamentos. ");
                System.out.println("para andar pelo jogo, digitite norte, sul, leste ou oeste ");
                System.out.println("tente se movimentar, digitando alguns dos comandos acima:");
                String movimento = entradaDadosString();

                if (movimento.equalsIgnoreCase("norte")) {
                    System.out.println("Você andou um passo para o norte");
                    System.out.println("encontrou um goblin fraco, com 10 de vida, para lutar contra ele digite ");
                    System.out.println(" '1' ou para sair, digite '2'");
                    opcao = entradaDadosInt();

                    if (opcao == 1) {
                        System.out.println("Sua vida atual: " + vida);
                        System.out.println("Escolha uma habilidade para atacar o inimigo:");
                        System.out.println("1 - Espadada");
                        System.out.println("2 - ");
                        combate = entradaDadosInt();
                        if (combate == 1) {
                            goblin = goblin - habilidade1;
                            System.out.println("Vida do goblin: " + goblin);
                            System.out.println("Você derrotou o goblin!");
                        }
                        if (opcao == 2) {
                            System.out.println("VocÊ fugiu de uma batalha! ");
                            break;

                        }

                    }

                } else if (movimento.equalsIgnoreCase("sul")) {
                    System.out.println("Você andou um passo para o sul");
                } else if (movimento.equalsIgnoreCase("leste")) {
                    System.out.println("Você andou um passo para o leste");
                } else if (movimento.equalsIgnoreCase("oeste")) {
                }

                break;

            case 2:

                System.out.println("LADRAO SELECIONADO ");
                System.out.println("Você nascera em um centro de treinamento para ");
                System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                System.out.println("seus equipamentos. ");
                System.out.println("para andar um passo, digitite note, sul, leste ou oeste ");
                movimento = entradaDadosString();

                if (movimento.equalsIgnoreCase("norte")) {
                    System.out.println("Você andou um passo para o norte");

                } else if (movimento.equalsIgnoreCase("sul")) {
                    System.out.println("Você andou um passo para o sul");
                } else if (movimento.equalsIgnoreCase("leste")) {
                    System.out.println("Você andou um passo para o leste");
                } else if (movimento.equalsIgnoreCase("oeste")) {
                }

                break;
            case 3:
                System.out.println("MAGO SELECIONADO ");
                System.out.println("Você nascera em um centro de treinamento para ");
                System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                System.out.println("seus equipamentos. ");
                System.out.println("para andar um passo, digitite note, sul, leste ou oeste ");
                movimento = entradaDadosString();

                if (movimento.equalsIgnoreCase("norte")) {
                    System.out.println("Você andou um passo para o norte");

                } else if (movimento.equalsIgnoreCase("sul")) {
                    System.out.println("Você andou um passo para o sul");
                } else if (movimento.equalsIgnoreCase("leste")) {
                    System.out.println("Você andou um passo para o leste");
                } else if (movimento.equalsIgnoreCase("oeste")) {
                }

                break;
            case 4:
                System.out.println("ATIRADOR SELECIONADO ");
                System.out.println("Você nascera em um centro de treinamento para ");
                System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                System.out.println("seus equipamentos. ");
                System.out.println("para andar um passo, digitite note, sul, leste ou oeste ");
                movimento = entradaDadosString();

                if (movimento.equalsIgnoreCase("norte")) {
                    System.out.println("Você andou um passo para o norte");

                } else if (movimento.equalsIgnoreCase("sul")) {
                    System.out.println("Você andou um passo para o sul");
                } else if (movimento.equalsIgnoreCase("leste")) {
                    System.out.println("Você andou um passo para o leste");
                } else if (movimento.equalsIgnoreCase("oeste")) {
                }

                break;
            case 5:
                System.out.println("LUTADOR SELECIONADO ");
                System.out.println("Você nascera em um centro de treinamento para ");
                System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                System.out.println("seus equipamentos. ");
                System.out.println("para andar um passo, digigite norte ou sul: ");
                movimento = entradaDadosString();

                if (movimento.equalsIgnoreCase("norte")) {
                    System.out.println("Você andou um passo para o norte");

                } else if (movimento.equalsIgnoreCase("sul")) {
                    System.out.println("Você andou um passo para o sul");
                } else if (movimento.equalsIgnoreCase("leste")) {
                    System.out.println("Você andou um passo para o leste");
                } else if (movimento.equalsIgnoreCase("oeste")) {
                }

                break;
            case 6:

                int poder1 = 15,
                 poder2 = 30,
                 poder3 = 60;
                int oak = 90,
                 lobo = 50;
                int vidaPaladino = 230;

                System.out.println("PALADINO SELECIONADO ");
                System.out.println("Poderes do paladino:");
                System.out.println("* Intimidação Ancestral: causa 15 de ano porém recebe 5 de dano ao conjurar;");
                System.out.println("* Soco Benzido: causa 30 de dano porém recebe 15 de dano ao conjurar;");
                System.out.println("* Poder Divino: causa 60 de dano porém recebe 30 de dano ao conjurar.");
                System.out.println("Você nascera em um centro de treinamento para ");
                System.out.println("aprender os conceitos basicos do jogo, tais como andar, ");
                System.out.println("escolher itens dropados pelos monstros da floresta e usar ");
                System.out.println("seus equipamentos. ");
                System.out.println("para andar um passo, digigite norte ou sul: ");
                movimento = entradaDadosString();

                if (movimento.equalsIgnoreCase("norte")) {
                    System.out.println("Você andou um passo para o norte");
                    System.out.println("Encontrou um Oak, terá que lutar contra ele para seguir em frente!! ");
                    System.out.println(" ** Oak tem 90 de vida e 20 dano de atk ** ");
                    System.out.println("Escolha uma habilidade para ataca-lo: ");
                    System.out.println("1 - Intimidação Ancestral");
                    System.out.println("2 - Soco Benzido");
                    System.out.println("3 - Poder Divino");

                    do {
                        combate = entradaDadosInt();

                        if (combate == 1) {
                            System.out.println("Sua vida atual: " + vidaPaladino);
                            oak = oak - poder1;
                            vidaPaladino = vidaPaladino - 5;
                            System.out.println("Vida do Oak: " + oak);

                        } else if (combate == 2) {

                            System.out.println("Sua vida atual: " + vidaPaladino);
                            oak = oak - poder2;
                            vidaPaladino = vidaPaladino - 15;
                            System.out.println("Vida do Oak: " + oak);

                        } else if (combate == 3) {
                            System.out.println("Sua vida atual: " + vidaPaladino);
                            oak = oak - poder3;
                            vidaPaladino = vidaPaladino - 20;
                            System.out.println("Vida do Oak: " + oak);
                        }

                    } while (oak > 0);
                    System.out.println("Você derrotou o oak e pode seguir sua jornada!!!");

                } else if (movimento.equalsIgnoreCase("sul")) {
                    System.out.println("Você andou um passo para o sul");
                    System.out.println(" - O que é aquilo? uma árvore gigante!!!");
                    System.out.println(" - Tem varias maças frescas nela, será que consigo pega-las? ");
                    System.out.println("1 - Tentar escalar a árvore");
                    System.out.println("2 - Usar um poder na árvore");

                    int decisao = entradaDadosInt();
                    if (decisao == 1) {
                        System.out.println(" - Argh, sou muito lento e grande para subir aqui !");
                        System.out.println(" - Quem sabe não encontro uma árvore menor.");
                    } else if (decisao == 2) {
                        System.out.println(" - Ops, acabei acertando um inimigo sem querer !!! ");
                        System.out.println(" - Lobos sairam de trás dos arbustos, precisamos derrota-los ");
                        System.out.println(" ** Os lobos tem 50 de vida e 10 dano de atk ** ");
                        System.out.println("1 - Intimidação Ancestral");
                        System.out.println("2 - Soco Benzido");
                        System.out.println("3 - Poder Divino");

                        do {
                            combate = entradaDadosInt();

                            if (combate == 1) {
                                System.out.println("Sua vida atual: " + vidaPaladino);
                                lobo = lobo - poder1;
                                vidaPaladino = vidaPaladino - 5;
                                System.out.println("Vida do Oak: " + lobo);

                            } else if (combate == 2) {

                                System.out.println("Sua vida atual: " + vidaPaladino);
                                lobo = lobo - poder2;
                                vidaPaladino = vidaPaladino - 15;
                                System.out.println("Vida do Lobo: " + lobo);

                            } else if (combate == 3) {
                                System.out.println("Sua vida atual: " + vidaPaladino);
                                lobo = lobo - poder3;
                                vidaPaladino = vidaPaladino - 20;
                                System.out.println("Vida do Lobo: " + lobo);
                            }

                        } while (lobo > 0);
                        System.out.println("Olha só, conseguimos derrotar os lobos e ainda garantimos nossas maças !!!");
                    }
                    break;
                }
        }
    }

    static String entradaDadosString() {
        Scanner input = new Scanner(System.in);
        String opcaoString = input.next();
        return opcaoString;
    }

    static int entradaDadosInt() {
        Scanner input = new Scanner(System.in);
        int opcao = input.nextInt();
        return opcao;
    }

}
