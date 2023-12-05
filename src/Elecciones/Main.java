package Elecciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCandidatos, numVotantes, lugar;
		int [] votos, votosCandidatos, lugares;

		Scanner lectura = new Scanner(System.in);


		System.out.println("Ingrese el número de candidatos: ");//--------------PEDIR AL USUARIO EL NÚMERO DE CANDIDATOS
		numCandidatos = lectura.nextInt();

		
		System.out.println("Ingrese el número de votantes: ");//-------------PEDIR AL USUARIO EL NÚMERO DE VOTANTES
		int numVotantesLocal = lectura.nextInt();

		votos = new int[numVotantesLocal];
		votosCandidatos = new int[numCandidatos];
		lugares = new int[numCandidatos];

		// ----------------Leemos los votos de los votantes
		for (int i = 0; i < numVotantesLocal; i++) {
			System.out.println("Ingrese el voto del votante " + (i + 1) + ": ");
			votos[i] = lectura.nextInt();
		}

		// ----------------Contamos los votos por candidato
		for (int i = 0; i < numVotantesLocal; i++) {
			votosCandidatos[votos[i] - 1]++;
		}

		// ---Determinamos el lugar de cada candidato
		for (int i = 0; i < numCandidatos; i++) {
			lugares[i] = i + 1;
			for (int j = 0; j < i; j++) {
				if (votosCandidatos[i] < votosCandidatos[j]) {
					lugares[i]++;
				}
			}
		}

		// Imprimimos el resultado de las elecciones
		System.out.println("-----------RESULTADOS DE LAS ELECCIONES----------:");
		for (int i = 0; i < numCandidatos; i++) {
			System.out.println("Candidato " + (i + 1) + ", lugar: " + lugares[i] + ", votos: " + votosCandidatos[i]);
		}

	}

}