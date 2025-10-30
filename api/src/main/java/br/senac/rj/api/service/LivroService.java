package br.senac.rj.api.service;

import br.senac.rj.api.exceptions.ResourceNotFoundException;
import br.senac.rj.api.model.Livro;
import br.senac.rj.api.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    public LivroService(LivroRepository livroRepository) { this.livroRepository = livroRepository;}

    public List<Livro> listarLivros() {
        List<Livro> livro = this.livroRepository.findAll();
        if (livro.isEmpty()) {
            throw new ResourceNotFoundException("Livro não encontrado!");
        }

        return livro;
    }
    //abcddefghikjslaladygaga
    public Livro incluirLivro(Livro livro) {

        return this.livroRepository.save(livro);}

    public Livro buscarLivroPorCodigo(Long codigo) {
        String mensagem = "Livro com o codigo [" + codigo + "] nao encontrado";
        Optional<Livro> livro = this.livroRepository.findById(codigo);
        if (livro.isEmpty()) {
            throw new ResourceNotFoundException(mensagem);
        }

        Livro l = livro.get();
        return l;
    }

    public void excluirLivro(Long codigo) {
        this.livroRepository.deleteById(codigo);
    }

    public Livro atualizarLivro(Long codigo, Livro livroAtualizado) {
        return null;
    }

}


