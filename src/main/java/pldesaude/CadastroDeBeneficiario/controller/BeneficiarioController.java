package pldesaude.CadastroDeBeneficiario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pldesaude.CadastroDeBeneficiario.entity.Beneficiario;
import pldesaude.CadastroDeBeneficiario.entity.Documento;
import pldesaude.CadastroDeBeneficiario.repository.BeneficiarioRepository;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{beneficiarioId}/documentos")
    public List<Documento>listarDocumentoDoBeneficiario(@PathVariable long beneficiarioId){
        Optional<Beneficiario> beneficiarioOptional = beneficiarioRepository.findById(beneficiarioId);

        if (beneficiarioOptional.isPresent()){
            Beneficiario beneficiario = beneficiarioOptional.get();
            return beneficiario.getDocumentos();
        } else {
            throw  new BeneficiarioNotFoundException ("Beneficiário não encontrado com ID: " + beneficiarioId);
        }
    }

}
