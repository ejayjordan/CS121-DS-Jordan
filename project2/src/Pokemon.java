import java.util.Random;
import java.util.Scanner;

public class Pokemon {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int rand;
            String gamestart;
            int round;
            int player1win = 0;
            int player2win = 0;

            String Poke1name;
            int Poke1hp;
            String Poke1move;
            int Poke1power;
            int Poke1speed;

            String Poke2name;
            int Poke2hp;
            String Poke2move;
            int Poke2power;
            int Poke2speed;

            System.out.println("Enter an odd number of rounds: ");
            round = Integer.parseInt(scanner.nextLine());
            System.out.println();

            int i;
            for (i = 1; i <= round; i++) {
                System.out.println();
                System.out.print("Round " + i + "\n-----");
                System.out.print("\nPlayer 1 select a Pokemon and enter its stats:\n");
                System.out.println("Enter name:\n");
                Poke1name = scanner.nextLine();
                System.out.println("Enter HP:\n");
                Poke1hp = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter move:\n");
                Poke1move = scanner.nextLine();
                System.out.println("Enter power:\n");
                Poke1power = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter speed:\n");
                Poke1speed = Integer.parseInt(scanner.nextLine());

                System.out.println();
                System.out.print("\nPlayer 2 select a Pokemon and enter its stats:\n");
                System.out.println("Enter name:\n");
                Poke2name = scanner.nextLine();
                System.out.println("Enter HP:\n");
                Poke2hp = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter move:\n");
                Poke2move = scanner.nextLine();
                System.out.println("Enter power:\n");
                Poke2power = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter speed:\n");
                Poke2speed = Integer.parseInt(scanner.nextLine());

                while (Poke1hp > 0 && Poke2hp > 0) {
                    if (Poke1speed > Poke2speed) {
                        int attack = Poke1power - Poke2hp;
                        Poke2hp = attack;
                        System.out.print("Player 1 is the round winner");
                        player1win++;
                        if (Poke2hp < 0) {
                            break;
                        }
                    } else if (Poke1speed < Poke2speed) {
                        int attack2 = Poke2power - Poke1hp;
                        Poke1hp = attack2;
                        System.out.print("Player 2 is the round winner");
                        player2win++;
                        if (Poke1hp < 0) {
                            break;
                        }
                    } else {
                        rand = random.nextInt(3);
                        if (rand == 1) {
                            int attack3 = Poke1power - Poke2hp;
                            Poke2hp = attack3;
                            System.out.print("Player 1 is the round winner");
                            player1win++;
                            if (Poke2hp < 0) {
                                break;
                            }
                        } else {
                            int attack4 = Poke2power - Poke1hp;
                            Poke1hp = attack4;
                            System.out.print("Player 2 is the round winner");
                            player2win++;
                            if (Poke1hp <= 0) {
                                break;
                            }
                        }
                    }
                }
            }
            if (i == round) {
                System.out.print("\nFinal Scores\n" + "-----\n");
            } else {
                System.out.print("\nWins\n" + "-----\n");
            }
            System.out.print("Player 1: " + player1win + "\nPlayer 2: " + player2win);
            if (player1win > player2win) {
                System.out.print("\nPlayer 1 wins the game");
            } else {
                System.out.print("\nPlayer 2 wins the game");
            }
        }
    }




}
