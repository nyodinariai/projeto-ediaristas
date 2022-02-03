package com.example.nathan.ediaristas.web.services;

import java.util.List;

import com.example.nathan.ediaristas.core.exceptions.ServicoNaoEncontradoException;
import com.example.nathan.ediaristas.core.models.Servico;
import com.example.nathan.ediaristas.core.repository.ServicoRepository;
import com.example.nathan.ediaristas.web.dtos.ServicoForm;
import com.example.nathan.ediaristas.web.mappers.WebServicoMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class WebServicoService {
    
    @Autowired
    private ServicoRepository servicoRepository;

    @Autowired
    private WebServicoMapper mapper;

    public List<Servico> buscarTodos(){
        return servicoRepository.findAll();
    }

    public Servico cadastrar(ServicoForm form){
        var model = mapper.toModel(form);

        return servicoRepository.save(model);
    }

    public Servico buscarPorId(Long id){
        var servicoEncontrado = servicoRepository.findById(id);

        if(servicoEncontrado.isPresent()){
            return servicoEncontrado.get();
        }

        var mensagem =String.format("Servico com ID %d não encontrado", id);

        throw new ServicoNaoEncontradoException(mensagem);
    }

    public Servico editar(ServicoForm form, Long id){
        var servicoEncontrado = buscarPorId(id);

        var model = mapper.toModel(form);
        model.setId(servicoEncontrado.getId());

        return servicoRepository.save(model);
    }

    public void excluirPorId(Long id){
        var servicoEncontrado = buscarPorId(id);

        servicoRepository.delete(servicoEncontrado);
    }
}
