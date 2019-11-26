package br.edu.unisep.jobsmanager.domain.usecase.job;

import br.edu.unisep.jobsmanager.domain.builder.JobBuilder;
import br.edu.unisep.jobsmanager.domain.dto.job.NewJobDto;
import br.edu.unisep.jobsmanager.model.repository.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewJobUseCase {

    private JobRepository jobRepository;

    public void execute(NewJobDto newJob) {
        var job = JobBuilder.fromNewJobDto(newJob);
        jobRepository.save(job);
    }
}
