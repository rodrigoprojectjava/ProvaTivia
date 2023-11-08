package pldesaude.CadastroDeBeneficiario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pldesaude.CadastroDeBeneficiario.entity.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
