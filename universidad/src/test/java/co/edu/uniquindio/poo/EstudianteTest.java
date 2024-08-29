/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");

        assertThrows(Throwable.class, ()-> new Estudiante(" ", " ", " ", " ", " ", 0, 0, 0, 0, 0, 0));

        LOG.info("Finalizando test datosVacios");
    }

    @Test
    public void edadNegativa() {
        LOG.info("Iniciado test edadNegativa");

        assertThrows(Throwable.class, ()-> new Estudiante("1234", "Julio Cesar", "Lopez lopez", "jc@gmail.com", "93736363", -24, 2.1, 3.0, 1.8, 4.0,2.9));

        LOG.info("Finalizando test edadNegativa");
    }

    @Test
    public void validacionCorreo() {
        LOG.info("Iniciado test validacionCorreo");

        assertThrows(Throwable.class, ()-> new Estudiante("1234", "Julio Cesar", "Lopez lopez", "jc", "93736363", 24, 2.1, 3.0, 1.8, 4.0,2.9));

        LOG.info("Finalizando test validacionCorreo");
    }
}
