import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ra21606437
 */
public class SignoMain {
     public static Signos verificaSigno(String data){
        
// Define formato para validação da data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        
        try {
            // Validaação da Data de Nascimento
            Date dData = sdf.parse(data);
            
            // Seleciona o dia da Data de Nascimento
            String sDia = data.substring(0, 2);
            int dia = Integer.parseInt(sDia);
            
            // Seleciona o mês da Data de Nascimento
            String mes = data.substring(3, 5);

                if ( (mes.equals("01") && dia >= 21) ||
                     (mes.equals("02") && dia <= 19) ) return Signos.AQUARIO;
                if ( (mes.equals("02") && dia >= 20) ||
                     (mes.equals("03") && dia <= 20) ) return Signos.PEIXES;        
                if ( (mes.equals("03") && dia >= 21) ||
                     (mes.equals("04") && dia <= 20) ) return Signos.ARIES; 
                if ( (mes.equals("04") && dia >= 21) ||
                     (mes.equals("05") && dia <= 20) ) return Signos.TOURO;         
                if ( (mes.equals("05") && dia >= 21) ||
                     (mes.equals("06") && dia <= 20) ) return Signos.GEMEOS;   
                if ( (mes.equals("06") && dia >= 21) ||
                     (mes.equals("07") && dia <= 21) ) return Signos.CANCER;
                if ( (mes.equals("07") && dia >= 22) ||
                     (mes.equals("08") && dia <= 22) ) return Signos.LEAO;  
                if ( (mes.equals("08") && dia >= 23) ||
                     (mes.equals("09") && dia <= 22) ) return Signos.VIRGEM;  
                if ( (mes.equals("09") && dia >= 23) ||
                     (mes.equals("10") && dia <= 22) ) return Signos.LIBRA;  
                if ( (mes.equals("10") && dia >= 23) ||
                     (mes.equals("11") && dia <= 21) ) return Signos.ESCORPIAO;  
                if ( (mes.equals("11") && dia >= 22) ||
                     (mes.equals("12") && dia <= 21) ) return Signos.SAGITARIO;  
                if ( (mes.equals("12") && dia >= 22) ||
                     (mes.equals("01") && dia <= 20) ) return Signos.CAPRICORNIO;  
        } catch(Exception e) {
           e.printStackTrace();
        }
        return null;
    } 
    
}
