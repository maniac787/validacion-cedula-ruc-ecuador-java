package ec.com.newinstance.validacion;

import org.junit.jupiter.api.Test;

class ValidarIdentificacionTest {

    @Test
    void validarCedula() {
        try {
            System.out.println(ValidarIdentificacion.getInstance().validarCedula("1717171717"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}