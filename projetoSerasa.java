package codigoSerasa;
import javax.swing.JOptionPane;

public class projetoSerasa {
	
	public static void main(String[] args) {
		double valor;
		int meses;
		String cpf ="";
		String rg="";
		String nome="";
		double resultado;
		double parcela = 0;
		String confirmarDados ="";
		String fim ="";
		
		double taxa= 0.02;  //taxa de juros ao m�s (2%)
		
		//in�cio do c�digo 
		
		 JOptionPane.showMessageDialog(null, "Cr�ditoParaTodxs - SEJA BEM VINDO(A)"+"\nTemos ofertas de empr�stimo pessoal para voc�!");
		 //pedir o nome do usu�rio 
		 nome= JOptionPane.showInputDialog("Qual seu nome?: ");		
		 // pedir o valor que o usu�rio precisa
		 valor= Double.parseDouble(JOptionPane.showInputDialog("Qual o valor que voc� necessita? R$:"));
		 //pedir em quantos meses ele quer pagar
		 meses = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de meses que ir� pagar: "+"\n1 m�s - 2 meses"+"\n3 meses - 4 meses"+"\n5 meses -  6 meses"+"\n7 meses -  8 meses"+"\n9 meses - 10 meses"+"\n11 meses - 12 meses"));
		 //pedir o CPF do usu�rio 
		 cpf = JOptionPane.showInputDialog("Agora me infome seu CPF: ");
		 //pedir o RG do usu�rio 
		 rg = JOptionPane.showInputDialog("Insira tamb�m o seu RG: ");
		 //mostrar as ofertas de empr�stimo
		 JOptionPane.showMessageDialog(null, "aqui est�o as melhores ofertas de empr�stimo para voc�:");
		 
		 //apresentando o valor que o usu�rio ir� pagar no total e a parcela ao m�s
		 if (meses == 1) {
			 resultado = (valor *taxa);
			 valor = valor + resultado;			
			System.out.println("O valor que voc� ir� pagar �: R$"+valor);
		} else if (meses == 2) {
			resultado = (valor *taxa*2);
			valor = valor + resultado;	
			parcela = valor/2;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		} else if (meses == 3) {
			resultado = (valor *taxa*3);
			valor = valor + resultado;	
			parcela = valor/3;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		}else if (meses == 4) {
			resultado = (valor *taxa*4);
			valor = valor + resultado;
			parcela = valor/4;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		} else if (meses == 5) {
			resultado = (valor *taxa*5);
			valor = valor + resultado;	
			parcela = valor/5;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		} else if (meses == 6) {
			resultado = (valor *taxa*6);
			valor = valor + resultado;	
			parcela = valor/6;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		} else if (meses == 7) {
			resultado = (valor *taxa*7);
			valor = valor + resultado;
			parcela = valor/7;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		} else if (meses == 8) {
			resultado = (valor *taxa*8);
			valor = valor + resultado;
			parcela = valor/8;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$:  "+parcela);
		} else if (meses == 9) {
			resultado = (valor *taxa*9);
			valor = valor + resultado;	
			parcela = valor/9;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		} else if (meses == 10) {
			resultado = (valor *taxa*10);
			valor = valor + resultado;
			parcela = valor/10;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		} else if (meses ==11) {
			resultado = (valor *taxa*11);
			valor = valor + resultado;
			parcela = valor/11;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		} else if (meses ==12) {
			resultado = (valor *taxa*12);
			valor = valor + resultado;
			parcela = valor/12;
			System.out.println("O valor que voc� ir� pagar �: R$"+valor+"\n o valor da parcela ao m�s ser� R$: "+parcela);
		}else{
			System.out.println("Digite um valor ente 1 e 12 exemplo: 3");
		}
		
		 //detalhando a oferta do usu�rio antes da escolha;
		System.out.println("\nRevisando..."+"\n"+nome+" voc� pagar� o total de R$: "+valor+"\nnum per�odo de "+meses+" meses"+"\nonde o valor da parcela ser� R$: "+parcela+" ao m�s");
		
		//confirma se dados do usu�rio est�o corretos 
		confirmarDados= JOptionPane.showInputDialog("Confirmando seus dados"+"\n Nome: "+nome+"\n CPF: "+cpf+"\n RG: "+rg+" correto?");
		
	}

}
