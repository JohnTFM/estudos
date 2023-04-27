package joao.jpaLearn.controllers;

import jakarta.transaction.Transactional;
import joao.jpaLearn.entity.Cliente;
import joao.jpaLearn.records.ClienteDados;
import joao.jpaLearn.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("crud")
public class CrudControllerRec {

    @Autowired
    public ClienteRepository clienteRepository;

    @PostMapping("salvar")
    public String salvarCliente(@RequestBody ClienteDados clienteDados){
        Cliente cliente = new Cliente(clienteDados);
        this.clienteRepository.save(cliente);
        return "true";
    }

    @PostMapping("salvarEmLote")
    public String salvarClienteList(@RequestBody List<ClienteDados> clienteDados){
        for (ClienteDados clienteDado : clienteDados) {
            clienteRepository.save(new Cliente(clienteDado));
        }
        return "true";
    }


    @Transactional
    @PostMapping("atualizar")
    public void atualizarCliente(@RequestBody ClienteDados clienteDados){
       Cliente cliente = clienteRepository.procurarPeloId(clienteDados.id());
       cliente.atualizar(clienteDados);
    }

    @Transactional
    @PostMapping("deletar")
    public void deletarCliente(@RequestBody ClienteDados clienteDados){

        clienteRepository.deleteById(clienteDados.id());

    }


    @GetMapping
    public Cliente lerCliente(@RequestParam("id") Long id){

        return clienteRepository.procurarPeloId(id);
    }



}
