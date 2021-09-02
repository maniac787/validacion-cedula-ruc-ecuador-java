package ec.com.newinstance.rest;

import ec.com.newinstance.validacion.ValidarIdentificacion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author <a href="mailto:maniac787@gmail.com">Roberto Chasipanta</a>
 */
@RestController
@RequestMapping("/api")
public class ValidacionController {
    @GetMapping("/validar_cedula/{cedula}")
    @ResponseBody
    public ResponseEntity validarCedula(@PathVariable String cedula) {
        Map<Integer, String> resultados = new ConcurrentHashMap<>();
        try {
            resultados.put(1, ValidarIdentificacion.getInstance().validarCedula(cedula) ? "Cedula valida" : "Cedula no valida");
            resultados.put(2, ValidarIdentificacion.getInstance().validarRucPersonaNatural(cedula) ? "RUC valido" : "RUC no valido");
            resultados.put(3, ValidarIdentificacion.getInstance().validarRucSociedadPrivada(cedula) ? "RUC valido" : "RUC no valido");
        } catch (Exception e) {
            return new ResponseEntity(resultados, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(resultados, HttpStatus.OK);

    }
}
