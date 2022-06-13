package its.esercizio;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class Controllore {
        @GetMapping("/somma")
        public String Somma(@RequestParam("valore") int val1, @RequestParam("valore2") int val2, Model model) {
            int somma = val1 + val2;
            model.addAttribute("risultato", somma);
            return "result";
        }
        @GetMapping("/sottrazione")
        public String Sottrazione(@RequestParam("valore") int val1, @RequestParam("valore2") int val2, Model model) {
            int differenza = val1 - val2;
            model.addAttribute("risultato", differenza);
            return "result";
        }
        @GetMapping("/moltiplicazione")
        public String Moltiplicazione(@RequestParam("valore") int val1, @RequestParam("valore2") int val2, Model model) {
            int prodotto = val1 * val2;
            model.addAttribute("risultato", prodotto);
            return "result";
        }


    }

