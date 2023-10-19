package dio.service;

import dio.domain.model.Imovel;

public interface ImovelService {

    Object findById(Long id);

    Object create(Imovel imovelToCreate);
    
    
}
