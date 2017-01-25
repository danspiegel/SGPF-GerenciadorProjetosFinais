package br.com.gerenciadorprojetosfinais.utils;

/**
 * Classe para métodos de formatação
 * 
 * @author daniel.spiegel
 *
 */
public class FormatUtils {

	/**
	 * Método responsável por formatar a string recebida para CPF ou CNPJ dependendo do tamanho dela.
	 * @param cpfCnpj String
	 * @return String
	 */
	public static String formatCpfCnpj(String cpfCnpj){
		
		StringBuilder cpfCnpjFormatado = new StringBuilder();
		
		if (cpfCnpj.length() == 11){
			
			cpfCnpjFormatado.append(cpfCnpj.substring(0, 3));
			cpfCnpjFormatado.append(".");
			cpfCnpjFormatado.append(cpfCnpj.substring(3, 6));
			cpfCnpjFormatado.append(".");
			cpfCnpjFormatado.append(cpfCnpj.substring(6, 9));
			cpfCnpjFormatado.append("-");
			cpfCnpjFormatado.append(cpfCnpj.substring(9, 11));
			
		}
		else if (cpfCnpj.length() == 14){
			
			cpfCnpjFormatado.append(cpfCnpj.substring(0, 2));
			cpfCnpjFormatado.append(".");
			cpfCnpjFormatado.append(cpfCnpj.substring(2, 5));
			cpfCnpjFormatado.append(".");
			cpfCnpjFormatado.append(cpfCnpj.substring(5, 8));
			cpfCnpjFormatado.append("/");
			cpfCnpjFormatado.append(cpfCnpj.substring(8, 12));
			cpfCnpjFormatado.append("-");
			cpfCnpjFormatado.append(cpfCnpj.substring(12, 14));
			
		}
		else{
			cpfCnpjFormatado.append(cpfCnpj);
		}	
		
		return cpfCnpjFormatado.toString();
		
	}
	
}
