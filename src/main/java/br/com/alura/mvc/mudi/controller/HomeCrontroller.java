package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeCrontroller {

    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = Pedido.build();

        List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido, pedido);

        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
