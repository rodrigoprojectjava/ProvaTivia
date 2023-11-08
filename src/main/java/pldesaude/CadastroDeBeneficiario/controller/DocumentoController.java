package pldesaude.CadastroDeBeneficiario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pldesaude.CadastroDeBeneficiario.entity.Documento;
import pldesaude.CadastroDeBeneficiario.repository.DocumentoRepository;

import java.util.List;

@RestController
@RequestMapping("api/documentos")
public class DocumentoController {

    @Autowired
    private DocumentoRepository documentoRepository;

    @GetMapping
    public List<Documento> listaDocumentos() {
        return documentoRepository.findAll();
    }

    @PostMapping
    public Documento criarDocumento(@RequestBody Documento documento){
        return documentoRepository.save(documento);
    }
}
