package application;

import entities.Champion;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Vida inicial: ");
        int initialLife = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();

        Champion darius = new Champion(name, initialLife, attack, armor);

        System.out.println();
        System.out.println("Digite os dados do segundo campeão: ");
        System.out.print("Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Vida inicial: ");
        initialLife = sc.nextInt();
        System.out.print("Ataque: ");
        attack = sc.nextInt();
        System.out.print("Armadura: ");
        armor = sc.nextInt();

        Champion fiora = new Champion(name, initialLife, attack, armor);

        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String statusDarius = darius.status();
            String statusFiora = fiora.status();

            if (statusDarius.contains("morreu") || statusFiora.contains("morreu")){
                break;
            }

            System.out.println();
            System.out.println("Resultado do turno " + i + ":");
            darius.takeDamage(fiora);
            fiora.takeDamage(darius);
            System.out.println(darius.status());
            System.out.println(fiora.status());
        }
    }
}
