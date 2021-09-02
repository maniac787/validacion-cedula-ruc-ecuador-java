package ec.com.newinstance.validacion;

import org.junit.jupiter.api.Test;

class ValidarIdentificacionTest {

    @Test
    void validarCedula() {
        try {
//            System.out.println(ValidarIdentificacion.getInstance().validarCedula("1790219526001"));
//            System.out.println(ValidarIdentificacion.getInstance().validarRucPersonaNatural("1790219526001"));
            System.out.println(ValidarIdentificacion.getInstance().validarRucSociedadPrivada("1790219526001"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}