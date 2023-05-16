package br.com.alunocrud.provaa1.repository;

import br.com.alunocrud.provaa1.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>
{

}
