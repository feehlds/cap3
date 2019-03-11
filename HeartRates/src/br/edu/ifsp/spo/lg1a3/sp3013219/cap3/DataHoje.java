package br.edu.ifsp.spo.lg1a3.sp3013219.cap3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHoje {	
		public String getDiaHoje() {
			DateFormat dateFormat = new SimpleDateFormat("dd");
			Date dia = new Date();
			return dateFormat.format(dia);
		}
		
		public String getMesHoje() {
			DateFormat dateFormat = new SimpleDateFormat("MM");
			Date mes = new Date();
			return dateFormat.format(mes);
		}
		
		public String getAnoHoje() {
			DateFormat dateFormat = new SimpleDateFormat("yyyy");
			Date ano = new Date();
			return dateFormat.format(ano);
		}
}
