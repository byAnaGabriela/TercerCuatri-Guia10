package cuatro;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ValidadorDeFecha {

    private String stringFecha;
    private LocalDate localDateFecha = null;

    public ValidadorDeFecha(String stringFecha) {
        this.stringFecha = stringFecha;
    }

    public void validador(){
        System.out.println(LocalDate.now());
        boolean validadorFecha = validarFecha(stringFecha);
        if(validadorFecha){
            System.out.println("La fecha es correcta");
        }else{
            throw new RuntimeException("El formato de la fecha es incorrecto, el formato correcto es 'dd/mm/yyyy'");
        }
    }

    private boolean validarFecha(String fechaIngresada){
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
            Date fecha = formato.parse(fechaIngresada);
            //LocalDate.parse(fechaIngresada);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
