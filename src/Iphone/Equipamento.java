package Iphone;

public class Equipamento {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    //Reprodutor Musical
    System.out.println("Reprodutor Musical");
    System.out.println(iphone.tocar());
    System.out.println(iphone.pausar());
    System.out.println(iphone.selecionarMusica());

    //Aparelho Telefônico
    System.out.println("Aparelho Telefônico");
    System.out.println(iphone.ligar());
    System.out.println(iphone.atender());
    System.out.println(iphone.iniciarCorreioVoz());

    //Navegador na Internet
    System.out.println("Navegador na Internet");
    System.out.println(iphone.exibirPagina());
    System.out.println(iphone.adicionarNovaAba());
    System.out.println(iphone.atualizarPagina());
  }
}
