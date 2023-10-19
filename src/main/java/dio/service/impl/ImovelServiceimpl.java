package dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.domain.model.Imovel;
import dio.domain.repository.ImovelRepository;
import dio.service.ImovelService;

@Service
public class ImovelServiceimpl implements ImovelService{
    
    private final ImovelRepository imovelRepository;

    public ImovelServiceimpl(ImovelRepository imovelRepository){
        this.imovelRepository = imovelRepository;
    }

    @Override
    public Imovel findById(Long id){
        return imovelRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    
    public Imovel create(Imovel imovelToCreate){
        if (ImovelRepository.getId() != null && imovelRepository.existsById(imovelToCreate.getId())){
            throw new IllegalArgumentException("ID já existe");
        }
        return null;
    }
}
