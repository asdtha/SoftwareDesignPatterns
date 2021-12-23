package com.example.Paciente.Controller;
import com.example.Paciente.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {
    Paciente p=new Paciente("Pepe", "Perez", "Ayacucho 6534");

    @GetMapping("/index")
    public String welcome(Model model) {
        model.addAttribute("titulo", "Los datos del paciente son: ");
        model.addAttribute("nombre", p.getNombre());
        model.addAttribute("apellido", p.getApellido());
        model.addAttribute("direccion", p.getDireccion());

        return "index";
    }

}
