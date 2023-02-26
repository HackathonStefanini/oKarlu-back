package com.stefanini.dto;

import com.stefanini.entity.Jogador;
import com.stefanini.entity.Stefamon;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

public class JogadorDTO {

    private Long id;

    @NotBlank
    private String nickname;

    @Size(min = 4, max = 10)
    private String password;

    @NotBlank
    private BigDecimal saldo;
    private List<Stefamon> stefamon;

    public JogadorDTO(Jogador jogador) {
        this.id = jogador.getId();
        this.nickname = jogador.getNickname();
        this.password = jogador.getPassword();
        this.saldo = jogador.getSaldo();
        this.stefamon = jogador.getStefamons();
    }

    public JogadorDTO () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public List<Stefamon> getStefamon() {
        return stefamon;
    }

    public void setStefamon(List<Stefamon> stefamon) {
        this.stefamon = stefamon;
    }
}