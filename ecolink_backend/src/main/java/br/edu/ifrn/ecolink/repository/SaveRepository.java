package br.edu.ifrn.ecolink.repository;

import br.edu.ifrn.ecolink.model.Save;
import br.edu.ifrn.ecolink.model.SaveId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SaveRepository extends JpaRepository<Save, Long> {
    void deleteById(SaveId id);

    Optional<Save> findById(SaveId id);
}
