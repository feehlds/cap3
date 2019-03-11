package br.edu.ifsp.spo.lg1a3.sp3013219.cap3;


public class HeartRates {
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;

// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	

	//CONSTRUTOR
	
	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
		
		setNome(nome);
		setSobrenome(sobrenome);
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public int idade(int dia, int mes, int ano) {
	
		DataHoje dataAgora = new DataHoje();
		int diaAgora = Integer.parseInt(dataAgora.getDiaHoje());
		int mesAgora = Integer.parseInt(dataAgora.getMesHoje());
		int anoAgora = Integer.parseInt(dataAgora.getAnoHoje());
		
		if(mesAgora < mes) {
			return anoAgora - 1 - ano;
		}
		else{
			if(mesAgora == mes && diaAgora < dia) {
				return anoAgora - ano - 1;
			}
			else
				return ano - anoAgora; 
		}	
	}

	public int MaxCardFreq() {
		int freq = 220 - idade(dia, mes, ano);
		return freq;
	}
	
	public void FreqAlvo() {
		double minFreqA = MaxCardFreq() * 0.5;
		double maxFreqA = MaxCardFreq() * 0.8;
		
		System.out.println("A frequência adequada está entre " + minFreqA + " e " + maxFreqA);
	}
}
