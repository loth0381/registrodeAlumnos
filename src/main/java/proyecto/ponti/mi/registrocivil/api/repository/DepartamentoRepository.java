package proyecto.ponti.mi.registrocivil.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.mi.registrocivil.api.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
