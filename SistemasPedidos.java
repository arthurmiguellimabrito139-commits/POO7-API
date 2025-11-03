package poo.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.util.ArrayList;

@SpringBootApplication
@RestController
class SistemaPedidos {
    public static void main(String[] args) {
        SpringApplication.run(SistemaPedidos.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {return String.format("Hello %s!", name);}

    @GetMapping("/produtos")
    public List<Produto> produtos(){
        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("produtos.csv"))) {
            String linha = br.readLine();

            while ((linha = br.readLine()) != null) {

                String[] colunas = linha.split(",");
                String id = colunas[0];
                String nome = colunas[1];
                double preco = Double.parseDouble(colunas[2]);
                String descricao = colunas[3];
                int estoque = Integer.parseInt(colunas[4]);

                Produto p = new Produto(id, nome, preco, descricao, estoque);

                produtos.add(p);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
        return produtos;
    }
}
