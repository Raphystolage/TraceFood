package hr.algebra.tracefood.backend.classicdb.repository;

import hr.algebra.tracefood.backend.classicdb.model.HoReCa;
import hr.algebra.tracefood.backend.classicdb.model.Processor;
import hr.algebra.tracefood.backend.classicdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoReCaRepository extends JpaRepository<HoReCa, Long> {

    public HoReCa getByUser(User user);

}
