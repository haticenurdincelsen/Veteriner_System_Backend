package haticenur.dincel.proje.dto.request;

import haticenur.dincel.proje.entity.Doctor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AvailableDateRequestDto {

    private LocalDate availableDate;
    private Doctor doctor;
}