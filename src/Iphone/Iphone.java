package Iphone;

import Iphone.Interfaces.AparelhoTelefonico;
import Iphone.Interfaces.NavegadorNaInternet;
import Iphone.Interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

  @Override
  public String ligar() {
    return "Ligando...";
  }

  @Override
  public String atender() {
    return "Atendeu!";
  }

  @Override
  public String iniciarCorreioVoz() {
    return "Iniciou o correio de voz.";
  }

  @Override
  public String tocar() {
    return "Tocando";
  }

  @Override
  public String pausar() {
    return "Pausou!";
  }

  @Override
  public String selecionarMusica() {
    return "Selecionar a música.";
  }

  @Override
  public String exibirPagina() {
    return "Exibir a página.";
  }

  @Override
  public String adicionarNovaAba() {
    return "Adicionar uma nova aba.";
  }

  @Override
  public String atualizarPagina() {
    return "Atualizar a página";
  } 
}
