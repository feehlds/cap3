package br.edu.ifsp.spo.lg1a3.sp3013219.cap3;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//VARIÁVEIS
		Scanner ler = new Scanner(System.in);
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;
		
		//INFO
		System.out.print("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.print("Digite seu sobrenome: ");
		sobrenome = ler.nextLine();
		System.out.print("Digite o dia de nascimento: ");
		dia = ler.nextInt();
		System.out.print("Digite o mês de nascimento: ");
		mes = ler.nextInt();
		System.out.print("Digite o ano de nascimento: ");
		ano = ler.nextInt();
		
		//CONSTRUTOR
		HeartRates heart = new HeartRates(nome, sobrenome, dia, mes, ano);
		
	
		//TESTES
		System.out.println("Nome: " + heart.getNome() + " " + heart.getSobrenome());
		System.out.println("Data de Nascimento: " + heart.getDia() + "/" + heart.getMes() + "/" + heart.getAno());
		System.out.println("Idade: " + heart.idade(dia, mes, ano));	
		System.out.println("Frequência Cardíaca Máxima: " + heart.MaxCardFreq() + " BPM.");
		
		heart.FreqAlvo();
	}
	
}
