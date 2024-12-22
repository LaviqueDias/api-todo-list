package br.com.laviquedias.api_todo_list.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_todo")

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_todo;

    @Column(nullable = false)
    private String nome_todo;
    
    @Column(nullable = false)
    private String descricao_todo;
    
    @Column(nullable = false)
    private boolean realizado_todo;
    
    @Column(nullable = false)
    private int prioridade_todo;

}
