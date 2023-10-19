package dio.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dio.domain.model.Imovel;
import dio.service.ImovelService;

@RestController
@RequestMapping("/users")
public class ImovelController {
    
    private final ImovelService imovelService;

    public ImovelController(ImovelService imovelService){
        this.imovelService = imovelService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        var imovel = imovelService.findById(id);
        return ResponseEntity.ok(imovel);
    }


    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Imovel imovelToCreate){
        var imovelCreated = imovelService.create(imovelToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}") 
        .buildAndExpand(((Imovel) imovelCreated).getId())
        .toUri();
        return ResponseEntity.created(location).body(imovelCreated);
    }
}
