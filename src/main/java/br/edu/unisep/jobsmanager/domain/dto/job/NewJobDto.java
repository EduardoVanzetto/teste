package br.edu.unisep.jobsmanager.domain.dto.job;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NewJobDto {

    private String title;

    private String description;

    private Double salary;

    private Integer vacancies;

    private LocalDate availableFrom;

    private LocalDate availableUntil;

    private Integer companyId;

}
