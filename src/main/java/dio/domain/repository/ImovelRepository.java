package dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.domain.model.Imovel;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {

    static Object getId() {
        return null;
    }
    
}
