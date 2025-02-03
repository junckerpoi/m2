package m2.drivingschool.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CashierController {
    @GetMapping("/cashier")
    public String adminPage() {
        return "cashier/cashier";
    }
}
