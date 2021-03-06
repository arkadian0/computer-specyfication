package com.cp.domain.computerparameters;

import com.cp.client.transfer.ComputerInfoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
interface ComputerParametersRepository extends Repository<ComputerParameters, Integer>, JpaRepository<ComputerParameters,Integer> {


    Optional<ComputerParameters> findFirstByComputerNameOrderByGenerationDateDesc(String ipAddress);

    Optional<ComputerParameters> findByComputerId(Integer computerId);

    @Query("SELECT p FROM ComputerParameters p group by p.computerName")
    Optional<Collection<ComputerParameters>> findAllComputersGroupByComputerName();

    //Sztuka pod zdalna baze danych
    List<ComputerParameters> findAll();

    @Query("SELECT new com.cp.client.transfer.ComputerInfoDTO(p.computerId,p.computerName, p.ipAddress,p.generationDate) FROM ComputerParameters p where p.computerName= :computerName")
    List<ComputerInfoDTO> findAllComputersByComputerName(String computerName);

}