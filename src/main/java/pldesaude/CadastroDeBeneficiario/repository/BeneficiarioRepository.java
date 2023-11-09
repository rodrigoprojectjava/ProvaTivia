package pldesaude.CadastroDeBeneficiario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pldesaude.CadastroDeBeneficiario.entity.Beneficiario;


@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
}
