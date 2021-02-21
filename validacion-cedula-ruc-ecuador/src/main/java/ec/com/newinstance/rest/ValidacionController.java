package ec.com.newinstance.rest;

import ec.com.newinstance.validacion.ValidarIdentificacion;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ValidacionController {
    @GetMapping("/validar_cedula/{cedula}")
    @ResponseBody
    public boolean validarCedula(@PathVariable String cedula) {
        try {
            return ValidarIdentificacion.getInstance().validarCedula(cedula);
        } catch (Exception e) {
            return false;
        }
    }
}
