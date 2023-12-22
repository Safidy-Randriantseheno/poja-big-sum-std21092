package com.poja.poja_big_sum_std21092.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {
    @GetMapping("/big-sum")
    public String calculateBigSum(@RequestParam String a, @RequestParam String b) {
        try {
            // Convertir les paramètres de la requête en BigInteger
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);

            // Effectuer la somme
            BigInteger result = bigA.add(bigB);

            // Renvoyer le résultat au format String
            return result.toString();
        } catch (NumberFormatException e) {
            // Gérer les erreurs de conversion des paramètres
            return "Veuillez fournir des nombres valides.";
        }
    }
}
