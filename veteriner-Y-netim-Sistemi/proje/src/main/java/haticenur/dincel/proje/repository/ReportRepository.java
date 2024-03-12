package haticenur.dincel.proje.repository;

import haticenur.dincel.proje.entity.Report;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long> {
    Optional<Report> findByAppointmentId(Long appointmenId);
}