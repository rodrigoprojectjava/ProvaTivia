package pldesaude.CadastroDeBeneficiario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pldesaude.CadastroDeBeneficiario.entity.Beneficiario;
import pldesaude.CadastroDeBeneficiario.repository.BeneficiarioRepository;

import java.util.List;

@RestController
@RequestMapping("api/beneficiarios")
public class BeneficiarioController {
    @Autowired
    private BeneficiarioRepository beneficiarioRepository;

    @GetMapping
    public List<Beneficiario> listarBeneficiarios(){
        return beneficiarioRepository.findAll();
    }
    @PostMapping
    public Beneficiario criarBeneficiario(@RequestBody Beneficiario beneficiario){
        return beneficiarioRepository.save(beneficiario);
    }

}
